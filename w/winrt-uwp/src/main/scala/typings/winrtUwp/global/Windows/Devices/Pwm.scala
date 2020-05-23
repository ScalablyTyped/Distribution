package typings.winrtUwp.global.Windows.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Pwm")
@js.native
object Pwm extends js.Object {
  @js.native
  abstract class PwmController ()
    extends typings.winrtUwp.Windows.Devices.Pwm.PwmController {
     /* unmapped type */ /* CompleteClass */
    override var actualFrequency: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var maxFrequency: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var minFrequency: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var openPin: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var pinCount: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var setDesiredFrequency: js.Any = js.native
  }
  
  @js.native
  abstract class PwmPin ()
    extends typings.winrtUwp.Windows.Devices.Pwm.PwmPin {
    /* CompleteClass */
    override var close: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var controller: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var getActiveDutyCyclePercentage: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var isStarted: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var polarity: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var setActiveDutyCyclePercentage: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var start: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var stop: js.Any = js.native
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

