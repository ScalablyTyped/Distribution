package typings.typeorm.browserMod

import typings.typeorm.foreignKeyMetadataMod.ForeignKeyMetadata
import typings.typeorm.tableForeignKeyOptionsMod.TableForeignKeyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableForeignKey")
@js.native
class TableForeignKey protected ()
  extends typings.typeorm.tableForeignKeyMod.TableForeignKey {
  def this(options: TableForeignKeyOptions) = this()
}
/* static members */
object TableForeignKey {
  
  @JSImport("typeorm/browser", "TableForeignKey")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new table foreign key from the given foreign key metadata.
    */
  @scala.inline
  def create(metadata: ForeignKeyMetadata): typings.typeorm.tableForeignKeyMod.TableForeignKey = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(metadata.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.tableForeignKeyMod.TableForeignKey]
}
