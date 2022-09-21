package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPopupMod.PopupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Popup", JSImport.Default)
  @js.native
  val default: FC[PopupProps] = js.native
  
  type _To = FC[PopupProps]
  
  /* This means you don't have to write `default`, but can instead just say `popupMod.foo` */
  override def _to: FC[PopupProps] = default
}
