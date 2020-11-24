package typings.typeorm.mod

import typings.typeorm.metadataForeignKeyMetadataMod.ForeignKeyMetadata
import typings.typeorm.optionsTableForeignKeyOptionsMod.TableForeignKeyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableForeignKey")
@js.native
class TableForeignKey protected ()
  extends typings.typeorm.tableTableForeignKeyMod.TableForeignKey {
  def this(options: TableForeignKeyOptions) = this()
}
/* static members */
@JSImport("typeorm", "TableForeignKey")
@js.native
object TableForeignKey extends js.Object {
  
  /**
    * Creates a new table foreign key from the given foreign key metadata.
    */
  def create(metadata: ForeignKeyMetadata): typings.typeorm.tableTableForeignKeyMod.TableForeignKey = js.native
}
