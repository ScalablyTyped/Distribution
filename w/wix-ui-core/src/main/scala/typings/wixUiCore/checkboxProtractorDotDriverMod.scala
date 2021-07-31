package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.commonBaseDriverProtractorMod.BaseDriver
import typings.wixUiCore.commonBaseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxProtractorDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/checkbox/Checkbox.protractor.driver", "checkboxDriverFactory")
  @js.native
  val checkboxDriverFactory: DriverFactory[CheckboxDriver] = js.native
  
  trait CheckboxDriver
    extends StObject
       with BaseDriver {
    
    def click(): js.Promise[Unit]
    
    def isChecked(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
  }
  object CheckboxDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => ElementFinder,
      isChecked: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean]
    ): CheckboxDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[CheckboxDriver]
    }
    
    @scala.inline
    implicit class CheckboxDriverMutableBuilder[Self <: CheckboxDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsChecked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    }
  }
}
