package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marketingPageLayoutContentUniDriverMod {
  
  trait MarketingPageLayoutContentUniDriver
    extends StObject
       with BaseUniDriver {
    
    def childExists(): js.Promise[Boolean]
    
    def getContentText(): js.Promise[String]
    
    def getOverlineText(): js.Promise[String]
    
    def getSubtitleText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
    
    def hasActions(): js.Promise[Boolean]
    
    def hasContent(): js.Promise[Boolean]
    
    def hasOverline(): js.Promise[Boolean]
    
    def hasSubtitle(): js.Promise[Boolean]
    
    def hasTitle(): js.Promise[Boolean]
  }
  object MarketingPageLayoutContentUniDriver {
    
    @scala.inline
    def apply(
      childExists: () => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getContentText: () => js.Promise[String],
      getOverlineText: () => js.Promise[String],
      getSubtitleText: () => js.Promise[String],
      getTitleText: () => js.Promise[String],
      hasActions: () => js.Promise[Boolean],
      hasContent: () => js.Promise[Boolean],
      hasOverline: () => js.Promise[Boolean],
      hasSubtitle: () => js.Promise[Boolean],
      hasTitle: () => js.Promise[Boolean]
    ): MarketingPageLayoutContentUniDriver = {
      val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction0(childExists), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContentText = js.Any.fromFunction0(getContentText), getOverlineText = js.Any.fromFunction0(getOverlineText), getSubtitleText = js.Any.fromFunction0(getSubtitleText), getTitleText = js.Any.fromFunction0(getTitleText), hasActions = js.Any.fromFunction0(hasActions), hasContent = js.Any.fromFunction0(hasContent), hasOverline = js.Any.fromFunction0(hasOverline), hasSubtitle = js.Any.fromFunction0(hasSubtitle), hasTitle = js.Any.fromFunction0(hasTitle))
      __obj.asInstanceOf[MarketingPageLayoutContentUniDriver]
    }
    
    @scala.inline
    implicit class MarketingPageLayoutContentUniDriverMutableBuilder[Self <: MarketingPageLayoutContentUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "childExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentText(value: () => js.Promise[String]): Self = StObject.set(x, "getContentText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOverlineText(value: () => js.Promise[String]): Self = StObject.set(x, "getOverlineText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSubtitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getSubtitleText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getTitleText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasActions(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasActions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasContent(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasOverline(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasOverline", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasSubtitle(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasSubtitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasTitle(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasTitle", js.Any.fromFunction0(value))
    }
  }
}
