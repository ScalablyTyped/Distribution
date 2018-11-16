package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

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
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePackageUpdateState
  
  /** The package updates have finished downloading or installing. */
  @js.native
  sealed trait completed
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePackageUpdateState
  
  /** The package updates are being deployed to the device. */
  @js.native
  sealed trait deploying
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePackageUpdateState
  
  /** The package updates are being downloaded. */
  @js.native
  sealed trait downloading
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePackageUpdateState
  
  /** The download or installation of the package updates did not succeed because the device does not have enough battery power. */
  @js.native
  sealed trait errorLowBattery
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePackageUpdateState
  
  /** The download did not succeed because a Wi-Fi connection is recommended to download the package updates. */
  @js.native
  sealed trait errorWiFiRecommended
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePackageUpdateState
  
  /** The download did not succeed because a Wi-Fi connection is required to download the package updates. */
  @js.native
  sealed trait errorWiFiRequired
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePackageUpdateState
  
  /** An unknown error occurred. */
  @js.native
  sealed trait otherError
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePackageUpdateState
  
  /** The download of the package updates has not started. */
  @js.native
  sealed trait pending
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePackageUpdateState
  
  /* 4 */ val canceled: canceled with scala.Double = js.native
  /* 3 */ val completed: completed with scala.Double = js.native
  /* 2 */ val deploying: deploying with scala.Double = js.native
  /* 1 */ val downloading: downloading with scala.Double = js.native
  /* 6 */ val errorLowBattery: errorLowBattery with scala.Double = js.native
  /* 7 */ val errorWiFiRecommended: errorWiFiRecommended with scala.Double = js.native
  /* 8 */ val errorWiFiRequired: errorWiFiRequired with scala.Double = js.native
  /* 5 */ val otherError: otherError with scala.Double = js.native
  /* 0 */ val pending: pending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePackageUpdateState with scala.Double
  ] = js.native
}

