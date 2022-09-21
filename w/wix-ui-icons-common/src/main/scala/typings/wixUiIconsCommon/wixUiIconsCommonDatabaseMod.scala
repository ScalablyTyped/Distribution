package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.databaseMod.DatabaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonDatabaseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Database", JSImport.Default)
  @js.native
  val default: FC[DatabaseProps] = js.native
  
  type _To = FC[DatabaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonDatabaseMod.foo` */
  override def _to: FC[DatabaseProps] = default
}
