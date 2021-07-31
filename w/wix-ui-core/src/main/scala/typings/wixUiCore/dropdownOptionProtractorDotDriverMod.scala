package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.commonBaseDriverProtractorMod.BaseDriver
import typings.wixUiCore.commonBaseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownOptionProtractorDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/dropdown-option/DropdownOption.protractor.driver", "dropdownOptionDriverFactory")
  @js.native
  val dropdownOptionDriverFactory: DriverFactory[DropdownOptionDriver] = js.native
  
  trait DropdownOptionDriver
    extends StObject
       with BaseDriver {
    
    def click(): js.Promise[Unit]
    
    def getText(): js.Promise[String]
  }
  object DropdownOptionDriver {
    
    @scala.inline
    def apply(click: () => js.Promise[Unit], element: () => ElementFinder, getText: () => js.Promise[String]): DropdownOptionDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), getText = js.Any.fromFunction0(getText))
      __obj.asInstanceOf[DropdownOptionDriver]
    }
    
    @scala.inline
    implicit class DropdownOptionDriverMutableBuilder[Self <: DropdownOptionDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    }
  }
}
