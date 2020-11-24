package typings.superstruct.structMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/struct", "coerce")
@js.native
object coerce extends js.Object {
  
  def apply[T](value: js.Any, struct: Struct[T, _]): T = js.native
}
