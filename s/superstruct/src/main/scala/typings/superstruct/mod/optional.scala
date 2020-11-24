package typings.superstruct.mod

import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "optional")
@js.native
object optional extends js.Object {
  
  def apply[T](S: Struct[T, _]): Struct[js.UndefOr[T], _] = js.native
}
