package typings.typeorm.browserMod

import typings.typeorm.foreignKeyMetadataMod.ForeignKeyMetadata
import typings.typeorm.tableForeignKeyOptionsMod.TableForeignKeyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableForeignKey")
@js.native
class TableForeignKey protected ()
  extends typings.typeorm.tableForeignKeyMod.TableForeignKey {
  def this(options: TableForeignKeyOptions) = this()
}
/* static members */
@JSImport("typeorm/browser", "TableForeignKey")
@js.native
object TableForeignKey extends js.Object {
  
  /**
    * Creates a new table foreign key from the given foreign key metadata.
    */
  def create(metadata: ForeignKeyMetadata): typings.typeorm.tableForeignKeyMod.TableForeignKey = js.native
}
