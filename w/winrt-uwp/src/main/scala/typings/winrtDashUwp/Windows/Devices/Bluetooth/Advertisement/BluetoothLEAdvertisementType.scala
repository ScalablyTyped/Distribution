package typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothLEAdvertisementType extends js.Object

/** Specifies the different types of Bluetooth LE advertisement payloads. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType")
@js.native
object BluetoothLEAdvertisementType extends js.Object {
  /** The advertisement is directed and indicates that the device is connectable but not scannable. This advertisement type cannot carry data. */
  @js.native
  sealed trait connectableDirected extends BluetoothLEAdvertisementType
  
  /** The advertisement is undirected and indicates that the device is connectable and scannable. This advertisement type can carry data. */
  @js.native
  sealed trait connectableUndirected extends BluetoothLEAdvertisementType
  
  /** The advertisement is undirected and indicates that the device is not connectable nor scannable. This advertisement type can carry data. */
  @js.native
  sealed trait nonConnectableUndirected extends BluetoothLEAdvertisementType
  
  /** This advertisement is a scan response to a scan request issued for a scannable advertisement. This advertisement type can carry data. */
  @js.native
  sealed trait scanResponse extends BluetoothLEAdvertisementType
  
  /** The advertisement is undirected and indicates that the device is scannable but not connectable. This advertisement type can carry data. */
  @js.native
  sealed trait scannableUndirected extends BluetoothLEAdvertisementType
  
  /* 1 */ val connectableDirected: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.connectableDirected with Double = js.native
  /* 0 */ val connectableUndirected: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.connectableUndirected with Double = js.native
  /* 3 */ val nonConnectableUndirected: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.nonConnectableUndirected with Double = js.native
  /* 4 */ val scanResponse: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.scanResponse with Double = js.native
  /* 2 */ val scannableUndirected: typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.scannableUndirected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothLEAdvertisementType with Double] = js.native
}

