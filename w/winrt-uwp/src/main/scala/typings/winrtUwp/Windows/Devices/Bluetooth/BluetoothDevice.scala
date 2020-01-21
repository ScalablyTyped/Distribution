package typings.winrtUwp.Windows.Devices.Bluetooth

import typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService
import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.connectionstatuschanged
import typings.winrtUwp.winrtUwpStrings.namechanged
import typings.winrtUwp.winrtUwpStrings.sdprecordschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Bluetooth device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice")
@js.native
abstract class BluetoothDevice () extends js.Object {
  /** Gets the device address. */
  var bluetoothAddress: Double = js.native
  /** Gets the Bluetooth Class Of Device information of the device. */
  var classOfDevice: BluetoothClassOfDevice = js.native
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
  @JSName("onconnectionstatuschanged")
  var onconnectionstatuschanged_Original: TypedEventHandler[BluetoothDevice, _] = js.native
  /** Occurs when the name of the device has changed. */
  @JSName("onnamechanged")
  var onnamechanged_Original: TypedEventHandler[BluetoothDevice, _] = js.native
  /** Occurs when the list SDP records for the device has changed. */
  @JSName("onsdprecordschanged")
  var onsdprecordschanged_Original: TypedEventHandler[BluetoothDevice, _] = js.native
  /** Gets the read-only list of RFCOMM services supported by the device. */
  var rfcommServices: IVectorView[RfcommDeviceService] = js.native
  /** Gets the read-only list of Service Discovery Protocol (SDP) records for the device. */
  var sdpRecords: IVectorView[IBuffer] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[BluetoothDevice, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_namechanged(`type`: namechanged, listener: TypedEventHandler[BluetoothDevice, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sdprecordschanged(`type`: sdprecordschanged, listener: TypedEventHandler[BluetoothDevice, _]): Unit = js.native
  /** Closes the Bluetooth device. */
  def close(): Unit = js.native
  /** Occurs when the connection status of the device has changed. */
  def onconnectionstatuschanged(ev: js.Any with WinRTEvent[BluetoothDevice]): Unit = js.native
  /** Occurs when the name of the device has changed. */
  def onnamechanged(ev: js.Any with WinRTEvent[BluetoothDevice]): Unit = js.native
  /** Occurs when the list SDP records for the device has changed. */
  def onsdprecordschanged(ev: js.Any with WinRTEvent[BluetoothDevice]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[BluetoothDevice, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_namechanged(`type`: namechanged, listener: TypedEventHandler[BluetoothDevice, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sdprecordschanged(`type`: sdprecordschanged, listener: TypedEventHandler[BluetoothDevice, _]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice")
@js.native
object BluetoothDevice extends js.Object {
  /**
    * Returns a BluetoothDevice object for the given BluetoothAddress .
    * @param address The address of the Bluetooth device.
    * @return After the asynchronous operation completes, returns the BluetoothDevice object with the given BluetoothAddress or null if the address does not resolve to a valid device.
    */
  def fromBluetoothAddressAsync(address: Double): IPromiseWithIAsyncOperation[BluetoothDevice] = js.native
  /**
    * Returns a BluetoothDevice object identified by the given HostName .
    * @param hostName The HostName that identifies the BluetoothDevice instance.
    * @return After the asynchronous operation completes, returns the BluetoothDevice object identified by the given HostName .
    */
  def fromHostNameAsync(hostName: HostName): IPromiseWithIAsyncOperation[BluetoothDevice] = js.native
  /**
    * Returns a BluetoothDevice object identified by the given DeviceId .
    * @param deviceId The DeviceId value that identifies the BluetoothDevice instance.
    * @return After the asynchronous operation completes, returns the BluetoothDevice object identified by the given DeviceId .
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[BluetoothDevice] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string for identifying instances of this device. This string is passed to the FindAllAsync or CreateWatcher method.
    * @return The device selector for this device.
    */
  def getDeviceSelector(): String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a 64-bit address that represents a Bluetooth device. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param bluetoothAddress A 64-bit Bluetooth device address used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromBluetoothAddress(bluetoothAddress: Double): String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a BluetoothClassOfDevice object. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param classOfDevice The class of device used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromClassOfDevice(classOfDevice: BluetoothClassOfDevice): String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth devices with the indicated BluetoothConnectionStatus . The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects with the indicated Bluetooth connection status.
    * @param connectionStatus The connection status used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromConnectionStatus(connectionStatus: BluetoothConnectionStatus): String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for the Bluetooth device name. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects containing the specified Bluetooth device name.
    * @param deviceName The Bluetooth device name used for constructing the AQS string.
    * @return An AQS string that is passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromDeviceName(deviceName: String): String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth devices that are either paired or unpaired. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param pairingState The current pairing state for Bluetooth devices used for constructing the AQS string. Bluetooth devices can be either paired (true) or unpaired (false). The AQS Filter string will request scanning to be performed when the pairingState is false.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromPairingState(pairingState: Boolean): String = js.native
}

