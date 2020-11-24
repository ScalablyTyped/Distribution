package typings.winrt.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationSetting extends js.Object
@JSGlobal("Windows.UI.Notifications.NotificationSetting")
@js.native
object NotificationSetting extends js.Object {
  
  @js.native
  sealed trait disabledByGroupPolicy extends NotificationSetting
  
  @js.native
  sealed trait disabledByManifest extends NotificationSetting
  
  @js.native
  sealed trait disabledForApplication extends NotificationSetting
  
  @js.native
  sealed trait disabledForUser extends NotificationSetting
  
  @js.native
  sealed trait enabled extends NotificationSetting
}
