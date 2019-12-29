package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "Completing")
@js.native
class Completing[TResult, TCompleteResult, TInput] protected () extends CompletingTransformer[TResult, TCompleteResult, TInput] {
  def this(cf: js.Function1[/* result */ TResult, TCompleteResult], xf: Transformer[TResult, TInput]) = this()
  /* CompleteClass */
  @JSName("@@transducer/init")
  override def `@@transducerSlashinit`(): TResult | Unit = js.native
  /* CompleteClass */
  @JSName("@@transducer/result")
  override def `@@transducerSlashresult`(result: TResult): TCompleteResult = js.native
  /* CompleteClass */
  @JSName("@@transducer/step")
  override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced[TResult] = js.native
}

@JSImport("transducers-js", "completing")
@js.native
object completing extends js.Object {
  def apply[TResult, TCompleteResult, TInput](xf: Reducer[TResult, TInput], cf: js.Function1[/* result */ TResult, TCompleteResult]): CompletingTransformer[TResult, TCompleteResult, TInput] = js.native
  def apply[TResult, TCompleteResult, TInput](xf: Transformer[TResult, TInput], cf: js.Function1[/* result */ TResult, TCompleteResult]): CompletingTransformer[TResult, TCompleteResult, TInput] = js.native
}

