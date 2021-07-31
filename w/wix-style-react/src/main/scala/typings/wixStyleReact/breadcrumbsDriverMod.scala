package typings.wixStyleReact

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsDriverMod {
  
  trait BreadcrumbsDriver
    extends StObject
       with BaseDriver {
    
    def breadcrumbContentAt(position: Double): String | Null
    
    def breadcrumbsLength(): Double
    
    def clickBreadcrumbAt(position: Double): js.Any
    
    def getActiveItemId(): Double | Null
    
    def getLabelClassList(position: Double): String
    
    def isActiveLinkAt(index: Double): Boolean
    
    def isLarge(): Boolean
    
    def isMedium(): Boolean
    
    def isOnDarkBackground(): Boolean
    
    def isOnGrayBackground(): Boolean
    
    def isOnWhiteBackground(): Boolean
  }
  object BreadcrumbsDriver {
    
    @scala.inline
    def apply(
      breadcrumbContentAt: Double => String | Null,
      breadcrumbsLength: () => Double,
      clickBreadcrumbAt: Double => js.Any,
      exists: () => Boolean,
      getActiveItemId: () => Double | Null,
      getLabelClassList: Double => String,
      isActiveLinkAt: Double => Boolean,
      isLarge: () => Boolean,
      isMedium: () => Boolean,
      isOnDarkBackground: () => Boolean,
      isOnGrayBackground: () => Boolean,
      isOnWhiteBackground: () => Boolean
    ): BreadcrumbsDriver = {
      val __obj = js.Dynamic.literal(breadcrumbContentAt = js.Any.fromFunction1(breadcrumbContentAt), breadcrumbsLength = js.Any.fromFunction0(breadcrumbsLength), clickBreadcrumbAt = js.Any.fromFunction1(clickBreadcrumbAt), exists = js.Any.fromFunction0(exists), getActiveItemId = js.Any.fromFunction0(getActiveItemId), getLabelClassList = js.Any.fromFunction1(getLabelClassList), isActiveLinkAt = js.Any.fromFunction1(isActiveLinkAt), isLarge = js.Any.fromFunction0(isLarge), isMedium = js.Any.fromFunction0(isMedium), isOnDarkBackground = js.Any.fromFunction0(isOnDarkBackground), isOnGrayBackground = js.Any.fromFunction0(isOnGrayBackground), isOnWhiteBackground = js.Any.fromFunction0(isOnWhiteBackground))
      __obj.asInstanceOf[BreadcrumbsDriver]
    }
    
    @scala.inline
    implicit class BreadcrumbsDriverMutableBuilder[Self <: BreadcrumbsDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumbContentAt(value: Double => String | Null): Self = StObject.set(x, "breadcrumbContentAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBreadcrumbsLength(value: () => Double): Self = StObject.set(x, "breadcrumbsLength", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickBreadcrumbAt(value: Double => js.Any): Self = StObject.set(x, "clickBreadcrumbAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetActiveItemId(value: () => Double | Null): Self = StObject.set(x, "getActiveItemId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabelClassList(value: Double => String): Self = StObject.set(x, "getLabelClassList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsActiveLinkAt(value: Double => Boolean): Self = StObject.set(x, "isActiveLinkAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsLarge(value: () => Boolean): Self = StObject.set(x, "isLarge", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMedium(value: () => Boolean): Self = StObject.set(x, "isMedium", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsOnDarkBackground(value: () => Boolean): Self = StObject.set(x, "isOnDarkBackground", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsOnGrayBackground(value: () => Boolean): Self = StObject.set(x, "isOnGrayBackground", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsOnWhiteBackground(value: () => Boolean): Self = StObject.set(x, "isOnWhiteBackground", js.Any.fromFunction0(value))
    }
  }
}
