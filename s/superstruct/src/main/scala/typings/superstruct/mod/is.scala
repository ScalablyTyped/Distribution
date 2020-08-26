package typings.superstruct.mod

import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "is")
@js.native
object is extends js.Object {
  def apply[T](value: js.Any, struct: Struct[T, _]): /* is T */ Boolean = js.native
}

