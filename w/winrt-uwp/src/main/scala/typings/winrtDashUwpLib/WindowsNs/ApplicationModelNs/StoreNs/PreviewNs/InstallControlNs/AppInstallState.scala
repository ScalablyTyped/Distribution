package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppInstallState extends js.Object

/** Defines the app install states that are returned by the InstallState property of the AppInstallStatus class. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState")
@js.native
object AppInstallState extends js.Object {
  /** The license is being acquired for the app. */
  @js.native
  sealed trait acquiringLicense
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The app install is canceled. */
  @js.native
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The app install is complete. */
  @js.native
  sealed trait completed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The app is being downloaded. */
  @js.native
  sealed trait downloading
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The ap install encountered an error. */
  @js.native
  sealed trait error
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The app is in the process of being installed. */
  @js.native
  sealed trait installing
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The app install was paused. */
  @js.native
  sealed trait paused
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The app install was paused because the battery is low. */
  @js.native
  sealed trait pausedLowBattery
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The app install was paused because the app package was large enough to trigger a prompt for the user to download the app over Wi-Fi. */
  @js.native
  sealed trait pausedWiFiRecommended
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The app install was paused because the app package was large enough to require the user to download the app over Wi-Fi. */
  @js.native
  sealed trait pausedWiFiRequired
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The app install is pending. */
  @js.native
  sealed trait pending
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The app is ready to download. */
  @js.native
  sealed trait readyToDownload
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The app data is being restored. */
  @js.native
  sealed trait restoringData
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  /** The app install is starting. */
  @js.native
  sealed trait starting
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState
  
  val acquiringLicense: acquiringLicense with java.lang.String = js.native
  val canceled: canceled with java.lang.String = js.native
  val completed: completed with java.lang.String = js.native
  val downloading: downloading with java.lang.String = js.native
  val error: error with java.lang.String = js.native
  val installing: installing with java.lang.String = js.native
  val paused: paused with java.lang.String = js.native
  val pausedLowBattery: pausedLowBattery with java.lang.String = js.native
  val pausedWiFiRecommended: pausedWiFiRecommended with java.lang.String = js.native
  val pausedWiFiRequired: pausedWiFiRequired with java.lang.String = js.native
  val pending: pending with java.lang.String = js.native
  val readyToDownload: readyToDownload with java.lang.String = js.native
  val restoringData: restoringData with java.lang.String = js.native
  val starting: starting with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState with java.lang.String
  ] = js.native
}

