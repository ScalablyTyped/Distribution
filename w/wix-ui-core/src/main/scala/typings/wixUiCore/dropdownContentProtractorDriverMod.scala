package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverProtractorMod.BaseDriver
import typings.wixUiCore.baseDriverProtractorMod.DriverFactory
import typings.wixUiCore.dropdownOptionProtractorDriverMod.DropdownOptionDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownContentProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/dropdown-content/DropdownContent.protractor.driver", "dropdownContentDriverFactory")
  @js.native
  val dropdownContentDriverFactory: DriverFactory[DropdownContentDriver] = js.native
  
  trait DropdownContentDriver
    extends StObject
       with BaseDriver {
    
    def getOptionsCount(): js.Promise[Double]
    
    def optionAt(index: Double): DropdownOptionDriver
  }
  object DropdownContentDriver {
    
    inline def apply(
      element: () => ElementFinder,
      getOptionsCount: () => js.Promise[Double],
      optionAt: Double => DropdownOptionDriver
    ): DropdownContentDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), getOptionsCount = js.Any.fromFunction0(getOptionsCount), optionAt = js.Any.fromFunction1(optionAt))
      __obj.asInstanceOf[DropdownContentDriver]
    }
    
    extension [Self <: DropdownContentDriver](x: Self) {
      
      inline def setGetOptionsCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getOptionsCount", js.Any.fromFunction0(value))
      
      inline def setOptionAt(value: Double => DropdownOptionDriver): Self = StObject.set(x, "optionAt", js.Any.fromFunction1(value))
    }
  }
}
