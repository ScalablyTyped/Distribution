package typings.typeorm.mod

import typings.typeorm.metadataCheckMetadataMod.CheckMetadata
import typings.typeorm.optionsTableCheckOptionsMod.TableCheckOptions
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
@JSImport("typeorm", "TableCheck")
@js.native
object TableCheck extends js.Object {
  
  /**
    * Creates checks from the check metadata object.
    */
  def create(checkMetadata: CheckMetadata): typings.typeorm.tableTableCheckMod.TableCheck = js.native
}
