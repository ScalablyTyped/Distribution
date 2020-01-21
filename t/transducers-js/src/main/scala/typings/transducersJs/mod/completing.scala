package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "completing")
@js.native
object completing extends js.Object {
  def apply[TResult, TCompleteResult, TInput](xf: Reducer[TResult, TInput], cf: js.Function1[/* result */ TResult, TCompleteResult]): CompletingTransformer[TResult, TCompleteResult, TInput] = js.native
  def apply[TResult, TCompleteResult, TInput](xf: Transformer[TResult, TInput], cf: js.Function1[/* result */ TResult, TCompleteResult]): CompletingTransformer[TResult, TCompleteResult, TInput] = js.native
}

