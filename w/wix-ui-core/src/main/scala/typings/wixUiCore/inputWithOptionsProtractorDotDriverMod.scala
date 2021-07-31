package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.commonBaseDriverProtractorMod.DriverFactory
import typings.wixUiCore.dropdownContentProtractorDotDriverMod.DropdownContentDriver
import typings.wixUiCore.dropdownProtractorDotDriverMod.DropdownDriver
import typings.wixUiCore.inputProtractorDotDriverMod.InputDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputWithOptionsProtractorDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/input-with-options/InputWithOptions.protractor.driver", "inputWithOptionsDriverFactory")
  @js.native
  val inputWithOptionsDriverFactory: DriverFactory[InputWithOptionsDriver] = js.native
  
  trait InputWithOptionsDriver
    extends StObject
       with InputDriver
       with DropdownDriver
  object InputWithOptionsDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      dropdownContent: () => DropdownContentDriver,
      element: () => ElementFinder,
      enterText: String => js.Promise[Unit],
      focus: () => js.Promise[Unit],
      getContentElement: () => ElementFinder,
      getTargetElement: () => ElementFinder,
      getText: () => js.Promise[String],
      isContentElementExists: () => js.Promise[Boolean],
      isTargetElementExists: () => js.Promise[Boolean],
      mouseEnter: () => js.Promise[Unit],
      mouseLeave: () => js.Promise[Unit],
      pressKey: String => js.Promise[Unit]
    ): InputWithOptionsDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), dropdownContent = js.Any.fromFunction0(dropdownContent), element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), focus = js.Any.fromFunction0(focus), getContentElement = js.Any.fromFunction0(getContentElement), getTargetElement = js.Any.fromFunction0(getTargetElement), getText = js.Any.fromFunction0(getText), isContentElementExists = js.Any.fromFunction0(isContentElementExists), isTargetElementExists = js.Any.fromFunction0(isTargetElementExists), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave), pressKey = js.Any.fromFunction1(pressKey))
      __obj.asInstanceOf[InputWithOptionsDriver]
    }
  }
}
