package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSendToFrontBoldMod.SendToFrontBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendToFrontBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SendToFrontBold", JSImport.Default)
  @js.native
  val default: FC[SendToFrontBoldProps] = js.native
  
  type _To = FC[SendToFrontBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `sendToFrontBoldMod.foo` */
  override def _to: FC[SendToFrontBoldProps] = default
}
