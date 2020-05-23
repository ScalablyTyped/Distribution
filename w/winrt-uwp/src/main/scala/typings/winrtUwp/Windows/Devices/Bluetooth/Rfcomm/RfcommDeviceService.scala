package typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothCacheMode
import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an instance of a service on a Bluetooth BR device. */
@js.native
trait RfcommDeviceService extends js.Object {
  /** Gets the connection host name of the RFCOMM service instance, which is used to connect to the remote device. */
  var connectionHostName: HostName = js.native
  /** Gets the connection service name of the RFCOMM service instance, which is used to connect to the remote device. */
  var connectionServiceName: String = js.native
  /** Gets the BluetoothDevice object describing the device associated with the current RfcommDeviceService object. */
  var device: BluetoothDevice = js.native
  /** Gets the maximum SocketProtectionLevel supported by this RFCOMM service instance. */
  var maxProtectionLevel: SocketProtectionLevel = js.native
  /** Gets the current SocketProtectionLevel of the RFCOMM service instance. */
  var protectionLevel: SocketProtectionLevel = js.native
  /** Gets the RfcommServiceId of this RFCOMM service instance. */
  var serviceId: RfcommServiceId = js.native
  /** Closes the RFCOMM device. */
  def close(): Unit = js.native
  /**
    * Gets the cached SDP attributes of the RFCOMM service instance.
    * @return The SDP attributes of the RFCOMM service instance.
    */
  def getSdpRawAttributesAsync(): IPromiseWithIAsyncOperation[IMapView[_, _]] = js.native
  /**
    * Gets the SDP attributes of the RFCOMM service instance.
    * @param cacheMode Indicates whether SDP attributes should be retrieved from the cache or from the device.
    * @return The SDP attributes of the RFCOMM service instance.
    */
  def getSdpRawAttributesAsync(cacheMode: BluetoothCacheMode): IPromiseWithIAsyncOperation[IMapView[_, _]] = js.native
}

