package typings.winrtUwp.global.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pwm {
  
  /* note: abstract class */ @JSGlobal("Windows.Devices.Pwm.PwmController")
  @js.native
  open class PwmController ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Pwm.PwmController {
    
    /* unmapped type */
    /* CompleteClass */
    var actualFrequency: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var maxFrequency: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var minFrequency: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var openPin: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var pinCount: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var setDesiredFrequency: Any = js.native
  }
  object PwmController {
    
    @JSGlobal("Windows.Devices.Pwm.PwmController")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.Devices.Pwm.PwmController.getControllersAsync")
    @js.native
    def getControllersAsync: Any = js.native
    inline def getControllersAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getControllersAsync")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /* static member */
    @JSGlobal("Windows.Devices.Pwm.PwmController.getDefaultAsync")
    @js.native
    def getDefaultAsync: Any = js.native
    inline def getDefaultAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultAsync")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSGlobal("Windows.Devices.Pwm.PwmPin")
  @js.native
  open class PwmPin ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Pwm.PwmPin {
    
    /* CompleteClass */
    var close: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var controller: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var getActiveDutyCyclePercentage: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var isStarted: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var polarity: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var setActiveDutyCyclePercentage: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var start: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var stop: Any = js.native
  }
  
  object PwmPulsePolarity {
    
    @JSGlobal("Windows.Devices.Pwm.PwmPulsePolarity")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Devices.Pwm.PwmPulsePolarity.activeHigh")
    @js.native
    def activeHigh: Any = js.native
    inline def activeHigh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeHigh")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    @JSGlobal("Windows.Devices.Pwm.PwmPulsePolarity.activeLow")
    @js.native
    def activeLow: Any = js.native
    inline def activeLow_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeLow")(x.asInstanceOf[js.Any])
  }
}
