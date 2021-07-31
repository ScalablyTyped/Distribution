package typings.typeorm.browserMod

import typings.typeorm.tableUniqueOptionsMod.TableUniqueOptions
import typings.typeorm.uniqueMetadataMod.UniqueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableUnique")
@js.native
class TableUnique protected ()
  extends typings.typeorm.tableUniqueMod.TableUnique {
  def this(options: TableUniqueOptions) = this()
}
/* static members */
object TableUnique {
  
  @JSImport("typeorm/browser", "TableUnique")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates unique from the unique metadata object.
    */
  @scala.inline
  def create(uniqueMetadata: UniqueMetadata): typings.typeorm.tableUniqueMod.TableUnique = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uniqueMetadata.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.tableUniqueMod.TableUnique]
}
