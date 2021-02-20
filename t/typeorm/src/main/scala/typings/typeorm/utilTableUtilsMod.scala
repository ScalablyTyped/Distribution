package typings.typeorm

import typings.typeorm.driverDriverMod.Driver
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.optionsTableColumnOptionsMod.TableColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilTableUtilsMod {
  
  @JSImport("typeorm/schema-builder/util/TableUtils", "TableUtils")
  @js.native
  class TableUtils () extends StObject
  /* static members */
  object TableUtils {
    
    @JSImport("typeorm/schema-builder/util/TableUtils", "TableUtils.createTableColumnOptions")
    @js.native
    def createTableColumnOptions(columnMetadata: ColumnMetadata, driver: Driver): TableColumnOptions = js.native
  }
}
