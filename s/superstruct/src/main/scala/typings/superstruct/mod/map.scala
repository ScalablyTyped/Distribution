package typings.superstruct.mod

import typings.std.Map
import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "map")
@js.native
object map extends js.Object {
  
  def apply[K, V](Key: Struct[K, _], Value: Struct[V, _]): Struct[Map[K, V], _] = js.native
}
