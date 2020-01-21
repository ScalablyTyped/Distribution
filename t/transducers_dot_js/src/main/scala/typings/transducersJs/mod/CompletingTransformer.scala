package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletingTransformer[TResult, TCompleteResult, TInput] extends js.Object {
  @JSName("@@transducer/init")
  def `@@transducerSlashinit`(): TResult | Unit
  @JSName("@@transducer/result")
  def `@@transducerSlashresult`(result: TResult): TCompleteResult
  @JSName("@@transducer/step")
  def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced[TResult]
}

object CompletingTransformer {
  @scala.inline
  def apply[TResult, TCompleteResult, TInput](
    `@@transducerSlashinit`: () => TResult | Unit,
    `@@transducerSlashresult`: TResult => TCompleteResult,
    `@@transducerSlashstep`: (TResult, TInput) => TResult | Reduced[TResult]
  ): CompletingTransformer[TResult, TCompleteResult, TInput] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/init")(js.Any.fromFunction0(`@@transducerSlashinit`))
    __obj.updateDynamic("@@transducer/result")(js.Any.fromFunction1(`@@transducerSlashresult`))
    __obj.updateDynamic("@@transducer/step")(js.Any.fromFunction2(`@@transducerSlashstep`))
    __obj.asInstanceOf[CompletingTransformer[TResult, TCompleteResult, TInput]]
  }
}

