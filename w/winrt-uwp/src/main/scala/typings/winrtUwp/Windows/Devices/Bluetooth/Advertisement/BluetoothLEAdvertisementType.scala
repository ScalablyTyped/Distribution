package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothLEAdvertisementType with Double] = js.native
  /* 1 */ @js.native
  object connectableDirected extends TopLevel[connectableDirected with Double]
  
  /* 0 */ @js.native
  object connectableUndirected extends TopLevel[connectableUndirected with Double]
  
  /* 3 */ @js.native
  object nonConnectableUndirected extends TopLevel[nonConnectableUndirected with Double]
  
  /* 4 */ @js.native
  object scanResponse extends TopLevel[scanResponse with Double]
  
  /* 2 */ @js.native
  object scannableUndirected extends TopLevel[scannableUndirected with Double]
  
}

