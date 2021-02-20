package typings.typeorm.mod

import typings.typeorm.metadataIndexMetadataMod.IndexMetadata
import typings.typeorm.optionsTableIndexOptionsMod.TableIndexOptions
import org.scalablytyped.runtime.StObject
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
object TableIndex {
  
  /**
    * Creates index from the index metadata object.
    */
  @JSImport("typeorm", "TableIndex.create")
  @js.native
  def create(indexMetadata: IndexMetadata): typings.typeorm.tableTableIndexMod.TableIndex = js.native
}
