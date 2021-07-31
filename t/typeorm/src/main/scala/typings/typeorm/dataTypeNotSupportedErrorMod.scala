package typings.typeorm

import typings.std.Error
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.columnTypesMod.ColumnType
import typings.typeorm.databaseTypeMod.DatabaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTypeNotSupportedErrorMod {
  
  @JSImport("typeorm/browser/error/DataTypeNotSupportedError", "DataTypeNotSupportedError")
  @js.native
  class DataTypeNotSupportedError protected ()
    extends StObject
       with Error {
    def this(column: ColumnMetadata, dataType: ColumnType) = this()
    def this(column: ColumnMetadata, dataType: ColumnType, database: DatabaseType) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
