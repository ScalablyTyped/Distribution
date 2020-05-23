package typings.winrtUwp.Windows.Media.DialProtocol

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DIAL application running on a remote device. */
trait DialApp extends js.Object {
  /** Gets the applications registered DIAL name. */
  var appName: String
  /**
    * Gets the current status of the application on the remote device.
    * @return The app status, a value from DialAppStateDetails .
    */
  def getAppStateAsync(): IPromiseWithIAsyncOperation[DialAppStateDetails]
  /**
    * Initiates the launching of the app on the remote device. When this method is called, the DialDevice is paired if necessary, the user is prompted to allow access to the device, connection is established, app existence is validated on the device, and finally the application is launched with the provided argument.
    * @param appArgument Optional.
    * @return Indicates the result of attempting to launch the app.
    */
  def requestLaunchAsync(appArgument: String): IPromiseWithIAsyncOperation[DialAppLaunchResult]
  /**
    * Stops the app on the remote device, if the remote device supports this functionality.
    * @return The result of sending the request to stop the app.
    */
  def stopAsync(): IPromiseWithIAsyncOperation[DialAppStopResult]
}

object DialApp {
  @scala.inline
  def apply(
    appName: String,
    getAppStateAsync: () => IPromiseWithIAsyncOperation[DialAppStateDetails],
    requestLaunchAsync: String => IPromiseWithIAsyncOperation[DialAppLaunchResult],
    stopAsync: () => IPromiseWithIAsyncOperation[DialAppStopResult]
  ): DialApp = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], getAppStateAsync = js.Any.fromFunction0(getAppStateAsync), requestLaunchAsync = js.Any.fromFunction1(requestLaunchAsync), stopAsync = js.Any.fromFunction0(stopAsync))
    __obj.asInstanceOf[DialApp]
  }
}

