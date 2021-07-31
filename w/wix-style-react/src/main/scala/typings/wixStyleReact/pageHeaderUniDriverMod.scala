package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageHeaderUniDriverMod {
  
  trait PageHeaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def breadcrumbsText(): js.Promise[String]
    
    def clickBackButton(): js.Promise[Unit]
    
    def hasClass(name: String): js.Promise[Boolean]
    
    def isActionBarExists(): js.Promise[Boolean]
    
    def isBackButtonExists(): js.Promise[Boolean]
    
    def isBreadcrumbsExists(): js.Promise[Boolean]
    
    def isSubtitleExists(): js.Promise[Boolean]
    
    def isTitleExists(): js.Promise[Boolean]
    
    def subtitleText(): js.Promise[String]
    
    def titleText(): js.Promise[String]
  }
  object PageHeaderUniDriver {
    
    @scala.inline
    def apply(
      breadcrumbsText: () => js.Promise[String],
      click: () => js.Promise[Unit],
      clickBackButton: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      hasClass: String => js.Promise[Boolean],
      isActionBarExists: () => js.Promise[Boolean],
      isBackButtonExists: () => js.Promise[Boolean],
      isBreadcrumbsExists: () => js.Promise[Boolean],
      isSubtitleExists: () => js.Promise[Boolean],
      isTitleExists: () => js.Promise[Boolean],
      subtitleText: () => js.Promise[String],
      titleText: () => js.Promise[String]
    ): PageHeaderUniDriver = {
      val __obj = js.Dynamic.literal(breadcrumbsText = js.Any.fromFunction0(breadcrumbsText), click = js.Any.fromFunction0(click), clickBackButton = js.Any.fromFunction0(clickBackButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), hasClass = js.Any.fromFunction1(hasClass), isActionBarExists = js.Any.fromFunction0(isActionBarExists), isBackButtonExists = js.Any.fromFunction0(isBackButtonExists), isBreadcrumbsExists = js.Any.fromFunction0(isBreadcrumbsExists), isSubtitleExists = js.Any.fromFunction0(isSubtitleExists), isTitleExists = js.Any.fromFunction0(isTitleExists), subtitleText = js.Any.fromFunction0(subtitleText), titleText = js.Any.fromFunction0(titleText))
      __obj.asInstanceOf[PageHeaderUniDriver]
    }
    
    @scala.inline
    implicit class PageHeaderUniDriverMutableBuilder[Self <: PageHeaderUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumbsText(value: () => js.Promise[String]): Self = StObject.set(x, "breadcrumbsText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickBackButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickBackButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasClass(value: String => js.Promise[Boolean]): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsActionBarExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isActionBarExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsBackButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isBackButtonExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsBreadcrumbsExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isBreadcrumbsExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSubtitleExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSubtitleExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTitleExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTitleExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubtitleText(value: () => js.Promise[String]): Self = StObject.set(x, "subtitleText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleText(value: () => js.Promise[String]): Self = StObject.set(x, "titleText", js.Any.fromFunction0(value))
    }
  }
}
