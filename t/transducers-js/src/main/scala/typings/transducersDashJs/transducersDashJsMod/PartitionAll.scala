package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "PartitionAll")
@js.native
class PartitionAll[TResult, TInput] protected () extends Transformer[TResult, TInput] {
  def this(n: Double, xf: Transformer[TResult, js.Array[TInput]]) = this()
  /* CompleteClass */
  override def `@@transducer/init`(): TResult | Unit = js.native
  /* CompleteClass */
  override def `@@transducer/result`(result: TResult): TResult = js.native
  /* CompleteClass */
  override def `@@transducer/step`(result: TResult, input: TInput): TResult | Reduced[TResult] = js.native
}

@JSImport("transducers-js", "partitionAll")
@js.native
object partitionAll extends js.Object {
  def apply[TResult, TInput](n: Double): Transducer[TInput, js.Array[TInput]] = js.native
}

