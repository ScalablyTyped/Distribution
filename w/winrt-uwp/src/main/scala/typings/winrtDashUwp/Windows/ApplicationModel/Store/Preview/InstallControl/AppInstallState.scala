package typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.acquiringLicense
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.canceled
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.completed
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.downloading
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.error
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.installing
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.paused
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.pausedLowBattery
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.pausedWiFiRecommended
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.pausedWiFiRequired
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.pending
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.readyToDownload
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.restoringData
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.starting
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppInstallState with Double] = js.native
  /* 2 */ @js.native
  object acquiringLicense extends TopLevel[acquiringLicense with Double]
  
  /* 7 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 6 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 3 */ @js.native
  object downloading extends TopLevel[downloading with Double]
  
  /* 9 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 5 */ @js.native
  object installing extends TopLevel[installing with Double]
  
  /* 8 */ @js.native
  object paused extends TopLevel[paused with Double]
  
  /* 10 */ @js.native
  object pausedLowBattery extends TopLevel[pausedLowBattery with Double]
  
  /* 11 */ @js.native
  object pausedWiFiRecommended extends TopLevel[pausedWiFiRecommended with Double]
  
  /* 12 */ @js.native
  object pausedWiFiRequired extends TopLevel[pausedWiFiRequired with Double]
  
  /* 0 */ @js.native
  object pending extends TopLevel[pending with Double]
  
  /* 13 */ @js.native
  object readyToDownload extends TopLevel[readyToDownload with Double]
  
  /* 4 */ @js.native
  object restoringData extends TopLevel[restoringData with Double]
  
  /* 1 */ @js.native
  object starting extends TopLevel[starting with Double]
  
}

