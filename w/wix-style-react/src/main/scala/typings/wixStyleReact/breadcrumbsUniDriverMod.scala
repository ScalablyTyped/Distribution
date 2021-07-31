package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsUniDriverMod {
  
  trait BreadcrumbsUniDriver
    extends StObject
       with BaseUniDriver {
    
    def breadcrumbContentAt(position: Double): js.Promise[String | Null]
    
    def breadcrumbsLength(): js.Promise[Double]
    
    def clickBreadcrumbAt(position: Double): js.Promise[js.Any]
    
    def getActiveItemId(): js.Promise[Double | Null]
    
    def getLabelClassList(position: Double): js.Promise[String]
    
    def isActiveLinkAt(index: Double): js.Promise[Boolean]
    
    def isLarge(): js.Promise[Boolean]
    
    def isMedium(): js.Promise[Boolean]
    
    def isOnDarkBackground(): js.Promise[Boolean]
    
    def isOnGrayBackground(): js.Promise[Boolean]
    
    def isOnWhiteBackground(): js.Promise[Boolean]
  }
  object BreadcrumbsUniDriver {
    
    @scala.inline
    def apply(
      breadcrumbContentAt: Double => js.Promise[String | Null],
      breadcrumbsLength: () => js.Promise[Double],
      click: () => js.Promise[Unit],
      clickBreadcrumbAt: Double => js.Promise[js.Any],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getActiveItemId: () => js.Promise[Double | Null],
      getLabelClassList: Double => js.Promise[String],
      isActiveLinkAt: Double => js.Promise[Boolean],
      isLarge: () => js.Promise[Boolean],
      isMedium: () => js.Promise[Boolean],
      isOnDarkBackground: () => js.Promise[Boolean],
      isOnGrayBackground: () => js.Promise[Boolean],
      isOnWhiteBackground: () => js.Promise[Boolean]
    ): BreadcrumbsUniDriver = {
      val __obj = js.Dynamic.literal(breadcrumbContentAt = js.Any.fromFunction1(breadcrumbContentAt), breadcrumbsLength = js.Any.fromFunction0(breadcrumbsLength), click = js.Any.fromFunction0(click), clickBreadcrumbAt = js.Any.fromFunction1(clickBreadcrumbAt), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getActiveItemId = js.Any.fromFunction0(getActiveItemId), getLabelClassList = js.Any.fromFunction1(getLabelClassList), isActiveLinkAt = js.Any.fromFunction1(isActiveLinkAt), isLarge = js.Any.fromFunction0(isLarge), isMedium = js.Any.fromFunction0(isMedium), isOnDarkBackground = js.Any.fromFunction0(isOnDarkBackground), isOnGrayBackground = js.Any.fromFunction0(isOnGrayBackground), isOnWhiteBackground = js.Any.fromFunction0(isOnWhiteBackground))
      __obj.asInstanceOf[BreadcrumbsUniDriver]
    }
    
    @scala.inline
    implicit class BreadcrumbsUniDriverMutableBuilder[Self <: BreadcrumbsUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumbContentAt(value: Double => js.Promise[String | Null]): Self = StObject.set(x, "breadcrumbContentAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBreadcrumbsLength(value: () => js.Promise[Double]): Self = StObject.set(x, "breadcrumbsLength", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickBreadcrumbAt(value: Double => js.Promise[js.Any]): Self = StObject.set(x, "clickBreadcrumbAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetActiveItemId(value: () => js.Promise[Double | Null]): Self = StObject.set(x, "getActiveItemId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabelClassList(value: Double => js.Promise[String]): Self = StObject.set(x, "getLabelClassList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsActiveLinkAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isActiveLinkAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsLarge(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLarge", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMedium(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isMedium", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsOnDarkBackground(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isOnDarkBackground", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsOnGrayBackground(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isOnGrayBackground", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsOnWhiteBackground(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isOnWhiteBackground", js.Any.fromFunction0(value))
    }
  }
}
