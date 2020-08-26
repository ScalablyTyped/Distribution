package typings.winrtUwp.Windows.Devices.Pwm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PwmController extends js.Object {
   /* unmapped type */ var actualFrequency: js.Any = js.native
   /* unmapped type */ var maxFrequency: js.Any = js.native
   /* unmapped type */ var minFrequency: js.Any = js.native
   /* unmapped type */ var openPin: js.Any = js.native
   /* unmapped type */ var pinCount: js.Any = js.native
   /* unmapped type */ var setDesiredFrequency: js.Any = js.native
}

object PwmController {
  @scala.inline
  def apply(
    actualFrequency: js.Any,
    maxFrequency: js.Any,
    minFrequency: js.Any,
    openPin: js.Any,
    pinCount: js.Any,
    setDesiredFrequency: js.Any
  ): PwmController = {
    val __obj = js.Dynamic.literal(actualFrequency = actualFrequency.asInstanceOf[js.Any], maxFrequency = maxFrequency.asInstanceOf[js.Any], minFrequency = minFrequency.asInstanceOf[js.Any], openPin = openPin.asInstanceOf[js.Any], pinCount = pinCount.asInstanceOf[js.Any], setDesiredFrequency = setDesiredFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[PwmController]
  }
  @scala.inline
  implicit class PwmControllerOps[Self <: PwmController] (val x: Self) extends AnyVal {
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
    def setActualFrequency(value: js.Any): Self = this.set("actualFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxFrequency(value: js.Any): Self = this.set("maxFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinFrequency(value: js.Any): Self = this.set("minFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenPin(value: js.Any): Self = this.set("openPin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinCount(value: js.Any): Self = this.set("pinCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetDesiredFrequency(value: js.Any): Self = this.set("setDesiredFrequency", value.asInstanceOf[js.Any])
  }
  
}

