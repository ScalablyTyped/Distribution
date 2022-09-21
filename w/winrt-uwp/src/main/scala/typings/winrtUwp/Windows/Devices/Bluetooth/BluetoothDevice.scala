package typings.winrtUwp.Windows.Devices.Bluetooth

import typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService
import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.connectionstatuschanged
import typings.winrtUwp.winrtUwpStrings.namechanged
import typings.winrtUwp.winrtUwpStrings.sdprecordschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Bluetooth device. */
@js.native
trait BluetoothDevice extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[BluetoothDevice, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_namechanged(`type`: namechanged, listener: TypedEventHandler[BluetoothDevice, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sdprecordschanged(`type`: sdprecordschanged, listener: TypedEventHandler[BluetoothDevice, Any]): Unit = js.native
  
  /** Gets the device address. */
  var bluetoothAddress: Double = js.native
  
  /** Gets the Bluetooth Class Of Device information of the device. */
  var classOfDevice: BluetoothClassOfDevice = js.native
  
  /** Closes the Bluetooth device. */
  def close(): Unit = js.native
  
  /** Gets the connection status of the device. */
  var connectionStatus: BluetoothConnectionStatus = js.native
  
  /** Gets the device ID. */
  var deviceId: String = js.native
  
  /** Gets the DeviceInformation object for the Bluetooth device. */
  var deviceInformation: DeviceInformation = js.native
  
  /** Gets the HostName of the device. */
  var hostName: HostName = js.native
  
  /** Gets the Name of the device. */
  var name: String = js.native
  
  /** Occurs when the connection status of the device has changed. */
  def onconnectionstatuschanged(ev: Any & WinRTEvent[BluetoothDevice]): Unit = js.native
  /** Occurs when the connection status of the device has changed. */
  @JSName("onconnectionstatuschanged")
  var onconnectionstatuschanged_Original: TypedEventHandler[BluetoothDevice, Any] = js.native
  
  /** Occurs when the name of the device has changed. */
  def onnamechanged(ev: Any & WinRTEvent[BluetoothDevice]): Unit = js.native
  /** Occurs when the name of the device has changed. */
  @JSName("onnamechanged")
  var onnamechanged_Original: TypedEventHandler[BluetoothDevice, Any] = js.native
  
  /** Occurs when the list SDP records for the device has changed. */
  def onsdprecordschanged(ev: Any & WinRTEvent[BluetoothDevice]): Unit = js.native
  /** Occurs when the list SDP records for the device has changed. */
  @JSName("onsdprecordschanged")
  var onsdprecordschanged_Original: TypedEventHandler[BluetoothDevice, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[BluetoothDevice, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_namechanged(`type`: namechanged, listener: TypedEventHandler[BluetoothDevice, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sdprecordschanged(`type`: sdprecordschanged, listener: TypedEventHandler[BluetoothDevice, Any]): Unit = js.native
  
  /** Gets the read-only list of RFCOMM services supported by the device. */
  var rfcommServices: IVectorView[RfcommDeviceService] = js.native
  
  /** Gets the read-only list of Service Discovery Protocol (SDP) records for the device. */
  var sdpRecords: IVectorView[IBuffer] = js.native
}
