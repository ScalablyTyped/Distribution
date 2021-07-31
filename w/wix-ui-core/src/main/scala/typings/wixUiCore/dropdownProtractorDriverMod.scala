package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverProtractorMod.DriverFactory
import typings.wixUiCore.dropdownContentProtractorDriverMod.DropdownContentDriver
import typings.wixUiCore.popoverProtractorDriverMod.PopoverDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/dropdown/Dropdown.protractor.driver", "dropdownDriverFactory")
  @js.native
  val dropdownDriverFactory: DriverFactory[DropdownDriver] = js.native
  
  trait DropdownDriver
    extends StObject
       with PopoverDriver {
    
    def dropdownContent(): DropdownContentDriver
  }
  object DropdownDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      dropdownContent: () => DropdownContentDriver,
      element: () => ElementFinder,
      getContentElement: () => ElementFinder,
      getTargetElement: () => ElementFinder,
      isContentElementExists: () => js.Promise[Boolean],
      isTargetElementExists: () => js.Promise[Boolean],
      mouseEnter: () => js.Promise[Unit],
      mouseLeave: () => js.Promise[Unit]
    ): DropdownDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), dropdownContent = js.Any.fromFunction0(dropdownContent), element = js.Any.fromFunction0(element), getContentElement = js.Any.fromFunction0(getContentElement), getTargetElement = js.Any.fromFunction0(getTargetElement), isContentElementExists = js.Any.fromFunction0(isContentElementExists), isTargetElementExists = js.Any.fromFunction0(isTargetElementExists), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave))
      __obj.asInstanceOf[DropdownDriver]
    }
    
    @scala.inline
    implicit class DropdownDriverMutableBuilder[Self <: DropdownDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropdownContent(value: () => DropdownContentDriver): Self = StObject.set(x, "dropdownContent", js.Any.fromFunction0(value))
    }
  }
}
