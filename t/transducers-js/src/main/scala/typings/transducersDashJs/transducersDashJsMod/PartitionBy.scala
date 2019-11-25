package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "PartitionBy")
@js.native
class PartitionBy[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(f: js.Function1[/* input */ TInput, _], xf: Transformer[TResult, js.Array[TInput]]) = this()
  /* CompleteClass */
  override def `@@transducer/init`(): TResult | Unit = js.native
  /* CompleteClass */
  override def `@@transducer/result`(result: TResult): TResult = js.native
  /* CompleteClass */
  override def `@@transducer/step`(result: TResult, input: TInput): TResult | Reduced[TResult] = js.native
}

@JSImport("transducers-js", "partitionBy")
@js.native
object partitionBy extends js.Object {
  def apply[TInput](f: js.Function1[/* input */ TInput, _]): Transducer[TInput, js.Array[TInput]] = js.native
}

