package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "wrap")
@js.native
object wrap extends js.Object {
  def apply[TResult, TInput](stepFn: Reducer[TResult, TInput]): Transformer[TResult, TInput] = js.native
}

