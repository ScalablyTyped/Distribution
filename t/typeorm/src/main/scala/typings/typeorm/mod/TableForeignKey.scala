package typings.typeorm.mod

import typings.typeorm.metadataForeignKeyMetadataMod.ForeignKeyMetadata
import typings.typeorm.optionsTableForeignKeyOptionsMod.TableForeignKeyOptions
import org.scalablytyped.runtime.StObject
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
object TableForeignKey {
  
  /**
    * Creates a new table foreign key from the given foreign key metadata.
    */
  @JSImport("typeorm", "TableForeignKey.create")
  @js.native
  def create(metadata: ForeignKeyMetadata): typings.typeorm.tableTableForeignKeyMod.TableForeignKey = js.native
}
