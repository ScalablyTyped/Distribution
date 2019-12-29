package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "TakeNth")
@js.native
class TakeNth[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(n: Double, xf: Transformer[TResult, TInput]) = this()
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

@JSImport("transducers-js", "takeNth")
@js.native
object takeNth extends js.Object {
  def apply[TInput](n: Double): Transducer[TInput, TInput] = js.native
}

