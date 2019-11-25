package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "Wrap")
@js.native
class Wrap[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(stepFn: Reducer[TResult, TInput]) = this()
  /* CompleteClass */
  override def `@@transducer/init`(): TResult | Unit = js.native
  /* CompleteClass */
  override def `@@transducer/result`(result: TResult): TResult = js.native
  /* CompleteClass */
  override def `@@transducer/step`(result: TResult, input: TInput): TResult | Reduced[TResult] = js.native
}

@JSImport("transducers-js", "wrap")
@js.native
object wrap extends js.Object {
  def apply[TResult, TInput](stepFn: Reducer[TResult, TInput]): Transformer[TResult, TInput] = js.native
}

