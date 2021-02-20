package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationSetting extends StObject
/** Specifies the limitations on tile or toast notification display. */
@JSGlobal("Windows.UI.Notifications.NotificationSetting")
@js.native
object NotificationSetting extends StObject {
  
  /** An administrator has disabled all notifications on this computer through group policy. The group policy setting overrides the user's setting. */
  @js.native
  sealed trait disabledByGroupPolicy extends NotificationSetting
  
  /** This app has not declared itself toast capable in its package.appxmanifest file. This setting is found on the manifest's Application UI page, under the Notification section. For an app to send toast, the Toast Capable option must be set to "Yes". */
  @js.native
  sealed trait disabledByManifest extends NotificationSetting
  
  /** The user has disabled notifications for this app. */
  @js.native
  sealed trait disabledForApplication extends NotificationSetting
  
  /** The user or administrator has disabled all notifications for this user on this computer. */
  @js.native
  sealed trait disabledForUser extends NotificationSetting
  
  /** All notifications raised by this app can be displayed. */
  @js.native
  sealed trait enabled extends NotificationSetting
}
