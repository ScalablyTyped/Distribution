package typings.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "nullable")
@js.native
object nullable extends js.Object {
  
  /**
    * Augment a struct to make it accept `null` values.
    */
  def apply[T](S: Struct_[T, _]): Struct_[T | Null, _] = js.native
}
