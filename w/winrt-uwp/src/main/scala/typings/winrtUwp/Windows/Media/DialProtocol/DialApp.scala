package typings.winrtUwp.Windows.Media.DialProtocol

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DIAL application running on a remote device. */
@js.native
trait DialApp extends StObject {
  
  /** Gets the applications registered DIAL name. */
  var appName: String = js.native
  
  /**
    * Gets the current status of the application on the remote device.
    * @return The app status, a value from DialAppStateDetails .
    */
  def getAppStateAsync(): IPromiseWithIAsyncOperation[DialAppStateDetails] = js.native
  
  /**
    * Initiates the launching of the app on the remote device. When this method is called, the DialDevice is paired if necessary, the user is prompted to allow access to the device, connection is established, app existence is validated on the device, and finally the application is launched with the provided argument.
    * @param appArgument Optional.
    * @return Indicates the result of attempting to launch the app.
    */
  def requestLaunchAsync(appArgument: String): IPromiseWithIAsyncOperation[DialAppLaunchResult] = js.native
  
  /**
    * Stops the app on the remote device, if the remote device supports this functionality.
    * @return The result of sending the request to stop the app.
    */
  def stopAsync(): IPromiseWithIAsyncOperation[DialAppStopResult] = js.native
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
  
  @scala.inline
  implicit class DialAppMutableBuilder[Self <: DialApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAppStateAsync(value: () => IPromiseWithIAsyncOperation[DialAppStateDetails]): Self = StObject.set(x, "getAppStateAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestLaunchAsync(value: String => IPromiseWithIAsyncOperation[DialAppLaunchResult]): Self = StObject.set(x, "requestLaunchAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopAsync(value: () => IPromiseWithIAsyncOperation[DialAppStopResult]): Self = StObject.set(x, "stopAsync", js.Any.fromFunction0(value))
  }
}
