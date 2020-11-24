package typings.superstruct.mod

import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "array")
@js.native
object array extends js.Object {
  
  def apply(): Struct[js.Array[_], _] = js.native
  def apply[T](Element: Struct[T, _]): Struct[js.Array[T], Struct[T, _]] = js.native
}
