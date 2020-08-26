package typings.winrtUwp.Windows.Devices.Custom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents IO control code. */
@js.native
trait IIOControlCode extends js.Object {
  /** The access mode. */
  var accessMode: IOControlAccessMode = js.native
  /** The buffering method. */
  var bufferingMethod: IOControlBufferingMethod = js.native
  /** The control code. */
  var controlCode: Double = js.native
  /** The device type. */
  var deviceType: Double = js.native
  /** The function. */
  var function: Double = js.native
}

object IIOControlCode {
  @scala.inline
  def apply(
    accessMode: IOControlAccessMode,
    bufferingMethod: IOControlBufferingMethod,
    controlCode: Double,
    deviceType: Double,
    function: Double
  ): IIOControlCode = {
    val __obj = js.Dynamic.literal(accessMode = accessMode.asInstanceOf[js.Any], bufferingMethod = bufferingMethod.asInstanceOf[js.Any], controlCode = controlCode.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIOControlCode]
  }
  @scala.inline
  implicit class IIOControlCodeOps[Self <: IIOControlCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessMode(value: IOControlAccessMode): Self = this.set("accessMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setBufferingMethod(value: IOControlBufferingMethod): Self = this.set("bufferingMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlCode(value: Double): Self = this.set("controlCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceType(value: Double): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunction(value: Double): Self = this.set("function", value.asInstanceOf[js.Any])
  }
  
}

