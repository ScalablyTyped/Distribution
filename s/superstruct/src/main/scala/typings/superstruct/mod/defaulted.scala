package typings.superstruct.mod

import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "defaulted")
@js.native
object defaulted extends js.Object {
  def apply[T](S: Struct[T, _], fallback: js.Any): Struct[T, _] = js.native
}

