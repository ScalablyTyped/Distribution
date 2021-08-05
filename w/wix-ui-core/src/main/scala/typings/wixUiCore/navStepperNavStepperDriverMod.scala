package typings.wixUiCore

import typings.std.Element
import typings.std.HTMLLIElement
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.createDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navStepperNavStepperDriverMod {
  
  @JSImport("wix-ui-core/src/components/nav-stepper/NavStepper.driver", "NavStepperDriver")
  @js.native
  class NavStepperDriver protected ()
    extends StObject
       with BaseDriver {
    def this(element: Element) = this()
    
    /** returns the active step element */
    def activeStep(): HTMLLIElement = js.native
    
    def clickOnStep(index: Double): Unit = js.native
    
    /* private */ val element: js.Any = js.native
    
    /* CompleteClass */
    override def exists(): Boolean = js.native
    
    /* private */ val hasStyleState: js.Any = js.native
    
    /** checks if a step is active */
    def isStepActive(index: Double): Boolean = js.native
    
    /** checks if a step is disabled */
    def isStepDisabled(index: Double): Boolean = js.native
    
    /** checks if a step is visited */
    def isStepVisited(index: Double): Boolean = js.native
    
    /**  returns the root element */
    def root(): Element = js.native
    
    /* private */ val stepAt: js.Any = js.native
    
    /** returns text content of a step */
    def stepContentAt(index: Double): String = js.native
    
    /* private */ val styleUtil: js.Any = js.native
  }
  
  @JSImport("wix-ui-core/src/components/nav-stepper/NavStepper.driver", "navStepperDriverFactory")
  @js.native
  val navStepperDriverFactory: DriverFactory[NavStepperDriver] = js.native
}
