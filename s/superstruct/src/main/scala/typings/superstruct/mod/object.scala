package typings.superstruct.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import typings.superstruct.libTypesMod.OptionalizeObject
import typings.superstruct.structMod.Struct
import typings.superstruct.utilsMod.StructRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "object")
@js.native
object `object` extends js.Object {
  
  def apply[V /* <: StructRecord[_] */](): Struct[Record[String, _], _] = js.native
  def apply[V /* <: StructRecord[_] */](Structs: V): Struct[
    OptionalizeObject[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`object` with TopLevel[V]
    ], 
    V
  ] = js.native
}
