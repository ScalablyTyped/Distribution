package typings.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object columnTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeorm.columnTypesMod.WithPrecisionColumnType
    - typings.typeorm.columnTypesMod.WithLengthColumnType
    - typings.typeorm.columnTypesMod.WithWidthColumnType
    - typings.typeorm.columnTypesMod.SpatialColumnType
    - typings.typeorm.columnTypesMod.SimpleColumnType
    - typings.std.BooleanConstructor
    - typings.std.DateConstructor
    - typings.std.NumberConstructor
    - typings.std.StringConstructor
  */
  type ColumnType = typings.typeorm.columnTypesMod._ColumnType | typings.std.BooleanConstructor | typings.std.DateConstructor | typings.std.NumberConstructor | typings.std.StringConstructor
}
