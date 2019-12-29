package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "Map")
@js.native
class Map[TResult, TInput, TOutput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(f: js.Function1[/* x */ TInput, TOutput], xf: Transformer[TResult, TOutput]) = this()
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

@JSImport("transducers-js", "map")
@js.native
object map extends js.Object {
  def apply[TInput, TOutput](f: js.Function1[/* x */ TInput, TOutput]): Transducer[TInput, TOutput] = js.native
}

