package typings.typeorm.mod

import typings.typeorm.metadataIndexMetadataMod.IndexMetadata
import typings.typeorm.optionsTableIndexOptionsMod.TableIndexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableIndex")
@js.native
class TableIndex protected ()
  extends typings.typeorm.tableTableIndexMod.TableIndex {
  def this(options: TableIndexOptions) = this()
}
/* static members */
object TableIndex {
  
  @JSImport("typeorm", "TableIndex")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates index from the index metadata object.
    */
  @scala.inline
  def create(indexMetadata: IndexMetadata): typings.typeorm.tableTableIndexMod.TableIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(indexMetadata.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.tableTableIndexMod.TableIndex]
}
