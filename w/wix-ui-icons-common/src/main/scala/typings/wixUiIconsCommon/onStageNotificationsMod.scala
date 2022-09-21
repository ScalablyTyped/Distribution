package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.notificationsMod.NotificationsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageNotificationsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/Notifications", JSImport.Default)
  @js.native
  val default: FC[NotificationsProps] = js.native
  
  type _To = FC[NotificationsProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageNotificationsMod.foo` */
  override def _to: FC[NotificationsProps] = default
}
