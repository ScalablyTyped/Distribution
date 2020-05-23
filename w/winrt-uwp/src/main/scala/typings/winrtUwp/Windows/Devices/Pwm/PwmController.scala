package typings.winrtUwp.Windows.Devices.Pwm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PwmController extends js.Object {
   /* unmapped type */ var actualFrequency: js.Any
   /* unmapped type */ var maxFrequency: js.Any
   /* unmapped type */ var minFrequency: js.Any
   /* unmapped type */ var openPin: js.Any
   /* unmapped type */ var pinCount: js.Any
   /* unmapped type */ var setDesiredFrequency: js.Any
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
}

