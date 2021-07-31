package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.commonBaseDriverProtractorMod.BaseDriver
import typings.wixUiCore.commonBaseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonProtractorDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/radio-button/RadioButton.protractor.driver", "radioButtonDriverFactory")
  @js.native
  val radioButtonDriverFactory: DriverFactory[RadioButtonDriver] = js.native
  
  trait RadioButtonDriver
    extends StObject
       with BaseDriver {
    
    def isSelected(): js.Promise[Boolean]
    
    def select(): js.Promise[Unit]
  }
  object RadioButtonDriver {
    
    @scala.inline
    def apply(
      element: () => ElementFinder,
      isSelected: () => js.Promise[Boolean],
      select: () => js.Promise[Unit]
    ): RadioButtonDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), isSelected = js.Any.fromFunction0(isSelected), select = js.Any.fromFunction0(select))
      __obj.asInstanceOf[RadioButtonDriver]
    }
    
    @scala.inline
    implicit class RadioButtonDriverMutableBuilder[Self <: RadioButtonDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSelected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSelect(value: () => js.Promise[Unit]): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
    }
  }
}
