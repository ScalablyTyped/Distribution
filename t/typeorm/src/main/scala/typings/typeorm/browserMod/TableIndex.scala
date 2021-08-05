package typings.typeorm.browserMod

import typings.typeorm.indexMetadataMod.IndexMetadata
import typings.typeorm.tableIndexOptionsMod.TableIndexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableIndex")
@js.native
class TableIndex protected ()
  extends typings.typeorm.tableIndexMod.TableIndex {
  def this(options: TableIndexOptions) = this()
}
/* static members */
object TableIndex {
  
  @JSImport("typeorm/browser", "TableIndex")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates index from the index metadata object.
    */
  inline def create(indexMetadata: IndexMetadata): typings.typeorm.tableIndexMod.TableIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(indexMetadata.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.tableIndexMod.TableIndex]
}
