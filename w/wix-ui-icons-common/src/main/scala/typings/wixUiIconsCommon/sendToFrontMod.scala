package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSendToFrontMod.SendToFrontProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendToFrontMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SendToFront", JSImport.Default)
  @js.native
  val default: FC[SendToFrontProps] = js.native
  
  type _To = FC[SendToFrontProps]
  
  /* This means you don't have to write `default`, but can instead just say `sendToFrontMod.foo` */
  override def _to: FC[SendToFrontProps] = default
}
