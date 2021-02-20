package typings.winrtUwp.global.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pwm {
  
  @JSGlobal("Windows.Devices.Pwm.PwmController")
  @js.native
  abstract class PwmController ()
    extends typings.winrtUwp.Windows.Devices.Pwm.PwmController
  object PwmController {
    
    @JSGlobal("Windows.Devices.Pwm.PwmController")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.Devices.Pwm.PwmController.getControllersAsync")
    @js.native
    def getControllersAsync: js.Any = js.native
    @scala.inline
    def getControllersAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getControllersAsync")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /* static member */
    @JSGlobal("Windows.Devices.Pwm.PwmController.getDefaultAsync")
    @js.native
    def getDefaultAsync: js.Any = js.native
    @scala.inline
    def getDefaultAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultAsync")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Devices.Pwm.PwmPin")
  @js.native
  abstract class PwmPin ()
    extends typings.winrtUwp.Windows.Devices.Pwm.PwmPin
  
  object PwmPulsePolarity {
    
    @JSGlobal("Windows.Devices.Pwm.PwmPulsePolarity")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Devices.Pwm.PwmPulsePolarity.activeHigh")
    @js.native
    def activeHigh: js.Any = js.native
    @scala.inline
    def activeHigh_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeHigh")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    @JSGlobal("Windows.Devices.Pwm.PwmPulsePolarity.activeLow")
    @js.native
    def activeLow: js.Any = js.native
    @scala.inline
    def activeLow_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeLow")(x.asInstanceOf[js.Any])
  }
}
