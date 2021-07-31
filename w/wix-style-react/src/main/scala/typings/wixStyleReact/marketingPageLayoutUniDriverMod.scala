package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marketingPageLayoutUniDriverMod {
  
  trait MarketingPageLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def hasContent(): js.Promise[Boolean]
    
    def hasFooter(): js.Promise[Boolean]
    
    def hasImage(): js.Promise[Boolean]
  }
  object MarketingPageLayoutUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      hasContent: () => js.Promise[Boolean],
      hasFooter: () => js.Promise[Boolean],
      hasImage: () => js.Promise[Boolean]
    ): MarketingPageLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), hasContent = js.Any.fromFunction0(hasContent), hasFooter = js.Any.fromFunction0(hasFooter), hasImage = js.Any.fromFunction0(hasImage))
      __obj.asInstanceOf[MarketingPageLayoutUniDriver]
    }
    
    @scala.inline
    implicit class MarketingPageLayoutUniDriverMutableBuilder[Self <: MarketingPageLayoutUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasContent(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasFooter(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasFooter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasImage(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasImage", js.Any.fromFunction0(value))
    }
  }
}
