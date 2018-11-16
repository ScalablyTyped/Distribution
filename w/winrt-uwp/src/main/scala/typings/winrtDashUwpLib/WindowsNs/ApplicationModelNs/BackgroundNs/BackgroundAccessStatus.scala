package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundAccessStatus extends js.Object

/** On Windows, this enumeration specifies an app's ability to perform background activity and display a tile on the lock screen. For Windows Phone Store apps, it only indicates an app's ability to perform background activity. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundAccessStatus")
@js.native
object BackgroundAccessStatus extends js.Object {
  /** Windows: The user chose "allow" in the dialog box. The app is added to the lock screen and can set up background tasks, but it cannot use the real-time connectivity (RTC) broker. This means that the app might not function while the device is in connected standby. Note that apps that do not specify RTC in their manifest will always demonstrate this behavior. After this value has been returned, subsequent calls to the RequestAccessAsync method do not present the dialog box to the user. */
  @js.native
  sealed trait allowedMayUseActiveRealTimeConnectivity
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus
  
  /** Windows: The user chose "allow" in the dialog box. The app is added to the lock screen, can set up background tasks, and, if it has the capability, can use the real-time connectivity (RTC) broker. This means that the app can function while the device is in the connected standby state. After this value has been returned, subsequent calls to the RequestAccessAsync method do not present the dialog box to the user. */
  @js.native
  sealed trait allowedWithAlwaysOnRealTimeConnectivity
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus
  
  /** Windows: The user chose "don't allow" in the dialog box. The app is not added to the lock screen. After this value has been returned, subsequent calls to the RequestAccessAsync method do not present the dialog box to the user. */
  @js.native
  sealed trait denied
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus
  
  /** Windows: The user has not selected "allow" or "don't allow" in the dialog box, or dismissed it without making a choice. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus
  
  val allowedMayUseActiveRealTimeConnectivity: allowedMayUseActiveRealTimeConnectivity with java.lang.String = js.native
  val allowedWithAlwaysOnRealTimeConnectivity: allowedWithAlwaysOnRealTimeConnectivity with java.lang.String = js.native
  val denied: denied with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus with java.lang.String
  ] = js.native
}

