package typings.superstruct.mod

import org.scalablytyped.runtime.TopLevel
import typings.superstruct.structMod.Struct
import typings.superstruct.utilsMod.StructRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "type")
@js.native
object `type` extends js.Object {
  def apply[V /* <: StructRecord[_] */](Structs: V): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`type` with TopLevel[V], 
    _
  ] = js.native
}

