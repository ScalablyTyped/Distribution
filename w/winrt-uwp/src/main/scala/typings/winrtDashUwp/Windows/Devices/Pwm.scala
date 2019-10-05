package typings.winrtDashUwp.Windows.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Pwm")
@js.native
object Pwm extends js.Object {
  @js.native
  abstract class PwmController () extends js.Object {
     /* unmapped type */ var actualFrequency: js.Any = js.native
     /* unmapped type */ var maxFrequency: js.Any = js.native
     /* unmapped type */ var minFrequency: js.Any = js.native
     /* unmapped type */ var openPin: js.Any = js.native
     /* unmapped type */ var pinCount: js.Any = js.native
     /* unmapped type */ var setDesiredFrequency: js.Any = js.native
  }
  
  @js.native
  abstract class PwmPin () extends js.Object {
    var close: js.Any = js.native
     /* unmapped type */ var controller: js.Any = js.native
     /* unmapped type */ var getActiveDutyCyclePercentage: js.Any = js.native
     /* unmapped type */ var isStarted: js.Any = js.native
     /* unmapped type */ var polarity: js.Any = js.native
     /* unmapped type */ var setActiveDutyCyclePercentage: js.Any = js.native
     /* unmapped type */ var start: js.Any = js.native
     /* unmapped type */ var stop: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object PwmController extends js.Object {
    var getControllersAsync: js.Any = js.native
     /* unmapped type */ var getDefaultAsync: js.Any = js.native
  }
  
  @js.native
  object PwmPulsePolarity extends js.Object {
    var activeHigh: js.Any = js.native
    var activeLow: js.Any = js.native
  }
  
}

