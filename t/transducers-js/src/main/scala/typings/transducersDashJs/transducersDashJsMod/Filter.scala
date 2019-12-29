package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "Filter")
@js.native
class Filter[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(pred: js.Function1[/* x */ TInput, Boolean], xf: Transformer[TResult, TInput]) = this()
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

@JSImport("transducers-js", "filter")
@js.native
object filter extends js.Object {
  def apply[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
}

