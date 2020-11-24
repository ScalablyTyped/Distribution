package typings.typeorm

import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.driverMod.Driver
import typings.typeorm.tableColumnOptionsMod.TableColumnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/schema-builder/util/TableUtils", JSImport.Namespace)
@js.native
object tableUtilsMod extends js.Object {
  
  @js.native
  class TableUtils () extends js.Object
  /* static members */
  @js.native
  object TableUtils extends js.Object {
    
    def createTableColumnOptions(columnMetadata: ColumnMetadata, driver: Driver): TableColumnOptions = js.native
  }
}
