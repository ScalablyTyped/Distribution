package typings.superstruct.mod

import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "literal")
@js.native
object literal extends js.Object {
  def apply[T /* <: String */](constant: T): Struct[T, _] = js.native
}

