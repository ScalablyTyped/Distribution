package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OpenStatus extends js.Object {
  /** An enumeration value that indicates either that the attempt to open the GPIO pin succeeded, or the reason that the attempt to open the GPIO pin failed. */ var openStatus: winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioOpenStatus
  /** The opened GPIO pin if the return value is true; otherwise null. */ var pin: winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPin
  /** True if the method successfully opened the pin; otherwise false. */ var returnValue: scala.Boolean
}

