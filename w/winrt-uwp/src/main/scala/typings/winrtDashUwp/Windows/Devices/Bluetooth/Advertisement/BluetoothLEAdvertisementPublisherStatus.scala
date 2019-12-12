package typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.aborted
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.created
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.started
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.stopped
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.stopping
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.waiting
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothLEAdvertisementPublisherStatus with Double] = js.native
  /* 5 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  /* 0 */ @js.native
  object created extends TopLevel[created with Double]
  
  /* 2 */ @js.native
  object started extends TopLevel[started with Double]
  
  /* 4 */ @js.native
  object stopped extends TopLevel[stopped with Double]
  
  /* 3 */ @js.native
  object stopping extends TopLevel[stopping with Double]
  
  /* 1 */ @js.native
  object waiting extends TopLevel[waiting with Double]
  
}

