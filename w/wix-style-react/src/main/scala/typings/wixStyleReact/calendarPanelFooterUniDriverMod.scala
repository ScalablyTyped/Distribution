package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarPanelFooterUniDriverMod {
  
  trait CalendarPanelFooterUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnPrimaryButton(): js.Promise[Unit]
    
    def clickOnSecondaryButton(): js.Promise[Unit]
    
    def getPrimaryActionButtonLabel(): js.Promise[String]
    
    def getSecondaryActionButtonLabel(): js.Promise[String]
    
    def getSelectedDaysText(): js.Promise[String]
    
    def isPrimaryButtonDisabled(): js.Promise[Boolean]
  }
  object CalendarPanelFooterUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickOnPrimaryButton: () => js.Promise[Unit],
      clickOnSecondaryButton: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getPrimaryActionButtonLabel: () => js.Promise[String],
      getSecondaryActionButtonLabel: () => js.Promise[String],
      getSelectedDaysText: () => js.Promise[String],
      isPrimaryButtonDisabled: () => js.Promise[Boolean]
    ): CalendarPanelFooterUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOnPrimaryButton = js.Any.fromFunction0(clickOnPrimaryButton), clickOnSecondaryButton = js.Any.fromFunction0(clickOnSecondaryButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getPrimaryActionButtonLabel = js.Any.fromFunction0(getPrimaryActionButtonLabel), getSecondaryActionButtonLabel = js.Any.fromFunction0(getSecondaryActionButtonLabel), getSelectedDaysText = js.Any.fromFunction0(getSelectedDaysText), isPrimaryButtonDisabled = js.Any.fromFunction0(isPrimaryButtonDisabled))
      __obj.asInstanceOf[CalendarPanelFooterUniDriver]
    }
    
    extension [Self <: CalendarPanelFooterUniDriver](x: Self) {
      
      inline def setClickOnPrimaryButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnPrimaryButton", js.Any.fromFunction0(value))
      
      inline def setClickOnSecondaryButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnSecondaryButton", js.Any.fromFunction0(value))
      
      inline def setGetPrimaryActionButtonLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getPrimaryActionButtonLabel", js.Any.fromFunction0(value))
      
      inline def setGetSecondaryActionButtonLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getSecondaryActionButtonLabel", js.Any.fromFunction0(value))
      
      inline def setGetSelectedDaysText(value: () => js.Promise[String]): Self = StObject.set(x, "getSelectedDaysText", js.Any.fromFunction0(value))
      
      inline def setIsPrimaryButtonDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPrimaryButtonDisabled", js.Any.fromFunction0(value))
    }
  }
}
