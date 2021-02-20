package typings.typeorm.browserMod

import typings.typeorm.tableUniqueOptionsMod.TableUniqueOptions
import typings.typeorm.uniqueMetadataMod.UniqueMetadata
import org.scalablytyped.runtime.StObject
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
object TableUnique {
  
  /**
    * Creates unique from the unique metadata object.
    */
  @JSImport("typeorm/browser", "TableUnique.create")
  @js.native
  def create(uniqueMetadata: UniqueMetadata): typings.typeorm.tableUniqueMod.TableUnique = js.native
}
