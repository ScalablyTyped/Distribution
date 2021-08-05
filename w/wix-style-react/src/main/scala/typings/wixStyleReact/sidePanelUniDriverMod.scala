package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidePanelUniDriverMod {
  
  trait SidePanelUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** Click close the button */
    def clickClose(): js.Promise[Unit]
    
    /** Get title text */
    def getTitleText(): js.Promise[String]
    
    /** Get tooltip text */
    def getTooltipContent(): js.Promise[String]
    
    /** Check if close button exists */
    def isCloseButtonExists(): js.Promise[Boolean]
    
    /** Check if divider exists */
    def isFooterDividerExists(): js.Promise[Boolean]
    
    /** Check if divider exists */
    def isHeaderDividerExists(): js.Promise[Boolean]
  }
  object SidePanelUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickClose: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getTitleText: () => js.Promise[String],
      getTooltipContent: () => js.Promise[String],
      isCloseButtonExists: () => js.Promise[Boolean],
      isFooterDividerExists: () => js.Promise[Boolean],
      isHeaderDividerExists: () => js.Promise[Boolean]
    ): SidePanelUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickClose = js.Any.fromFunction0(clickClose), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getTitleText = js.Any.fromFunction0(getTitleText), getTooltipContent = js.Any.fromFunction0(getTooltipContent), isCloseButtonExists = js.Any.fromFunction0(isCloseButtonExists), isFooterDividerExists = js.Any.fromFunction0(isFooterDividerExists), isHeaderDividerExists = js.Any.fromFunction0(isHeaderDividerExists))
      __obj.asInstanceOf[SidePanelUniDriver]
    }
    
    extension [Self <: SidePanelUniDriver](x: Self) {
      
      inline def setClickClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickClose", js.Any.fromFunction0(value))
      
      inline def setGetTitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getTitleText", js.Any.fromFunction0(value))
      
      inline def setGetTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getTooltipContent", js.Any.fromFunction0(value))
      
      inline def setIsCloseButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCloseButtonExists", js.Any.fromFunction0(value))
      
      inline def setIsFooterDividerExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFooterDividerExists", js.Any.fromFunction0(value))
      
      inline def setIsHeaderDividerExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isHeaderDividerExists", js.Any.fromFunction0(value))
    }
  }
}
