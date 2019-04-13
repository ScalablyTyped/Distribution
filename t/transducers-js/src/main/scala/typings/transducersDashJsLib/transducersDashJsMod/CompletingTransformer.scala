package typings
package transducersDashJsLib.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletingTransformer[TResult, TCompleteResult, TInput] extends js.Object {
  def `@@transducer/init`(): TResult | scala.Unit
  def `@@transducer/result`(result: TResult): TCompleteResult
  def `@@transducer/step`(result: TResult, input: TInput): TResult | Reduced[TResult]
}

object CompletingTransformer {
  @scala.inline
  def apply[TResult, TCompleteResult, TInput](
    `@@transducer/init`: () => TResult | scala.Unit,
    `@@transducer/result`: TResult => TCompleteResult,
    `@@transducer/step`: (TResult, TInput) => TResult | Reduced[TResult]
  ): CompletingTransformer[TResult, TCompleteResult, TInput] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/init")(js.Any.fromFunction0(`@@transducer/init`))
    __obj.updateDynamic("@@transducer/result")(js.Any.fromFunction1(`@@transducer/result`))
    __obj.updateDynamic("@@transducer/step")(js.Any.fromFunction2(`@@transducer/step`))
    __obj.asInstanceOf[CompletingTransformer[TResult, TCompleteResult, TInput]]
  }
}

