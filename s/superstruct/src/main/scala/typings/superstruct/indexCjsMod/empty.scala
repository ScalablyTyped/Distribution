package typings.superstruct.indexCjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.cjs", "empty")
@js.native
object empty extends js.Object {
  
  /**
    * Augment a string or array struct to constrain its length to zero.
    */
  def apply[T /* <: String | js.Array[_] */](S: Struct_[T, _]): Struct_[T, _] = js.native
}
