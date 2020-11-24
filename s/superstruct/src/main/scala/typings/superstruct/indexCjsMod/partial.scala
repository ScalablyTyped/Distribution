package typings.superstruct.indexCjsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.cjs", "partial")
@js.native
object partial extends js.Object {
  
  /**
    * Validate that a partial object with specific entry values.
    */
  def apply[T, V /* <: StructRecord[_] */](Structs: V): Struct_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/index.cjs.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial with TopLevel[V], 
    _
  ] = js.native
  def apply[T, V /* <: StructRecord[_] */](Structs: Struct_[T, V]): Struct_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/index.cjs.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial with TopLevel[V], 
    _
  ] = js.native
}
