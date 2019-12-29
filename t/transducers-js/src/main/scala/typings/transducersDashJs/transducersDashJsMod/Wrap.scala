package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "Wrap")
@js.native
class Wrap[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(stepFn: Reducer[TResult, TInput]) = this()
  /* CompleteClass */
  @JSName("@@transducer/init")
  override def `@@transducerSlashinit`(): TResult | Unit = js.native
  /* CompleteClass */
  @JSName("@@transducer/result")
  override def `@@transducerSlashresult`(result: TResult): TResult = js.native
  /* CompleteClass */
  @JSName("@@transducer/step")
  override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced[TResult] = js.native
}

@JSImport("transducers-js", "wrap")
@js.native
object wrap extends js.Object {
  def apply[TResult, TInput](stepFn: Reducer[TResult, TInput]): Transformer[TResult, TInput] = js.native
}

