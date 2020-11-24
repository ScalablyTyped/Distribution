package typings.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "is")
@js.native
object is extends js.Object {
  
  /**
    * Check if a value passes a `Struct`.
    */
  def apply[T](value: js.Any, struct: Struct_[T, _]): /* is T */ Boolean = js.native
}
