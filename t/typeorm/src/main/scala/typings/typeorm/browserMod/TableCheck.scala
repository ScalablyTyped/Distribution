package typings.typeorm.browserMod

import typings.typeorm.checkMetadataMod.CheckMetadata
import typings.typeorm.tableCheckOptionsMod.TableCheckOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableCheck")
@js.native
class TableCheck protected ()
  extends typings.typeorm.tableCheckMod.TableCheck {
  def this(options: TableCheckOptions) = this()
}
/* static members */
object TableCheck {
  
  @JSImport("typeorm/browser", "TableCheck")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates checks from the check metadata object.
    */
  inline def create(checkMetadata: CheckMetadata): typings.typeorm.tableCheckMod.TableCheck = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(checkMetadata.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.tableCheckMod.TableCheck]
}
