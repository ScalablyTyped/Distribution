package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothLEAdvertisementPublisherStatus extends js.Object

/** Represents the possible states of the BluetoothLEAdvertisementPublisher . */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus")
@js.native
object BluetoothLEAdvertisementPublisherStatus extends js.Object {
  /** The publisher is aborted due to an error. */
  @js.native
  sealed trait aborted
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementPublisherStatus
  
  /** The initial status of the publisher. */
  @js.native
  sealed trait created
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementPublisherStatus
  
  /** The publisher is being serviced and has started advertising. */
  @js.native
  sealed trait started
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementPublisherStatus
  
  /** The publisher has stopped advertising. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementPublisherStatus
  
  /** The publisher was issued a stop command. */
  @js.native
  sealed trait stopping
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementPublisherStatus
  
  /** The publisher is waiting to get service time. */
  @js.native
  sealed trait waiting
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementPublisherStatus
  
  /* 5 */ val aborted: aborted with scala.Double = js.native
  /* 0 */ val created: created with scala.Double = js.native
  /* 2 */ val started: started with scala.Double = js.native
  /* 4 */ val stopped: stopped with scala.Double = js.native
  /* 3 */ val stopping: stopping with scala.Double = js.native
  /* 1 */ val waiting: waiting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementPublisherStatus with scala.Double
  ] = js.native
}

