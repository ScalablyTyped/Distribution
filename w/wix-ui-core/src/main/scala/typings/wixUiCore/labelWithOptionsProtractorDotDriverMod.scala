package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.commonBaseDriverProtractorMod.DriverFactory
import typings.wixUiCore.dropdownContentProtractorDotDriverMod.DropdownContentDriver
import typings.wixUiCore.dropdownProtractorDotDriverMod.DropdownDriver
import typings.wixUiCore.labelProtractorDotDriverMod.LabelDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelWithOptionsProtractorDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/label-with-options/LabelWithOptions.protractor.driver", "labelWithOptionsDriverFactory")
  @js.native
  val labelWithOptionsDriverFactory: DriverFactory[LabelWithOptionsDriver] = js.native
  
  trait LabelWithOptionsDriver
    extends StObject
       with LabelDriver
       with DropdownDriver {
    
    /* InferMemberOverrides */
    override def click(): js.Promise[Unit]
    
    def isCheckboxModeOn(): js.Promise[Boolean]
  }
  object LabelWithOptionsDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      dropdownContent: () => DropdownContentDriver,
      element: () => ElementFinder,
      getContentElement: () => ElementFinder,
      getLabelText: () => js.Promise[String],
      getTargetElement: () => ElementFinder,
      isCheckboxModeOn: () => js.Promise[Boolean],
      isContentElementExists: () => js.Promise[Boolean],
      isTargetElementExists: () => js.Promise[Boolean],
      mouseEnter: () => js.Promise[Unit],
      mouseLeave: () => js.Promise[Unit]
    ): LabelWithOptionsDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), dropdownContent = js.Any.fromFunction0(dropdownContent), element = js.Any.fromFunction0(element), getContentElement = js.Any.fromFunction0(getContentElement), getLabelText = js.Any.fromFunction0(getLabelText), getTargetElement = js.Any.fromFunction0(getTargetElement), isCheckboxModeOn = js.Any.fromFunction0(isCheckboxModeOn), isContentElementExists = js.Any.fromFunction0(isContentElementExists), isTargetElementExists = js.Any.fromFunction0(isTargetElementExists), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave))
      __obj.asInstanceOf[LabelWithOptionsDriver]
    }
    
    @scala.inline
    implicit class LabelWithOptionsDriverMutableBuilder[Self <: LabelWithOptionsDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCheckboxModeOn(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCheckboxModeOn", js.Any.fromFunction0(value))
    }
  }
}
