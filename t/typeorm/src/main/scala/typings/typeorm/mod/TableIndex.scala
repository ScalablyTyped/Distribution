package typings.typeorm.mod

import typings.typeorm.metadataIndexMetadataMod.IndexMetadata
import typings.typeorm.optionsTableIndexOptionsMod.TableIndexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableIndex")
@js.native
class TableIndex protected ()
  extends typings.typeorm.tableTableIndexMod.TableIndex {
  def this(options: TableIndexOptions) = this()
}
/* static members */
@JSImport("typeorm", "TableIndex")
@js.native
object TableIndex extends js.Object {
  
  /**
    * Creates index from the index metadata object.
    */
  def create(indexMetadata: IndexMetadata): typings.typeorm.tableTableIndexMod.TableIndex = js.native
}
