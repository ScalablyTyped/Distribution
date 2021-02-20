package typings.typeorm.mod

import typings.typeorm.metadataCheckMetadataMod.CheckMetadata
import typings.typeorm.optionsTableCheckOptionsMod.TableCheckOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableCheck")
@js.native
class TableCheck protected ()
  extends typings.typeorm.tableTableCheckMod.TableCheck {
  def this(options: TableCheckOptions) = this()
}
/* static members */
object TableCheck {
  
  /**
    * Creates checks from the check metadata object.
    */
  @JSImport("typeorm", "TableCheck.create")
  @js.native
  def create(checkMetadata: CheckMetadata): typings.typeorm.tableTableCheckMod.TableCheck = js.native
}
