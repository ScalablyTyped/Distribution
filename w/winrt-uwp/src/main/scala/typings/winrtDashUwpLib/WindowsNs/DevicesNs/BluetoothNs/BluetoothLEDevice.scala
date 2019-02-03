package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs

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
  var bluetoothAddress: scala.Double = js.native
  /** Gets the address type for the Bluetooth LE device. */
  var bluetoothAddressType: BluetoothAddressType = js.native
  /** Gets the connection status of the device. */
  var connectionStatus: BluetoothConnectionStatus = js.native
  /** Gets the device Id. */
  var deviceId: java.lang.String = js.native
  /** Gets the DeviceInformation object for the Bluetooth LE device. */
  var deviceInformation: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation = js.native
  /** Gets the read-only list of GATT services supported by the device. */
  var gattServices: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattDeviceService
  ] = js.native
  /** Gets the name of the Bluetooth LE device. */
  var name: java.lang.String = js.native
  /** Occurs when the connection status for the device has changed. */
  @JSName("onconnectionstatuschanged")
  var onconnectionstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEDevice, _] = js.native
  /** Occurs when the list of GATT services supported by the device has changed. */
  @JSName("ongattserviceschanged")
  var ongattserviceschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEDevice, _] = js.native
  /** Occurs when the name of the device has changed. */
  @JSName("onnamechanged")
  var onnamechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEDevice, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.connectionstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEDevice, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gattserviceschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.gattserviceschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEDevice, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_namechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.namechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEDevice, _]
  ): scala.Unit = js.native
  /** Closes this Bluetooth LE device. */
  def close(): scala.Unit = js.native
  /**
    * Returns the GATT service with the given service Id.
    * @param serviceUuid The service Id of the GATT service.
    * @return The GATT service represented by the given service Id.
    */
  def getGattService(serviceUuid: java.lang.String): winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattDeviceService = js.native
  /** Occurs when the connection status for the device has changed. */
  def onconnectionstatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[BluetoothLEDevice]): scala.Unit = js.native
  /** Occurs when the list of GATT services supported by the device has changed. */
  def ongattserviceschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[BluetoothLEDevice]): scala.Unit = js.native
  /** Occurs when the name of the device has changed. */
  def onnamechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[BluetoothLEDevice]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.connectionstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEDevice, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gattserviceschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.gattserviceschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEDevice, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_namechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.namechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BluetoothLEDevice, _]
  ): scala.Unit = js.native
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
  def fromBluetoothAddressAsync(
    bluetoothAddress: scala.Double,
    bluetoothAddressType: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothAddressType
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothLEDevice] = js.native
  /**
    * Returns a BluetoothLEDevice object for the given Id.
    * @param deviceId The Id of the Bluetooth LE device.
    * @return After the asynchronous operation completes, returns the BluetoothLEDevice object with the given Id.
    */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothLEDevice] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string for identifying all Bluetooth Low Energy (LE) devices. This string is passed to the FindAllAsync or CreateWatcher method in order to get a list of Bluetooth LE devices.
    * @return The device selector for this device.
    */
  def getDeviceSelector(): java.lang.String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a BluetoothLEAppearance object. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects with the specified appearance.
    * @param appearance The Bluetooth LE appearance used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromAppearance(appearance: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothLEAppearance): java.lang.String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a 64-bit address that represents a Bluetooth LE device. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param bluetoothAddress A 64-bit Bluetooth LE device address used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromBluetoothAddress(bluetoothAddress: scala.Double): java.lang.String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a 64-bit address and address type that represents a Bluetooth LE device. The AQS string is passed into the CreateWatcher method.
    * @param bluetoothAddress A 64-bit Bluetooth LE device address used for constructing the AQS string.
    * @param bluetoothAddressType The Bluetooth LE device address type.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromBluetoothAddress(
    bluetoothAddress: scala.Double,
    bluetoothAddressType: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothAddressType
  ): java.lang.String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth LE devices with the indicated BluetoothConnectionStatus . The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects with the indicated Bluetooth connection status.
    * @param connectionStatus The connection status used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromConnectionStatus(connectionStatus: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothConnectionStatus): java.lang.String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for the Bluetooth LE device name. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects containing the specified Bluetooth LE device name.
    * @param deviceName The Bluetooth LE device name used for constructing the AQS string.
    * @return An AQS string that is passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromDeviceName(deviceName: java.lang.String): java.lang.String = js.native
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth LE devices that are either paired or unpaired. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param pairingState The current pairing state for Bluetooth LE devices used for constructing the AQS string. Bluetooth LE devices can be either paired (true) or unpaired (false). The AQS Filter string will request scanning to be performed when the pairingState is false.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  def getDeviceSelectorFromPairingState(pairingState: scala.Boolean): java.lang.String = js.native
}

