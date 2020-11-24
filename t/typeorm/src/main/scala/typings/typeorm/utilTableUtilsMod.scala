package typings.typeorm

import typings.typeorm.driverDriverMod.Driver
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.optionsTableColumnOptionsMod.TableColumnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/schema-builder/util/TableUtils", JSImport.Namespace)
@js.native
object utilTableUtilsMod extends js.Object {
  
  @js.native
  class TableUtils () extends js.Object
  /* static members */
  @js.native
  object TableUtils extends js.Object {
    
    def createTableColumnOptions(columnMetadata: ColumnMetadata, driver: Driver): TableColumnOptions = js.native
  }
}
