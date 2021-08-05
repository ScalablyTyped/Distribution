package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverDotprotractorMod.BaseDriver
import typings.wixUiCore.baseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navStepperDotProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/nav-stepper/NavStepper.protractor.driver", "NavStepperDriver")
  @js.native
  class NavStepperDriver protected ()
    extends StObject
       with BaseDriver {
    def this(component: ElementFinder) = this()
    
    /* private */ val component: js.Any = js.native
    
    /** Get root element of the component */
    /* CompleteClass */
    override def element(): ElementFinder = js.native
  }
  
  @JSImport("wix-ui-core/dist/standalone/src/components/nav-stepper/NavStepper.protractor.driver", "navStepperDriverFactory")
  @js.native
  val navStepperDriverFactory: DriverFactory[NavStepperDriver] = js.native
}
