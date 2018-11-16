package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents IO control code. */

trait IIOControlCode extends js.Object {
  /** The access mode. */
  var accessMode: IOControlAccessMode
  /** The buffering method. */
  var bufferingMethod: IOControlBufferingMethod
  /** The control code. */
  var controlCode: scala.Double
  /** The device type. */
  var deviceType: scala.Double
  /** The function. */
  var function: scala.Double
}

