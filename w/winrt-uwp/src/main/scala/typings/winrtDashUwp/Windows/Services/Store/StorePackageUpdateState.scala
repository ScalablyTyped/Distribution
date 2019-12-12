package typings.winrtDashUwp.Windows.Services.Store

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.canceled
import typings.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.completed
import typings.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.deploying
import typings.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.downloading
import typings.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.errorLowBattery
import typings.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.errorWiFiRecommended
import typings.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.errorWiFiRequired
import typings.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.otherError
import typings.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorePackageUpdateState extends js.Object

/** Defines values that represent the state of a package download or installation request. */
@JSGlobal("Windows.Services.Store.StorePackageUpdateState")
@js.native
object StorePackageUpdateState extends js.Object {
  /** The download or installation of the package updates was canceled. */
  @js.native
  sealed trait canceled extends StorePackageUpdateState
  
  /** The package updates have finished downloading or installing. */
  @js.native
  sealed trait completed extends StorePackageUpdateState
  
  /** The package updates are being deployed to the device. */
  @js.native
  sealed trait deploying extends StorePackageUpdateState
  
  /** The package updates are being downloaded. */
  @js.native
  sealed trait downloading extends StorePackageUpdateState
  
  /** The download or installation of the package updates did not succeed because the device does not have enough battery power. */
  @js.native
  sealed trait errorLowBattery extends StorePackageUpdateState
  
  /** The download did not succeed because a Wi-Fi connection is recommended to download the package updates. */
  @js.native
  sealed trait errorWiFiRecommended extends StorePackageUpdateState
  
  /** The download did not succeed because a Wi-Fi connection is required to download the package updates. */
  @js.native
  sealed trait errorWiFiRequired extends StorePackageUpdateState
  
  /** An unknown error occurred. */
  @js.native
  sealed trait otherError extends StorePackageUpdateState
  
  /** The download of the package updates has not started. */
  @js.native
  sealed trait pending extends StorePackageUpdateState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StorePackageUpdateState with Double] = js.native
  /* 4 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 3 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 2 */ @js.native
  object deploying extends TopLevel[deploying with Double]
  
  /* 1 */ @js.native
  object downloading extends TopLevel[downloading with Double]
  
  /* 6 */ @js.native
  object errorLowBattery extends TopLevel[errorLowBattery with Double]
  
  /* 7 */ @js.native
  object errorWiFiRecommended extends TopLevel[errorWiFiRecommended with Double]
  
  /* 8 */ @js.native
  object errorWiFiRequired extends TopLevel[errorWiFiRequired with Double]
  
  /* 5 */ @js.native
  object otherError extends TopLevel[otherError with Double]
  
  /* 0 */ @js.native
  object pending extends TopLevel[pending with Double]
  
}

