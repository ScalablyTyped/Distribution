package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

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
  sealed trait connectableDirected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementType
  
  /** The advertisement is undirected and indicates that the device is connectable and scannable. This advertisement type can carry data. */
  @js.native
  sealed trait connectableUndirected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementType
  
  /** The advertisement is undirected and indicates that the device is not connectable nor scannable. This advertisement type can carry data. */
  @js.native
  sealed trait nonConnectableUndirected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementType
  
  /** This advertisement is a scan response to a scan request issued for a scannable advertisement. This advertisement type can carry data. */
  @js.native
  sealed trait scanResponse
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementType
  
  /** The advertisement is undirected and indicates that the device is scannable but not connectable. This advertisement type can carry data. */
  @js.native
  sealed trait scannableUndirected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementType
  
  /* 1 */ val connectableDirected: connectableDirected with scala.Double = js.native
  /* 0 */ val connectableUndirected: connectableUndirected with scala.Double = js.native
  /* 3 */ val nonConnectableUndirected: nonConnectableUndirected with scala.Double = js.native
  /* 4 */ val scanResponse: scanResponse with scala.Double = js.native
  /* 2 */ val scannableUndirected: scannableUndirected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementType with scala.Double
  ] = js.native
}

