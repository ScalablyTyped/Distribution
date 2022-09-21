package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSendToBackBoldMod.SendToBackBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendToBackBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SendToBackBold", JSImport.Default)
  @js.native
  val default: FC[SendToBackBoldProps] = js.native
  
  type _To = FC[SendToBackBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `sendToBackBoldMod.foo` */
  override def _to: FC[SendToBackBoldProps] = default
}
