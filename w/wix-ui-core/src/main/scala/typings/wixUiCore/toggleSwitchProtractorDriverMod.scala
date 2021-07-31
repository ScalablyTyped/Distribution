package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverProtractorMod.BaseDriver
import typings.wixUiCore.baseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleSwitchProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/toggle-switch/ToggleSwitch.protractor.driver", "toggleSwitchDriverFactory")
  @js.native
  val toggleSwitchDriverFactory: DriverFactory[ToggleSwitchDriver] = js.native
  
  trait ToggleSwitchDriver
    extends StObject
       with BaseDriver {
    
    def checked(): js.Promise[Boolean]
    
    def click(): js.Promise[Unit]
    
    def isDisabled(): js.Promise[Boolean]
  }
  object ToggleSwitchDriver {
    
    @scala.inline
    def apply(
      checked: () => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      element: () => ElementFinder,
      isDisabled: () => js.Promise[Boolean]
    ): ToggleSwitchDriver = {
      val __obj = js.Dynamic.literal(checked = js.Any.fromFunction0(checked), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[ToggleSwitchDriver]
    }
    
    @scala.inline
    implicit class ToggleSwitchDriverMutableBuilder[Self <: ToggleSwitchDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "checked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    }
  }
}
