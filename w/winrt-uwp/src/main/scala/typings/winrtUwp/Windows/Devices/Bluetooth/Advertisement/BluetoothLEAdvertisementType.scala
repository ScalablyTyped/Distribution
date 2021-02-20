package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothLEAdvertisementType extends StObject
/** Specifies the different types of Bluetooth LE advertisement payloads. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType")
@js.native
object BluetoothLEAdvertisementType extends StObject {
  
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
}
