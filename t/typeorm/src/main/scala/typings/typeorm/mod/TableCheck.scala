package typings.typeorm.mod

import typings.typeorm.metadataCheckMetadataMod.CheckMetadata
import typings.typeorm.optionsTableCheckOptionsMod.TableCheckOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableCheck")
@js.native
class TableCheck protected ()
  extends typings.typeorm.tableTableCheckMod.TableCheck {
  def this(options: TableCheckOptions) = this()
}
/* static members */
object TableCheck {
  
  @JSImport("typeorm", "TableCheck")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates checks from the check metadata object.
    */
  @scala.inline
  def create(checkMetadata: CheckMetadata): typings.typeorm.tableTableCheckMod.TableCheck = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(checkMetadata.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.tableTableCheckMod.TableCheck]
}
