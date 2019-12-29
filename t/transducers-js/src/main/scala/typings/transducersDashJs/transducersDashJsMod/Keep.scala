package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "Keep")
@js.native
class Keep[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(f: js.Function1[/* x */ TInput, _], xf: Transformer[TResult, TInput]) = this()
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

@JSImport("transducers-js", "keep")
@js.native
object keep extends js.Object {
  def apply[TInput](f: js.Function1[/* x */ TInput, _]): Transducer[TInput, TInput] = js.native
}

