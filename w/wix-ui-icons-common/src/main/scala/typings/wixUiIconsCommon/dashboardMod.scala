package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDashboardMod.DashboardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dashboardMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Dashboard", JSImport.Default)
  @js.native
  val default: FC[DashboardProps] = js.native
  
  type _To = FC[DashboardProps]
  
  /* This means you don't have to write `default`, but can instead just say `dashboardMod.foo` */
  override def _to: FC[DashboardProps] = default
}
