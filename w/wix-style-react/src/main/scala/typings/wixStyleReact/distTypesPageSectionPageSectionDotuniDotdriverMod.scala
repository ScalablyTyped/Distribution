package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageSectionPageSectionDotuniDotdriverMod {
  
  trait PageSectionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSubtitleText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
    
    def isActionsBarExists(): js.Promise[Boolean]
    
    def isSubtitleExists(): js.Promise[Boolean]
    
    def isTitleExists(): js.Promise[Boolean]
  }
  object PageSectionUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getSubtitleText: () => js.Promise[String],
      getTitleText: () => js.Promise[String],
      isActionsBarExists: () => js.Promise[Boolean],
      isSubtitleExists: () => js.Promise[Boolean],
      isTitleExists: () => js.Promise[Boolean]
    ): PageSectionUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSubtitleText = js.Any.fromFunction0(getSubtitleText), getTitleText = js.Any.fromFunction0(getTitleText), isActionsBarExists = js.Any.fromFunction0(isActionsBarExists), isSubtitleExists = js.Any.fromFunction0(isSubtitleExists), isTitleExists = js.Any.fromFunction0(isTitleExists))
      __obj.asInstanceOf[PageSectionUniDriver]
    }
    
    extension [Self <: PageSectionUniDriver](x: Self) {
      
      inline def setGetSubtitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getSubtitleText", js.Any.fromFunction0(value))
      
      inline def setGetTitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getTitleText", js.Any.fromFunction0(value))
      
      inline def setIsActionsBarExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isActionsBarExists", js.Any.fromFunction0(value))
      
      inline def setIsSubtitleExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSubtitleExists", js.Any.fromFunction0(value))
      
      inline def setIsTitleExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTitleExists", js.Any.fromFunction0(value))
    }
  }
}
