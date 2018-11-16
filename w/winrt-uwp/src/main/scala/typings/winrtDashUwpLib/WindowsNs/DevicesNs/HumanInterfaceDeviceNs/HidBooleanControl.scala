package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a simple Boolean control on a HID device that returns on/off values. An example would be the LED light on a keyboard. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidBooleanControl")
@js.native
abstract class HidBooleanControl () extends js.Object {
  /** Retrieves a description of the given Boolean control. */
  var controlDescription: HidBooleanControlDescription = js.native
  /** Retrieves the identifier for a given Boolean control. */
  var id: scala.Double = js.native
  /** Retrieves a Boolean value indicating whether the given Boolean control is active. */
  var isActive: scala.Boolean = js.native
  /** Retrieves the usage identifier associated with the given Boolean control. */
  var usageId: scala.Double = js.native
  /** Retrieves the usage page for a given Boolean control. */
  var usagePage: scala.Double = js.native
}

