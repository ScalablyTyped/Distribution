package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.notificationsFillLargeMod.NotificationsFillLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemNotificationsFillLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/NotificationsFillLarge", JSImport.Default)
  @js.native
  val default: FC[NotificationsFillLargeProps] = js.native
  
  type _To = FC[NotificationsFillLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemNotificationsFillLargeMod.foo` */
  override def _to: FC[NotificationsFillLargeProps] = default
}
