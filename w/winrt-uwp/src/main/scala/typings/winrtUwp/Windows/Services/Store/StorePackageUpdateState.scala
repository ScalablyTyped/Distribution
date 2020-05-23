package typings.winrtUwp.Windows.Services.Store

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
  
}

