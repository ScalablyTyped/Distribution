package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothLEAdvertisementPublisherStatus extends js.Object
/** Represents the possible states of the BluetoothLEAdvertisementPublisher . */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus")
@js.native
object BluetoothLEAdvertisementPublisherStatus extends js.Object {
  
  /** The publisher is aborted due to an error. */
  @js.native
  sealed trait aborted extends BluetoothLEAdvertisementPublisherStatus
  
  /** The initial status of the publisher. */
  @js.native
  sealed trait created extends BluetoothLEAdvertisementPublisherStatus
  
  /** The publisher is being serviced and has started advertising. */
  @js.native
  sealed trait started extends BluetoothLEAdvertisementPublisherStatus
  
  /** The publisher has stopped advertising. */
  @js.native
  sealed trait stopped extends BluetoothLEAdvertisementPublisherStatus
  
  /** The publisher was issued a stop command. */
  @js.native
  sealed trait stopping extends BluetoothLEAdvertisementPublisherStatus
  
  /** The publisher is waiting to get service time. */
  @js.native
  sealed trait waiting extends BluetoothLEAdvertisementPublisherStatus
}
