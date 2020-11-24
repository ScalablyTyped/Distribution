package typings.superstruct.indexEsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "record")
@js.native
object record extends js.Object {
  
  /**
    * Validate that a value is a record with specific key and
    * value entries.
    */
  def apply[K /* <: String | Double */, V](Key: Struct_[K, _], Value: Struct_[V, _]): Struct_[Record[K, V], _] = js.native
}
