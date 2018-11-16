package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.RfcommNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an instance of a service on a Bluetooth BR device. */
@JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService")
@js.native
abstract class RfcommDeviceService () extends js.Object {
  /** Gets the connection host name of the RFCOMM service instance, which is used to connect to the remote device. */
  var connectionHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName = js.native
  /** Gets the connection service name of the RFCOMM service instance, which is used to connect to the remote device. */
  var connectionServiceName: java.lang.String = js.native
  /** Gets the BluetoothDevice object describing the device associated with the current RfcommDeviceService object. */
  var device: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothDevice = js.native
  /** Gets the maximum SocketProtectionLevel supported by this RFCOMM service instance. */
  var maxProtectionLevel: winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel = js.native
  /** Gets the current SocketProtectionLevel of the RFCOMM service instance. */
  var protectionLevel: winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel = js.native
  /** Gets the RfcommServiceId of this RFCOMM service instance. */
  var serviceId: RfcommServiceId = js.native
  /** Closes the RFCOMM device. */
  def close(): scala.Unit = js.native
  /**
                       * Gets the cached SDP attributes of the RFCOMM service instance.
                       * @return The SDP attributes of the RFCOMM service instance.
                       */
  def getSdpRawAttributesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[_, _]] = js.native
  /**
                       * Gets the SDP attributes of the RFCOMM service instance.
                       * @param cacheMode Indicates whether SDP attributes should be retrieved from the cache or from the device.
                       * @return The SDP attributes of the RFCOMM service instance.
                       */
  def getSdpRawAttributesAsync(cacheMode: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothCacheMode): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[_, _]] = js.native
}

/** Represents an instance of a service on a Bluetooth BR device. */
@JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService")
@js.native
object RfcommDeviceService extends js.Object {
  /**
                       * Gets an RfcommDeviceService object from a DeviceInformation Id for an RFCOMM service instance.
                       * @param deviceId The DeviceInformation Id that identifies the RFCOMM service instance. This id can be retrieved from Windows.Devices.Enumeration .
                       * @return The RfcommDeviceService object that represents the RFCOMM service instance.
                       */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.RfcommNs.RfcommDeviceService] = js.native
  /**
                       * Gets an Advanced Query Syntax (AQS) string for identifying instances of an RFCOMM service. This string is passed to the CreateWatcher method.
                       * @param serviceId The service id for which to query.
                       * @return An AQS string for identifying RFCOMM service instances.
                       */
  def getDeviceSelector(serviceId: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.RfcommNs.RfcommServiceId): java.lang.String = js.native
}

