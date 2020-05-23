package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Media.DialProtocol.DialAppLaunchResult
import typings.winrtUwp.Windows.Media.DialProtocol.DialAppState
import typings.winrtUwp.Windows.Media.DialProtocol.DialAppStopResult
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
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
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialApp {
    /** Gets the applications registered DIAL name. */
    /* CompleteClass */
    override var appName: String = js.native
    /**
      * Gets the current status of the application on the remote device.
      * @return The app status, a value from DialAppStateDetails .
      */
    /* CompleteClass */
    override def getAppStateAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.DialProtocol.DialAppStateDetails] = js.native
    /**
      * Initiates the launching of the app on the remote device. When this method is called, the DialDevice is paired if necessary, the user is prompted to allow access to the device, connection is established, app existence is validated on the device, and finally the application is launched with the provided argument.
      * @param appArgument Optional.
      * @return Indicates the result of attempting to launch the app.
      */
    /* CompleteClass */
    override def requestLaunchAsync(appArgument: String): IPromiseWithIAsyncOperation[DialAppLaunchResult] = js.native
    /**
      * Stops the app on the remote device, if the remote device supports this functionality.
      * @return The result of sending the request to stop the app.
      */
    /* CompleteClass */
    override def stopAsync(): IPromiseWithIAsyncOperation[DialAppStopResult] = js.native
  }
  
  /** Represents the state of the DIAL app. */
  @js.native
  abstract class DialAppStateDetails ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialAppStateDetails {
    /** Gets the entire XML response that is provided by the app when state of the app was requested. */
    /* CompleteClass */
    override var fullXml: String = js.native
    /** Gets the state of the application at the time the GetAppStateAsync was completed. */
    /* CompleteClass */
    override var state: DialAppState = js.native
  }
  
  /** Represents the remote device capable of running DIAL apps. */
  @js.native
  abstract class DialDevice ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialDevice {
    /** Gets the friendly name for the DIAL device. */
    /* CompleteClass */
    override var friendlyName: String = js.native
    /** Gets the remote device's ID. You can use this ID with the Windows.Devices.Enumeration APIs as well. */
    /* CompleteClass */
    override var id: String = js.native
    /** Gets a stream containing the thumbnail image for the DIAL device. */
    /* CompleteClass */
    override var thumbnail: IRandomAccessStreamReference = js.native
    /**
      * Creates a new DialApp object. This method does not establish a connection to the device or validate that the app exists. That is done when any function is called on the resulting DialApp object.
      * @param appName The name of the app. This becomes the AppName property of the new object.
      * @return The DialApp object for the app.
      */
    /* CompleteClass */
    override def getDialApp(appName: String): typings.winrtUwp.Windows.Media.DialProtocol.DialApp = js.native
  }
  
  /** Represents a picker flyout that contains a list of remote devices for the user to choose from. */
  @js.native
  /** Creates a new DialDevicePicker object. */
  class DialDevicePicker ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialDevicePicker
  
  /** Represents the filter used to determine which devices to show in a DialDevicePicker . The filter parameters are OR-ed together to build the resulting filter. */
  @js.native
  abstract class DialDevicePickerFilter ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialDevicePickerFilter {
    /** Gets a list of DIAL apps supported by the remote devices. Defaults to an empty list (no filter). You can add one or more app names and filter the devices list to those that can launch one the supported apps. */
    /* CompleteClass */
    override var supportedAppNames: IVector[String] = js.native
  }
  
  /** Represents the event arguments for the DialDeviceSelected event on the DialDevicePicker object. */
  @js.native
  abstract class DialDeviceSelectedEventArgs ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialDeviceSelectedEventArgs {
    /** Gets the DialDevice object that represents the remote device that has been selected by the user in a DialDevicePicker . */
    /* CompleteClass */
    override var selectedDialDevice: typings.winrtUwp.Windows.Media.DialProtocol.DialDevice = js.native
  }
  
  /** Represents the event arguments for the DisconnectButtonClicked event on the DialDevicePicker object. */
  @js.native
  abstract class DialDisconnectButtonClickedEventArgs ()
    extends typings.winrtUwp.Windows.Media.DialProtocol.DialDisconnectButtonClickedEventArgs {
    /** Gets the DialDevice object that represents the remote device that the user wants to disconnect. */
    /* CompleteClass */
    override var device: typings.winrtUwp.Windows.Media.DialProtocol.DialDevice = js.native
  }
  
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

