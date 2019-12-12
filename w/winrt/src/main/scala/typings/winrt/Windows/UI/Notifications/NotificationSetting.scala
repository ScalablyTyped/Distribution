package typings.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Notifications.NotificationSetting.disabledByGroupPolicy
import typings.winrt.Windows.UI.Notifications.NotificationSetting.disabledByManifest
import typings.winrt.Windows.UI.Notifications.NotificationSetting.disabledForApplication
import typings.winrt.Windows.UI.Notifications.NotificationSetting.disabledForUser
import typings.winrt.Windows.UI.Notifications.NotificationSetting.enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationSetting with Double] = js.native
  /* 3 */ @js.native
  object disabledByGroupPolicy extends TopLevel[disabledByGroupPolicy with Double]
  
  /* 4 */ @js.native
  object disabledByManifest extends TopLevel[disabledByManifest with Double]
  
  /* 1 */ @js.native
  object disabledForApplication extends TopLevel[disabledForApplication with Double]
  
  /* 2 */ @js.native
  object disabledForUser extends TopLevel[disabledForUser with Double]
  
  /* 0 */ @js.native
  object enabled extends TopLevel[enabled with Double]
  
}

