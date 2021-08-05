package typings.typeorm.mod

import typings.typeorm.metadataForeignKeyMetadataMod.ForeignKeyMetadata
import typings.typeorm.optionsTableForeignKeyOptionsMod.TableForeignKeyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableForeignKey")
@js.native
class TableForeignKey protected ()
  extends typings.typeorm.tableTableForeignKeyMod.TableForeignKey {
  def this(options: TableForeignKeyOptions) = this()
}
/* static members */
object TableForeignKey {
  
  @JSImport("typeorm", "TableForeignKey")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new table foreign key from the given foreign key metadata.
    */
  inline def create(metadata: ForeignKeyMetadata): typings.typeorm.tableTableForeignKeyMod.TableForeignKey = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(metadata.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.tableTableForeignKeyMod.TableForeignKey]
}
