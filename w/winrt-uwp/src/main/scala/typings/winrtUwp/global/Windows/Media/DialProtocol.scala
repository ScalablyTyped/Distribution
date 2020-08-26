package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DIAL protocol ( DIscover And Launch) lets people launches media apps from a primary device, like a phone or tablet, to a remote device like a television. See http://www.dial-multiscreen.org/home for more information in the industry-standard protocol. */
@JSGlobal("Windows.Media.DialProtocol")
@js.native
object DialProtocol extends js.Object {
  /** Represents a DIAL application running on a remote device. */
  @js.native
  abstract class DialApp ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialApp
  
  /** Represents the state of the DIAL app. */
  @js.native
  abstract class DialAppStateDetails ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialAppStateDetails
  
  /** Represents the remote device capable of running DIAL apps. */
  @js.native
  abstract class DialDevice ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialDevice
  
  /** Represents a picker flyout that contains a list of remote devices for the user to choose from. */
  @js.native
  /** Creates a new DialDevicePicker object. */
  class DialDevicePicker ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialDevicePicker
  
  /** Represents the filter used to determine which devices to show in a DialDevicePicker . The filter parameters are OR-ed together to build the resulting filter. */
  @js.native
  abstract class DialDevicePickerFilter ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialDevicePickerFilter
  
  /** Represents the event arguments for the DialDeviceSelected event on the DialDevicePicker object. */
  @js.native
  abstract class DialDeviceSelectedEventArgs ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialDeviceSelectedEventArgs
  
  /** Represents the event arguments for the DisconnectButtonClicked event on the DialDevicePicker object. */
  @js.native
  abstract class DialDisconnectButtonClickedEventArgs ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialDisconnectButtonClickedEventArgs
  
  /** The result of attempting to launch an app on a remote device. */
  @js.native
  object DialAppLaunchResult extends js.Object {
    /* 1 */ val failedToLaunch: typings.winrtUwp.Windows.Media.DialProtocol.DialAppLaunchResult.failedToLaunch with Double = js.native
    /* 0 */ val launched: typings.winrtUwp.Windows.Media.DialProtocol.DialAppLaunchResult.launched with Double = js.native
    /* 3 */ val networkFailure: typings.winrtUwp.Windows.Media.DialProtocol.DialAppLaunchResult.networkFailure with Double = js.native
    /* 2 */ val notFound: typings.winrtUwp.Windows.Media.DialProtocol.DialAppLaunchResult.notFound with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.DialProtocol.DialAppLaunchResult with Double] = js.native
  }
  
  /** The state of the application on the remote device. */
  @js.native
  object DialAppState extends js.Object {
    /* 3 */ val networkFailure: typings.winrtUwp.Windows.Media.DialProtocol.DialAppState.networkFailure with Double = js.native
    /* 2 */ val running: typings.winrtUwp.Windows.Media.DialProtocol.DialAppState.running with Double = js.native
    /* 1 */ val stopped: typings.winrtUwp.Windows.Media.DialProtocol.DialAppState.stopped with Double = js.native
    /* 0 */ val unknown: typings.winrtUwp.Windows.Media.DialProtocol.DialAppState.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.DialProtocol.DialAppState with Double] = js.native
  }
  
  /** The result of attempting to stop an app from running on a remote device. */
  @js.native
  object DialAppStopResult extends js.Object {
    /* 3 */ val networkFailure: typings.winrtUwp.Windows.Media.DialProtocol.DialAppStopResult.networkFailure with Double = js.native
    /* 2 */ val operationNotSupported: typings.winrtUwp.Windows.Media.DialProtocol.DialAppStopResult.operationNotSupported with Double = js.native
    /* 1 */ val stopFailed: typings.winrtUwp.Windows.Media.DialProtocol.DialAppStopResult.stopFailed with Double = js.native
    /* 0 */ val stopped: typings.winrtUwp.Windows.Media.DialProtocol.DialAppStopResult.stopped with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.DialProtocol.DialAppStopResult with Double] = js.native
  }
  
  /* static members */
  @js.native
  object DialDevice extends js.Object {
    /**
      * Indicates whether or not the device supports launching DIAL apps.
      * @param device The device you want to get information for.
      * @return True if app launching is supported; false, otherwise.
      */
    def deviceInfoSupportsDialAsync(device: DeviceInformation): IPromiseWithIAsyncOperation[Boolean] = js.native
    /**
      * Returns a DialDevice object for a given a device ID (acquired from a query using the Windows.Devices.Enumeration APIs).
      * @param value The ID of the device you want a DialDevice object for.
      * @return The DialDevice object for the given device ID.
      */
    def fromIdAsync(value: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.DialProtocol.DialDevice] = js.native
    /**
      * Returns an AQS filter string to be used with the Windows.Devices.Enumeration APIs (such as the CreateWatcher API) for a given Dial app.
      * @param appName The name of the app.
      * @return The AQS filter.
      */
    def getDeviceSelector(appName: String): String = js.native
  }
  
  /** The possible statuses a DIAL device can have in the DIAL device picker. You can use these to adjust the sub-status and other visual attributes for a particular device in the picker. */
  @js.native
  object DialDeviceDisplayStatus extends js.Object {
    /* 2 */ val connected: typings.winrtUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus.connected with Double = js.native
    /* 1 */ val connecting: typings.winrtUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus.connecting with Double = js.native
    /* 4 */ val disconnected: typings.winrtUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus.disconnected with Double = js.native
    /* 3 */ val disconnecting: typings.winrtUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus.disconnecting with Double = js.native
    /* 5 */ val error: typings.winrtUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus.error with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus with Double] = js.native
  }
  
}

