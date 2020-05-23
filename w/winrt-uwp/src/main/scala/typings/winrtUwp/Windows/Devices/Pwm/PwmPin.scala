package typings.winrtUwp.Windows.Devices.Pwm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PwmPin extends js.Object {
  var close: js.Any
   /* unmapped type */ var controller: js.Any
   /* unmapped type */ var getActiveDutyCyclePercentage: js.Any
   /* unmapped type */ var isStarted: js.Any
   /* unmapped type */ var polarity: js.Any
   /* unmapped type */ var setActiveDutyCyclePercentage: js.Any
   /* unmapped type */ var start: js.Any
   /* unmapped type */ var stop: js.Any
}

object PwmPin {
  @scala.inline
  def apply(
    close: js.Any,
    controller: js.Any,
    getActiveDutyCyclePercentage: js.Any,
    isStarted: js.Any,
    polarity: js.Any,
    setActiveDutyCyclePercentage: js.Any,
    start: js.Any,
    stop: js.Any
  ): PwmPin = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], getActiveDutyCyclePercentage = getActiveDutyCyclePercentage.asInstanceOf[js.Any], isStarted = isStarted.asInstanceOf[js.Any], polarity = polarity.asInstanceOf[js.Any], setActiveDutyCyclePercentage = setActiveDutyCyclePercentage.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PwmPin]
  }
}

