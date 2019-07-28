package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattDeviceService
import typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.connectionstatuschanged
import typings.winrtDashUwp.winrtDashUwpStrings.gattserviceschanged
import typings.winrtDashUwp.winrtDashUwpStrings.namechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Bluetooth LE device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothLEDevice")
@js.native
abstract class BluetoothLEDevice () extends js.Object {
  /** Gets the BluetoothLEAppearance object for the Bluetooth LE device. */
  var appearance: BluetoothLEAppearance = js.native
  /** Gets the device address. */
  var bluetoothAddress: Double = js.native
  /** Gets the address type for the Bluetooth LE device. */
  var bluetoothAddressType: BluetoothAddressType = js.native
  /** Gets the connection status of the device. */
  var connectionStatus: BluetoothConnectionStatus = js.native
  /** Gets the device Id. */
  var deviceId: String = js.native
  /** Gets the DeviceInformation object for the Bluetooth LE device. */
  var deviceInformation: DeviceInformation = js.native
  /** Gets the read-only list of GATT services supported by the device. */
  var gattServices: IVectorView[GattDeviceService] = js.native
  /** Gets the name of the Bluetooth LE device. */
  var name: String = js.native
  /** Occurs when the connection status for the device has changed. */
  @JSName("onconnectionstatuschanged")
  var onconnectionstatuschanged_Original: TypedEventHandler[BluetoothLEDevice, _] = js.native
  /** Occurs when the list of GATT services supported by the device has changed. */
  @JSName("ongattserviceschanged")
  var ongattserviceschanged_Original: TypedEventHandler[BluetoothLEDevice, _] = js.native
  /** Occurs when the name of the device has changed. */
  @JSName("onnamechanged")
  var onnamechanged_Original: TypedEventHandler[BluetoothLEDevice, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[BluetoothLEDevice, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gattserviceschanged(`type`: gattserviceschanged, listener: TypedEventHandler[BluetoothLEDevice, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_namechanged(`type`: namechanged, listener: TypedEventHandler[BluetoothLEDevice, _]): Unit = js.native
  /** Closes this Bluetooth LE device. */
  def close(): Unit = js.native
  /**
    * Returns the GATT service with the given service Id.
    * @param serviceUuid The service Id of the GATT service.
    * @return The GATT service represented by the given service Id.
    */
  def getGattService(serviceUuid: String): GattDeviceService = js.native
  /** Occurs when the connection status for the device has changed. */
  def onconnectionstatuschanged(ev: js.Any with WinRTEvent[BluetoothLEDevice]): Unit = js.native
  /** Occurs when the list of GATT services supported by the device has changed. */
  def ongattserviceschanged(ev: js.Any with WinRTEvent[BluetoothLEDevice]): Unit = js.native
  /** Occurs when the name of the device has changed. */
  def onnamechanged(ev: js.Any with WinRTEvent[BluetoothLEDevice]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[BluetoothLEDevice, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gattserviceschanged(`type`: gattserviceschanged, listener: TypedEventHandler[BluetoothLEDevice, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_namechanged(`type`: namechanged, listener: TypedEventHandler[BluetoothLEDevice, _]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothLEDevice")
@js.native
object BluetoothLEDevice extends js.Object {
  /**
    * Returns a BluetoothLEDevice object for the given BluetoothAddress value and BluetoothAddressType value.
    * @param bluetoothAddress The 64-bit address of the Bluetooth LE device.
    * @param bluetoothAddressType The address type of the Bluetooth LE device.
    * @return Returns an asynchronous operation that completes with the BluetoothLEDevice object.
    */
  def fromBluetoothAddressAsync(bluetoothAddress: Double, bluetoothAddressType: BluetoothAddressType): IPromiseWithIAsyncOperation[BluetoothLEDevice] = js.native
  /**
    * Returns a BluetoothLEDevice object for the given Id.
    * @param deviceId The Id of the Bluetooth LE device.
    * @return After the asynchronous operation completes, returns the BluetoothLEDevice object with the given Id.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[BluetoothLEDevice] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string for identifying all Bluetooth Low Energy (LE) devices. This string is passed to the FindAllAsync or CreateWatcher method in order to get a list of Bluetooth LE devices.
    * @return The device selector for this device.
    */
  def getDeviceSelector(): String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a BluetoothLEAppearance object. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects with the specified appearance.
    * @param appearance The Bluetooth LE appearance used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromAppearance(appearance: BluetoothLEAppearance): String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a 64-bit address that represents a Bluetooth LE device. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param bluetoothAddress A 64-bit Bluetooth LE device address used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromBluetoothAddress(bluetoothAddress: Double): String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a 64-bit address and address type that represents a Bluetooth LE device. The AQS string is passed into the CreateWatcher method.
    * @param bluetoothAddress A 64-bit Bluetooth LE device address used for constructing the AQS string.
    * @param bluetoothAddressType The Bluetooth LE device address type.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromBluetoothAddress(bluetoothAddress: Double, bluetoothAddressType: BluetoothAddressType): String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth LE devices with the indicated BluetoothConnectionStatus . The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects with the indicated Bluetooth connection status.
    * @param connectionStatus The connection status used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromConnectionStatus(connectionStatus: BluetoothConnectionStatus): String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for the Bluetooth LE device name. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects containing the specified Bluetooth LE device name.
    * @param deviceName The Bluetooth LE device name used for constructing the AQS string.
    * @return An AQS string that is passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromDeviceName(deviceName: String): String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth LE devices that are either paired or unpaired. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param pairingState The current pairing state for Bluetooth LE devices used for constructing the AQS string. Bluetooth LE devices can be either paired (true) or unpaired (false). The AQS Filter string will request scanning to be performed when the pairingState is false.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromPairingState(pairingState: Boolean): String = js.native
}

