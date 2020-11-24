package typings.typeorm.browserMod

import typings.typeorm.checkMetadataMod.CheckMetadata
import typings.typeorm.tableCheckOptionsMod.TableCheckOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableCheck")
@js.native
class TableCheck protected ()
  extends typings.typeorm.tableCheckMod.TableCheck {
  def this(options: TableCheckOptions) = this()
}
/* static members */
@JSImport("typeorm/browser", "TableCheck")
@js.native
object TableCheck extends js.Object {
  
  /**
    * Creates checks from the check metadata object.
    */
  def create(checkMetadata: CheckMetadata): typings.typeorm.tableCheckMod.TableCheck = js.native
}
