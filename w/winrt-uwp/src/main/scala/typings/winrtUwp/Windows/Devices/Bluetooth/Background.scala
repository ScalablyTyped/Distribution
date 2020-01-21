package typings.winrtUwp.Windows.Devices.Bluetooth

import typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus
import typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementReceivedEventArgs
import typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.Sockets.StreamSocket
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides class describing trigger details for Bluetooth triggers. */
@JSGlobal("Windows.Devices.Bluetooth.Background")
@js.native
object Background extends js.Object {
  /** Provides information about a BluetoothLEAdvertisementPublisher trigger. */
  @js.native
  abstract class BluetoothLEAdvertisementPublisherTriggerDetails () extends js.Object {
    /** Gets the error status for the trigger. */
    var error: BluetoothError = js.native
    /** Gets the current status of the BluetoothLEAdvertisementPublisher . */
    var status: BluetoothLEAdvertisementPublisherStatus = js.native
  }
  
  /** Provides information about a BluetoothLEAdvertisementWatcher trigger. */
  @js.native
  abstract class BluetoothLEAdvertisementWatcherTriggerDetails () extends js.Object {
    /** Gets a collection of Bluetooth LE advertisements. */
    var advertisements: IVectorView[BluetoothLEAdvertisementReceivedEventArgs] = js.native
    /** Gets the error status for the trigger. */
    var error: BluetoothError = js.native
    /** Gets the parameters used to configure received signal strength indicator (RSSI)-based filtering. */
    var signalStrengthFilter: BluetoothSignalStrengthFilter = js.native
  }
  
  /** Provides information about the Bluetooth LE device that caused this trigger to fire. */
  @js.native
  abstract class GattCharacteristicNotificationTriggerDetails () extends js.Object {
    /** Gets the GATT characteristic that changed. */
    var characteristic: GattCharacteristic = js.native
    /** Gets a byte stream containing the new value of the characteristic. */
    var value: IBuffer = js.native
  }
  
  /** Provides information about the Bluetooth device that caused this trigger to fire. */
  @js.native
  abstract class RfcommConnectionTriggerDetails () extends js.Object {
    /** Gets whether this is an incoming connection. */
    var incoming: Boolean = js.native
    /** Gets the BluetoothDevice object that represents the remote device. */
    var remoteDevice: BluetoothDevice = js.native
    /** Gets a reference to the underlying StreamSocket of this connection. */
    var socket: StreamSocket = js.native
  }
  
  /** Provides information about incoming RFCOMM connections. If an app wants the system to listen for incoming connections on behalf of an RfcommConnectionTrigger , the app must create this object and attach it to the RfcommConnectionTrigger. */
  @js.native
  abstract class RfcommInboundConnectionInformation () extends js.Object {
    /** Gets or sets the service UUID that will be advertised in the SDP record. */
    var localServiceId: RfcommServiceId = js.native
    /** Gets or sets the Bluetooth SDP record that the system will advertise on behalf of the app. */
    var sdpRecord: IBuffer = js.native
    /** Gets or sets the service capabilities that will be advertised. */
    var serviceCapabilities: BluetoothServiceCapabilities = js.native
  }
  
  /** Provides information for RFCOMM outbound connections. If an app wants the system to create outbound connections on its behalf, the app must create this object and attach it to the RfcommConnectionTrigger . */
  @js.native
  abstract class RfcommOutboundConnectionInformation () extends js.Object {
    /** Gets or sets the service UUID of the remote service to which the system will connect on behalf of the app. */
    var remoteServiceId: RfcommServiceId = js.native
  }
  
}

