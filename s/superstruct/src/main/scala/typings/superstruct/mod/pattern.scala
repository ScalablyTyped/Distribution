package typings.superstruct.mod

import typings.std.RegExp
import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "pattern")
@js.native
object pattern extends js.Object {
  
  def apply[T /* <: String */](S: Struct[T, _], regexp: RegExp): Struct[T, _] = js.native
}
