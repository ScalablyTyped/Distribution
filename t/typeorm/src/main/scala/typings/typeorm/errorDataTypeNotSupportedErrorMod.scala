package typings.typeorm

import typings.std.Error
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.typesColumnTypesMod.ColumnType
import typings.typeorm.typesDatabaseTypeMod.DatabaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorDataTypeNotSupportedErrorMod {
  
  @JSImport("typeorm/error/DataTypeNotSupportedError", "DataTypeNotSupportedError")
  @js.native
  class DataTypeNotSupportedError protected () extends Error {
    def this(column: ColumnMetadata, dataType: ColumnType) = this()
    def this(column: ColumnMetadata, dataType: ColumnType, database: DatabaseType) = this()
  }
}
