package typings.typeorm.mod

import typings.typeorm.metadataUniqueMetadataMod.UniqueMetadata
import typings.typeorm.optionsTableUniqueOptionsMod.TableUniqueOptions
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
@JSImport("typeorm", "TableUnique")
@js.native
object TableUnique extends js.Object {
  
  /**
    * Creates unique from the unique metadata object.
    */
  def create(uniqueMetadata: UniqueMetadata): typings.typeorm.tableTableUniqueMod.TableUnique = js.native
}
