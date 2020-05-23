package typings.winrtUwp.Windows.Devices.Custom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the control code. */
trait IOControlCode extends js.Object {
  /** The access mode. */
  var accessMode: IOControlAccessMode
  /** The buffering method. */
  var bufferingMethod: IOControlBufferingMethod
  /** The control code. */
  var controlCode: Double
  /** The device type. */
  var deviceType: Double
  /** The function. */
  var function: Double
}

object IOControlCode {
  @scala.inline
  def apply(
    accessMode: IOControlAccessMode,
    bufferingMethod: IOControlBufferingMethod,
    controlCode: Double,
    deviceType: Double,
    function: Double
  ): IOControlCode = {
    val __obj = js.Dynamic.literal(accessMode = accessMode.asInstanceOf[js.Any], bufferingMethod = bufferingMethod.asInstanceOf[js.Any], controlCode = controlCode.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOControlCode]
  }
}

