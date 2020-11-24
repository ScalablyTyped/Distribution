package typings.superstruct.mod

import typings.std.Record
import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "record")
@js.native
object record extends js.Object {
  
  def apply[K /* <: String | Double */, V](Key: Struct[K, _], Value: Struct[V, _]): Struct[Record[K, V], _] = js.native
}
