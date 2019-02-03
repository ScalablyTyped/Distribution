package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the remote device capable of running DIAL apps. */
@JSGlobal("Windows.Media.DialProtocol.DialDevice")
@js.native
abstract class DialDevice () extends js.Object {
  /** Gets the friendly name for the DIAL device. */
  var friendlyName: java.lang.String = js.native
  /** Gets the remote device's ID. You can use this ID with the Windows.Devices.Enumeration APIs as well. */
  var id: java.lang.String = js.native
  /** Gets a stream containing the thumbnail image for the DIAL device. */
  var thumbnail: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /**
    * Creates a new DialApp object. This method does not establish a connection to the device or validate that the app exists. That is done when any function is called on the resulting DialApp object.
    * @param appName The name of the app. This becomes the AppName property of the new object.
    * @return The DialApp object for the app.
    */
  def getDialApp(appName: java.lang.String): DialApp = js.native
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
  def deviceInfoSupportsDialAsync(device: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Returns a DialDevice object for a given a device ID (acquired from a query using the Windows.Devices.Enumeration APIs).
    * @param value The ID of the device you want a DialDevice object for.
    * @return The DialDevice object for the given device ID.
    */
  def fromIdAsync(value: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialDevice] = js.native
  /**
    * Returns an AQS filter string to be used with the Windows.Devices.Enumeration APIs (such as the CreateWatcher API) for a given Dial app.
    * @param appName The name of the app.
    * @return The AQS filter.
    */
  def getDeviceSelector(appName: java.lang.String): java.lang.String = js.native
}

