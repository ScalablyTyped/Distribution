package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "PartitionBy")
@js.native
class PartitionBy[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(f: js.Function1[/* input */ TInput, _], xf: Transformer[TResult, js.Array[TInput]]) = this()
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

@JSImport("transducers-js", "partitionBy")
@js.native
object partitionBy extends js.Object {
  def apply[TInput](f: js.Function1[/* input */ TInput, _]): Transducer[TInput, js.Array[TInput]] = js.native
}

