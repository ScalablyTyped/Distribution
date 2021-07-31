package typings.typeorm

import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.driverMod.Driver
import typings.typeorm.tableColumnOptionsMod.TableColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableUtilsMod {
  
  @JSImport("typeorm/browser/schema-builder/util/TableUtils", "TableUtils")
  @js.native
  class TableUtils () extends StObject
  /* static members */
  object TableUtils {
    
    @JSImport("typeorm/browser/schema-builder/util/TableUtils", "TableUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createTableColumnOptions(columnMetadata: ColumnMetadata, driver: Driver): TableColumnOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("createTableColumnOptions")(columnMetadata.asInstanceOf[js.Any], driver.asInstanceOf[js.Any])).asInstanceOf[TableColumnOptions]
  }
}
