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
  
  /* 2 */ val acquiringLicense: acquiringLicense with scala.Double = js.native
  /* 7 */ val canceled: canceled with scala.Double = js.native
  /* 6 */ val completed: completed with scala.Double = js.native
  /* 3 */ val downloading: downloading with scala.Double = js.native
  /* 9 */ val error: error with scala.Double = js.native
  /* 5 */ val installing: installing with scala.Double = js.native
  /* 8 */ val paused: paused with scala.Double = js.native
  /* 10 */ val pausedLowBattery: pausedLowBattery with scala.Double = js.native
  /* 11 */ val pausedWiFiRecommended: pausedWiFiRecommended with scala.Double = js.native
  /* 12 */ val pausedWiFiRequired: pausedWiFiRequired with scala.Double = js.native
  /* 0 */ val pending: pending with scala.Double = js.native
  /* 13 */ val readyToDownload: readyToDownload with scala.Double = js.native
  /* 4 */ val restoringData: restoringData with scala.Double = js.native
  /* 1 */ val starting: starting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallState with scala.Double
  ] = js.native
}

