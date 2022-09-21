package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAppManagerMod.AppManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appManagerMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/AppManager", JSImport.Default)
  @js.native
  val default: FC[AppManagerProps] = js.native
  
  type _To = FC[AppManagerProps]
  
  /* This means you don't have to write `default`, but can instead just say `appManagerMod.foo` */
  override def _to: FC[AppManagerProps] = default
}
