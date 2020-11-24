package typings.superstruct.indexCjsMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.cjs", "map")
@js.native
object map extends js.Object {
  
  /**
    * Validate that a value is a map with specific key and value entries.
    */
  def apply[K, V](Key: Struct_[K, _], Value: Struct_[V, _]): Struct_[Map[K, V], _] = js.native
}
