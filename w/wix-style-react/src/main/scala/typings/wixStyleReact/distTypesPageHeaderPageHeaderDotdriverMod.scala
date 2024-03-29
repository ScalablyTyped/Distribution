package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageHeaderPageHeaderDotdriverMod {
  
  trait PageHeaderDriver
    extends StObject
       with BaseDriver {
    
    def breadcrumbsText(): String
    
    def clickBackButton(): Unit
    
    def hasClass(className: String): Boolean
    
    def isActionBarExists(): Boolean
    
    def isBackButtonExists(): Boolean
    
    def isBreadcrumbsExists(): Boolean
    
    def isSubtitleExists(): Boolean
    
    def isTitleExists(): Boolean
    
    def subtitleText(): String
    
    def titleText(): String
  }
  object PageHeaderDriver {
    
    inline def apply(
      breadcrumbsText: () => String,
      clickBackButton: () => Unit,
      exists: () => Boolean,
      hasClass: String => Boolean,
      isActionBarExists: () => Boolean,
      isBackButtonExists: () => Boolean,
      isBreadcrumbsExists: () => Boolean,
      isSubtitleExists: () => Boolean,
      isTitleExists: () => Boolean,
      subtitleText: () => String,
      titleText: () => String
    ): PageHeaderDriver = {
      val __obj = js.Dynamic.literal(breadcrumbsText = js.Any.fromFunction0(breadcrumbsText), clickBackButton = js.Any.fromFunction0(clickBackButton), exists = js.Any.fromFunction0(exists), hasClass = js.Any.fromFunction1(hasClass), isActionBarExists = js.Any.fromFunction0(isActionBarExists), isBackButtonExists = js.Any.fromFunction0(isBackButtonExists), isBreadcrumbsExists = js.Any.fromFunction0(isBreadcrumbsExists), isSubtitleExists = js.Any.fromFunction0(isSubtitleExists), isTitleExists = js.Any.fromFunction0(isTitleExists), subtitleText = js.Any.fromFunction0(subtitleText), titleText = js.Any.fromFunction0(titleText))
      __obj.asInstanceOf[PageHeaderDriver]
    }
    
    extension [Self <: PageHeaderDriver](x: Self) {
      
      inline def setBreadcrumbsText(value: () => String): Self = StObject.set(x, "breadcrumbsText", js.Any.fromFunction0(value))
      
      inline def setClickBackButton(value: () => Unit): Self = StObject.set(x, "clickBackButton", js.Any.fromFunction0(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsActionBarExists(value: () => Boolean): Self = StObject.set(x, "isActionBarExists", js.Any.fromFunction0(value))
      
      inline def setIsBackButtonExists(value: () => Boolean): Self = StObject.set(x, "isBackButtonExists", js.Any.fromFunction0(value))
      
      inline def setIsBreadcrumbsExists(value: () => Boolean): Self = StObject.set(x, "isBreadcrumbsExists", js.Any.fromFunction0(value))
      
      inline def setIsSubtitleExists(value: () => Boolean): Self = StObject.set(x, "isSubtitleExists", js.Any.fromFunction0(value))
      
      inline def setIsTitleExists(value: () => Boolean): Self = StObject.set(x, "isTitleExists", js.Any.fromFunction0(value))
      
      inline def setSubtitleText(value: () => String): Self = StObject.set(x, "subtitleText", js.Any.fromFunction0(value))
      
      inline def setTitleText(value: () => String): Self = StObject.set(x, "titleText", js.Any.fromFunction0(value))
    }
  }
}
