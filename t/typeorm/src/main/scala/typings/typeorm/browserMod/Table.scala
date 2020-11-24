package typings.typeorm.browserMod

import typings.typeorm.driverMod.Driver
import typings.typeorm.tableOptionsMod.TableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Table")
@js.native
class Table ()
  extends typings.typeorm.tableMod.Table {
  def this(options: TableOptions) = this()
}
/* static members */
@JSImport("typeorm/browser", "Table")
@js.native
object Table extends js.Object {
  
  /**
    * Creates table from a given entity metadata.
    */
  def create(entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata, driver: Driver): typings.typeorm.tableMod.Table = js.native
}
