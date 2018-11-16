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
  
  val aborted: aborted with java.lang.String = js.native
  val created: created with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  val stopping: stopping with java.lang.String = js.native
  val waiting: waiting with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementPublisherStatus with java.lang.String
  ] = js.native
}

