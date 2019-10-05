package typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl

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
  sealed trait acquiringLicense extends AppInstallState
  
  /** The app install is canceled. */
  @js.native
  sealed trait canceled extends AppInstallState
  
  /** The app install is complete. */
  @js.native
  sealed trait completed extends AppInstallState
  
  /** The app is being downloaded. */
  @js.native
  sealed trait downloading extends AppInstallState
  
  /** The ap install encountered an error. */
  @js.native
  sealed trait error extends AppInstallState
  
  /** The app is in the process of being installed. */
  @js.native
  sealed trait installing extends AppInstallState
  
  /** The app install was paused. */
  @js.native
  sealed trait paused extends AppInstallState
  
  /** The app install was paused because the battery is low. */
  @js.native
  sealed trait pausedLowBattery extends AppInstallState
  
  /** The app install was paused because the app package was large enough to trigger a prompt for the user to download the app over Wi-Fi. */
  @js.native
  sealed trait pausedWiFiRecommended extends AppInstallState
  
  /** The app install was paused because the app package was large enough to require the user to download the app over Wi-Fi. */
  @js.native
  sealed trait pausedWiFiRequired extends AppInstallState
  
  /** The app install is pending. */
  @js.native
  sealed trait pending extends AppInstallState
  
  /** The app is ready to download. */
  @js.native
  sealed trait readyToDownload extends AppInstallState
  
  /** The app data is being restored. */
  @js.native
  sealed trait restoringData extends AppInstallState
  
  /** The app install is starting. */
  @js.native
  sealed trait starting extends AppInstallState
  
  /* 2 */ val acquiringLicense: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.acquiringLicense with Double = js.native
  /* 7 */ val canceled: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.canceled with Double = js.native
  /* 6 */ val completed: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.completed with Double = js.native
  /* 3 */ val downloading: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.downloading with Double = js.native
  /* 9 */ val error: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.error with Double = js.native
  /* 5 */ val installing: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.installing with Double = js.native
  /* 8 */ val paused: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.paused with Double = js.native
  /* 10 */ val pausedLowBattery: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.pausedLowBattery with Double = js.native
  /* 11 */ val pausedWiFiRecommended: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.pausedWiFiRecommended with Double = js.native
  /* 12 */ val pausedWiFiRequired: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.pausedWiFiRequired with Double = js.native
  /* 0 */ val pending: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.pending with Double = js.native
  /* 13 */ val readyToDownload: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.readyToDownload with Double = js.native
  /* 4 */ val restoringData: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.restoringData with Double = js.native
  /* 1 */ val starting: typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.starting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppInstallState with Double] = js.native
}

