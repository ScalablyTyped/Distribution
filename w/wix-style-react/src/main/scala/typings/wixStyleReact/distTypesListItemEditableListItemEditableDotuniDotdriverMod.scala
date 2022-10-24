package typings.wixStyleReact

import typings.wixStyleReact.distTypesCommonMod.StatusIndications
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemEditableListItemEditableDotuniDotdriverMod {
  
  trait ListItemEditableUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickApprove(): js.Promise[Unit]
    
    def clickCancel(): js.Promise[Unit]
    
    def enterText(text: String): js.Promise[Unit]
    
    def getApproveButtonTooltipText(): js.Promise[String]
    
    def getCancelButtonTooltipText(): js.Promise[String]
    
    def getPlaceholder(): js.Promise[String]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def isApproveButtonDisabled(): js.Promise[Boolean]
  }
  object ListItemEditableUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickApprove: () => js.Promise[Unit],
      clickCancel: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      enterText: String => js.Promise[Unit],
      exists: () => js.Promise[Boolean],
      getApproveButtonTooltipText: () => js.Promise[String],
      getCancelButtonTooltipText: () => js.Promise[String],
      getPlaceholder: () => js.Promise[String],
      getStatusMessage: () => js.Promise[String | Null],
      hasStatus: StatusIndications => js.Promise[Boolean],
      isApproveButtonDisabled: () => js.Promise[Boolean]
    ): ListItemEditableUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickApprove = js.Any.fromFunction0(clickApprove), clickCancel = js.Any.fromFunction0(clickCancel), element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), exists = js.Any.fromFunction0(exists), getApproveButtonTooltipText = js.Any.fromFunction0(getApproveButtonTooltipText), getCancelButtonTooltipText = js.Any.fromFunction0(getCancelButtonTooltipText), getPlaceholder = js.Any.fromFunction0(getPlaceholder), getStatusMessage = js.Any.fromFunction0(getStatusMessage), hasStatus = js.Any.fromFunction1(hasStatus), isApproveButtonDisabled = js.Any.fromFunction0(isApproveButtonDisabled))
      __obj.asInstanceOf[ListItemEditableUniDriver]
    }
    
    extension [Self <: ListItemEditableUniDriver](x: Self) {
      
      inline def setClickApprove(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickApprove", js.Any.fromFunction0(value))
      
      inline def setClickCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickCancel", js.Any.fromFunction0(value))
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetApproveButtonTooltipText(value: () => js.Promise[String]): Self = StObject.set(x, "getApproveButtonTooltipText", js.Any.fromFunction0(value))
      
      inline def setGetCancelButtonTooltipText(value: () => js.Promise[String]): Self = StObject.set(x, "getCancelButtonTooltipText", js.Any.fromFunction0(value))
      
      inline def setGetPlaceholder(value: () => js.Promise[String]): Self = StObject.set(x, "getPlaceholder", js.Any.fromFunction0(value))
      
      inline def setGetStatusMessage(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setIsApproveButtonDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isApproveButtonDisabled", js.Any.fromFunction0(value))
    }
  }
}
