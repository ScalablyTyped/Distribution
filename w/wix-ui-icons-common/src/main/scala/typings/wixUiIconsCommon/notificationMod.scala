package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distSrcGeneralDistComponentsNotificationMod.NotificationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Notification", JSImport.Default)
  @js.native
  val default: FC[NotificationProps] = js.native
  
  type _To = FC[NotificationProps]
  
  /* This means you don't have to write `default`, but can instead just say `notificationMod.foo` */
  override def _to: FC[NotificationProps] = default
}
