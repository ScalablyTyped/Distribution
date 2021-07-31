package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverDotprotractorMod.BaseDriver
import typings.wixUiCore.baseDriverDotprotractorMod.DriverFactory
import typings.wixUiCore.dropdownOptionDotProtractorDriverMod.DropdownOptionDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownContentDotProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/dropdown-content/DropdownContent.protractor.driver", "dropdownContentDriverFactory")
  @js.native
  val dropdownContentDriverFactory: DriverFactory[DropdownContentDriver] = js.native
  
  trait DropdownContentDriver
    extends StObject
       with BaseDriver {
    
    def getOptionsCount(): js.Promise[Double]
    
    def optionAt(index: Double): DropdownOptionDriver
  }
  object DropdownContentDriver {
    
    @scala.inline
    def apply(
      element: () => ElementFinder,
      getOptionsCount: () => js.Promise[Double],
      optionAt: Double => DropdownOptionDriver
    ): DropdownContentDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), getOptionsCount = js.Any.fromFunction0(getOptionsCount), optionAt = js.Any.fromFunction1(optionAt))
      __obj.asInstanceOf[DropdownContentDriver]
    }
    
    @scala.inline
    implicit class DropdownContentDriverMutableBuilder[Self <: DropdownContentDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetOptionsCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getOptionsCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptionAt(value: Double => DropdownOptionDriver): Self = StObject.set(x, "optionAt", js.Any.fromFunction1(value))
    }
  }
}
