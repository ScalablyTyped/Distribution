package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsProfileWidgetMod.ProfileWidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profileWidgetMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ProfileWidget", JSImport.Default)
  @js.native
  val default: FC[ProfileWidgetProps] = js.native
  
  type _To = FC[ProfileWidgetProps]
  
  /* This means you don't have to write `default`, but can instead just say `profileWidgetMod.foo` */
  override def _to: FC[ProfileWidgetProps] = default
}
