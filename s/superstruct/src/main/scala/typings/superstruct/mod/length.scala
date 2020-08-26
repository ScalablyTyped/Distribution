package typings.superstruct.mod

import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "length")
@js.native
object length extends js.Object {
  def apply[T /* <: String | js.Array[_] */](S: Struct[T, _], min: Double, max: Double): Struct[T, _] = js.native
}

