package typings.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "array")
@js.native
object array extends js.Object {
  
  /**
    * Validate that an array of values of a specific type.
    */
  def apply(): Struct_[js.Array[_], _] = js.native
  def apply[T](Element: Struct_[T, _]): Struct_[js.Array[T], Struct_[T, _]] = js.native
}
