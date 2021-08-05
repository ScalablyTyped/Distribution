package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.commonBaseDriverProtractorMod.BaseDriver
import typings.wixUiCore.commonBaseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navStepperProtractorDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/nav-stepper/NavStepper.protractor.driver", "NavStepperDriver")
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
  
  @JSImport("wix-ui-core/src/components/nav-stepper/NavStepper.protractor.driver", "navStepperDriverFactory")
  @js.native
  val navStepperDriverFactory: DriverFactory[NavStepperDriver] = js.native
}
