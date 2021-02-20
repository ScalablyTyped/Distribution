package typings.typeorm.mod

import typings.typeorm.metadataUniqueMetadataMod.UniqueMetadata
import typings.typeorm.optionsTableUniqueOptionsMod.TableUniqueOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableUnique")
@js.native
class TableUnique protected ()
  extends typings.typeorm.tableTableUniqueMod.TableUnique {
  def this(options: TableUniqueOptions) = this()
}
/* static members */
object TableUnique {
  
  /**
    * Creates unique from the unique metadata object.
    */
  @JSImport("typeorm", "TableUnique.create")
  @js.native
  def create(uniqueMetadata: UniqueMetadata): typings.typeorm.tableTableUniqueMod.TableUnique = js.native
}
