package typings.superstruct.indexEsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.es", "type")
@js.native
object `type` extends js.Object {
  /**
    * Validate that a value matches a specific strutural interface, like the
    * structural typing that TypeScript uses.
    */
  def apply[V /* <: StructRecord[_] */](Structs: V): Struct_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`type` with TopLevel[V], 
    _
  ] = js.native
}

