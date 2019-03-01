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

object IIOControlCode {
  @scala.inline
  def apply(
    accessMode: IOControlAccessMode,
    bufferingMethod: IOControlBufferingMethod,
    controlCode: scala.Double,
    deviceType: scala.Double,
    function: scala.Double
  ): IIOControlCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessMode")(accessMode)
    __obj.updateDynamic("bufferingMethod")(bufferingMethod)
    __obj.updateDynamic("controlCode")(controlCode)
    __obj.updateDynamic("deviceType")(deviceType)
    __obj.updateDynamic("function")(function)
    __obj.asInstanceOf[IIOControlCode]
  }
}

