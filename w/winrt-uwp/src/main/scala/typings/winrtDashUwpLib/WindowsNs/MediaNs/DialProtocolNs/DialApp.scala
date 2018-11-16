package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DIAL application running on a remote device. */
@JSGlobal("Windows.Media.DialProtocol.DialApp")
@js.native
abstract class DialApp () extends js.Object {
  /** Gets the applications registered DIAL name. */
  var appName: java.lang.String = js.native
  /**
                   * Gets the current status of the application on the remote device.
                   * @return The app status, a value from DialAppStateDetails .
                   */
  def getAppStateAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DialAppStateDetails] = js.native
  /**
                   * Initiates the launching of the app on the remote device. When this method is called, the DialDevice is paired if necessary, the user is prompted to allow access to the device, connection is established, app existence is validated on the device, and finally the application is launched with the provided argument.
                   * @param appArgument Optional.
                   * @return Indicates the result of attempting to launch the app.
                   */
  def requestLaunchAsync(appArgument: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DialAppLaunchResult] = js.native
  /**
                   * Stops the app on the remote device, if the remote device supports this functionality.
                   * @return The result of sending the request to stop the app.
                   */
  def stopAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DialAppStopResult] = js.native
}

