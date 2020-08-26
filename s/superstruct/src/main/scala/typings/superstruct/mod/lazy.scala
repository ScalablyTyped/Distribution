package typings.superstruct.mod

import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "lazy")
@js.native
object `lazy` extends js.Object {
  def apply[T](fn: js.Function0[Struct[T, _]]): Struct[T, _] = js.native
}

