package typings.typeorm.mod

import typings.typeorm.driverDriverMod.Driver
import typings.typeorm.optionsTableOptionsMod.TableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Table")
@js.native
class Table ()
  extends typings.typeorm.tableTableMod.Table {
  def this(options: TableOptions) = this()
}
/* static members */
object Table {
  
  /**
    * Creates table from a given entity metadata.
    */
  @JSImport("typeorm", "Table.create")
  @js.native
  def create(entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata, driver: Driver): typings.typeorm.tableTableMod.Table = js.native
}
