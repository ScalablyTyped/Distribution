package typings.typeorm.browserMod

import typings.typeorm.indexMetadataMod.IndexMetadata
import typings.typeorm.tableIndexOptionsMod.TableIndexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableIndex")
@js.native
class TableIndex protected ()
  extends typings.typeorm.tableIndexMod.TableIndex {
  def this(options: TableIndexOptions) = this()
}
/* static members */
object TableIndex {
  
  /**
    * Creates index from the index metadata object.
    */
  @JSImport("typeorm/browser", "TableIndex.create")
  @js.native
  def create(indexMetadata: IndexMetadata): typings.typeorm.tableIndexMod.TableIndex = js.native
}
