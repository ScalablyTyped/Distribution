package typings.typeorm.mod

import typings.typeorm.driverDriverMod.Driver
import typings.typeorm.optionsTableOptionsMod.TableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Table")
@js.native
class Table ()
  extends typings.typeorm.tableTableMod.Table {
  def this(options: TableOptions) = this()
}
/* static members */
object Table {
  
  @JSImport("typeorm", "Table")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates table from a given entity metadata.
    */
  @scala.inline
  def create(entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata, driver: Driver): typings.typeorm.tableTableMod.Table = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(entityMetadata.asInstanceOf[js.Any], driver.asInstanceOf[js.Any])).asInstanceOf[typings.typeorm.tableTableMod.Table]
}
