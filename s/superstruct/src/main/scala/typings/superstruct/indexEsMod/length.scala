package typings.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "length")
@js.native
object length extends js.Object {
  
  /**
    * Augment a string or array struct to constrain its length to being between a
    * minimum and maximum size.
    */
  def apply[T /* <: String | js.Array[_] */](S: Struct_[T, _], min: Double, max: Double): Struct_[T, _] = js.native
}
