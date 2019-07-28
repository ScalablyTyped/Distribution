package typings.winrtDashUwp.WindowsNs.MediaNs.DialProtocolNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the remote device capable of running DIAL apps. */
@JSGlobal("Windows.Media.DialProtocol.DialDevice")
@js.native
abstract class DialDevice () extends js.Object {
  /** Gets the friendly name for the DIAL device. */
  var friendlyName: String = js.native
  /** Gets the remote device's ID. You can use this ID with the Windows.Devices.Enumeration APIs as well. */
  var id: String = js.native
  /** Gets a stream containing the thumbnail image for the DIAL device. */
  var thumbnail: IRandomAccessStreamReference = js.native
  /**
    * Creates a new DialApp object. This method does not establish a connection to the device or validate that the app exists. That is done when any function is called on the resulting DialApp object.
    * @param appName The name of the app. This becomes the AppName property of the new object.
    * @return The DialApp object for the app.
    */
  def getDialApp(appName: String): DialApp = js.native
}

/* static members */
@JSGlobal("Windows.Media.DialProtocol.DialDevice")
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
  def fromIdAsync(value: String): IPromiseWithIAsyncOperation[DialDevice] = js.native
  /**
    * Returns an AQS filter string to be used with the Windows.Devices.Enumeration APIs (such as the CreateWatcher API) for a given Dial app.
    * @param appName The name of the app.
    * @return The AQS filter.
    */
  def getDeviceSelector(appName: String): String = js.native
}

