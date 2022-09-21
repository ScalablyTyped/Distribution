package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.notificationMod.NotificationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonNotificationMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Notification", JSImport.Default)
  @js.native
  val default: FC[NotificationProps] = js.native
  
  type _To = FC[NotificationProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonNotificationMod.foo` */
  override def _to: FC[NotificationProps] = default
}
