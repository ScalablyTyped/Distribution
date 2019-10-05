package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "TakeWhile")
@js.native
class TakeWhile[TResult, TInput] protected () extends Transformer[TResult, TInput] {
  def this(pred: js.Function1[/* n */ TInput, Boolean], xf: Transformer[TResult, TInput]) = this()
  /* CompleteClass */
  override def `@@transducer/init`(): TResult | Unit = js.native
  /* CompleteClass */
  override def `@@transducer/result`(result: TResult): TResult = js.native
  /* CompleteClass */
  override def `@@transducer/step`(result: TResult, input: TInput): TResult | Reduced[TResult] = js.native
}

@JSImport("transducers-js", "takeWhile")
@js.native
object takeWhile extends js.Object {
  def apply[TInput](pred: js.Function1[/* n */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
}

