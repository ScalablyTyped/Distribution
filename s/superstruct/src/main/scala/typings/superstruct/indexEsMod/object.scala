package typings.superstruct.indexEsMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "object")
@js.native
object `object` extends js.Object {
  
  /**
    * Validate that an object with specific entry values.
    */
  def apply[V /* <: StructRecord[_] */](): Struct_[Record[String, _], _] = js.native
  def apply[V /* <: StructRecord[_] */](Structs: V): Struct_[
    OptionalizeObject[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`object` with TopLevel[V]
    ], 
    V
  ] = js.native
}
