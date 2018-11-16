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
  
  val connectableDirected: connectableDirected with java.lang.String = js.native
  val connectableUndirected: connectableUndirected with java.lang.String = js.native
  val nonConnectableUndirected: nonConnectableUndirected with java.lang.String = js.native
  val scanResponse: scanResponse with java.lang.String = js.native
  val scannableUndirected: scannableUndirected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementType with java.lang.String
  ] = js.native
}

