package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "transformer")
@js.native
object transformer extends js.Object {
  def apply[TResult, TInput](reducer: Reducer[TResult, TInput]): Transformer_[TResult, TInput] = js.native
}

