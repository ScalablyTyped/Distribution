package typings.typeorm.browserMod

import typings.typeorm.tableUniqueOptionsMod.TableUniqueOptions
import typings.typeorm.uniqueMetadataMod.UniqueMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableUnique")
@js.native
class TableUnique protected ()
  extends typings.typeorm.tableUniqueMod.TableUnique {
  def this(options: TableUniqueOptions) = this()
}
/* static members */
@JSImport("typeorm/browser", "TableUnique")
@js.native
object TableUnique extends js.Object {
  
  /**
    * Creates unique from the unique metadata object.
    */
  def create(uniqueMetadata: UniqueMetadata): typings.typeorm.tableUniqueMod.TableUnique = js.native
}
