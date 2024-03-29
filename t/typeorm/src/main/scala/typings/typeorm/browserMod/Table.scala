package typings.typeorm.browserMod

import typings.typeorm.driverMod.Driver
import typings.typeorm.tableOptionsMod.TableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Table")
@js.native
class Table ()
  extends typings.typeorm.tableMod.Table {
  def this(options: TableOptions) = this()
}
/* static members */
object Table {
  
  @JSImport("typeorm/browser", "Table")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates table from a given entity metadata.
    */
  inline def create(entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata, driver: Driver): typings.typeorm.tableMod.Table = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(entityMetadata.asInstanceOf[js.Any], driver.asInstanceOf[js.Any])).asInstanceOf[typings.typeorm.tableMod.Table]
}
