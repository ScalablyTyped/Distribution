package typings.winrtUwp.Windows.ApplicationModel.AppService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppServiceConnectionStatus extends js.Object

/** Describes the status for the attempt that an app makes to open a connection to an app service by calling the AppServiceConnection.OpenAsync method. */
@JSGlobal("Windows.ApplicationModel.AppService.AppServiceConnectionStatus")
@js.native
object AppServiceConnectionStatus extends js.Object {
  /** The package for the app service to which a connection was attempted is not installed on the device. Check that the package is installed before trying to open a connection to the app service. */
  @js.native
  sealed trait appNotInstalled extends AppServiceConnectionStatus
  
  /** The app with the specified package family name is installed and available, but the app does not declare support for the specified app service. Check that the name of the app service and the version of the app are correct. */
  @js.native
  sealed trait appServiceUnavailable extends AppServiceConnectionStatus
  
  /** The package for the app service to which a connection was attempted is temporarily unavailable. Try to connect again later. */
  @js.native
  sealed trait appUnavailable extends AppServiceConnectionStatus
  
  /** The connection to the app service was opened successfully. */
  @js.native
  sealed trait success extends AppServiceConnectionStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknown extends AppServiceConnectionStatus
  
}

