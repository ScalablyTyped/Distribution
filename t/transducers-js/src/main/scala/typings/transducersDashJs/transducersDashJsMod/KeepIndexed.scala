package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "KeepIndexed")
@js.native
class KeepIndexed[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(f: js.Function2[/* i */ Double, /* x */ TInput, _], xf: Transformer[TResult, TInput]) = this()
  /* CompleteClass */
  override def `@@transducer/init`(): TResult | Unit = js.native
  /* CompleteClass */
  override def `@@transducer/result`(result: TResult): TResult = js.native
  /* CompleteClass */
  override def `@@transducer/step`(result: TResult, input: TInput): TResult | Reduced[TResult] = js.native
}

@JSImport("transducers-js", "keepIndexed")
@js.native
object keepIndexed extends js.Object {
  def apply[TInput](f: js.Function2[/* i */ Double, /* x */ TInput, _]): Transducer[TInput, TInput] = js.native
}

