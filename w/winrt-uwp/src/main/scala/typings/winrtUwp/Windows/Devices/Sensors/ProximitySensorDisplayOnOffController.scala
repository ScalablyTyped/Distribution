package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a controller responsible for turning on or off the phone display based on the readings from the ProximitySensor . */
@JSGlobal("Windows.Devices.Sensors.ProximitySensorDisplayOnOffController")
@js.native
abstract class ProximitySensorDisplayOnOffController () extends js.Object {
  /** Disconnects this ProximitySensorDisplayOnOffController instance from the service and frees all the allocated resources. */
  def close(): Unit = js.native
}

