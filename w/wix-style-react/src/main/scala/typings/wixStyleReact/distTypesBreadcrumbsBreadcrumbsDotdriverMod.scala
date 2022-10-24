package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBreadcrumbsBreadcrumbsDotdriverMod {
  
  trait BreadcrumbsDriver
    extends StObject
       with BaseDriver {
    
    def breadcrumbContentAt(position: Double): String | Null
    
    def breadcrumbsLength(): Double
    
    def clickBreadcrumbAt(position: Double): Any
    
    def getActiveItemId(): Double | Null
    
    def isActiveLinkAt(index: Double): Boolean
    
    def isLarge(): Boolean
    
    def isMedium(): Boolean
    
    def isOnDarkBackground(): Boolean
    
    def isOnGrayBackground(): Boolean
    
    def isOnWhiteBackground(): Boolean
  }
  object BreadcrumbsDriver {
    
    inline def apply(
      breadcrumbContentAt: Double => String | Null,
      breadcrumbsLength: () => Double,
      clickBreadcrumbAt: Double => Any,
      exists: () => Boolean,
      getActiveItemId: () => Double | Null,
      isActiveLinkAt: Double => Boolean,
      isLarge: () => Boolean,
      isMedium: () => Boolean,
      isOnDarkBackground: () => Boolean,
      isOnGrayBackground: () => Boolean,
      isOnWhiteBackground: () => Boolean
    ): BreadcrumbsDriver = {
      val __obj = js.Dynamic.literal(breadcrumbContentAt = js.Any.fromFunction1(breadcrumbContentAt), breadcrumbsLength = js.Any.fromFunction0(breadcrumbsLength), clickBreadcrumbAt = js.Any.fromFunction1(clickBreadcrumbAt), exists = js.Any.fromFunction0(exists), getActiveItemId = js.Any.fromFunction0(getActiveItemId), isActiveLinkAt = js.Any.fromFunction1(isActiveLinkAt), isLarge = js.Any.fromFunction0(isLarge), isMedium = js.Any.fromFunction0(isMedium), isOnDarkBackground = js.Any.fromFunction0(isOnDarkBackground), isOnGrayBackground = js.Any.fromFunction0(isOnGrayBackground), isOnWhiteBackground = js.Any.fromFunction0(isOnWhiteBackground))
      __obj.asInstanceOf[BreadcrumbsDriver]
    }
    
    extension [Self <: BreadcrumbsDriver](x: Self) {
      
      inline def setBreadcrumbContentAt(value: Double => String | Null): Self = StObject.set(x, "breadcrumbContentAt", js.Any.fromFunction1(value))
      
      inline def setBreadcrumbsLength(value: () => Double): Self = StObject.set(x, "breadcrumbsLength", js.Any.fromFunction0(value))
      
      inline def setClickBreadcrumbAt(value: Double => Any): Self = StObject.set(x, "clickBreadcrumbAt", js.Any.fromFunction1(value))
      
      inline def setGetActiveItemId(value: () => Double | Null): Self = StObject.set(x, "getActiveItemId", js.Any.fromFunction0(value))
      
      inline def setIsActiveLinkAt(value: Double => Boolean): Self = StObject.set(x, "isActiveLinkAt", js.Any.fromFunction1(value))
      
      inline def setIsLarge(value: () => Boolean): Self = StObject.set(x, "isLarge", js.Any.fromFunction0(value))
      
      inline def setIsMedium(value: () => Boolean): Self = StObject.set(x, "isMedium", js.Any.fromFunction0(value))
      
      inline def setIsOnDarkBackground(value: () => Boolean): Self = StObject.set(x, "isOnDarkBackground", js.Any.fromFunction0(value))
      
      inline def setIsOnGrayBackground(value: () => Boolean): Self = StObject.set(x, "isOnGrayBackground", js.Any.fromFunction0(value))
      
      inline def setIsOnWhiteBackground(value: () => Boolean): Self = StObject.set(x, "isOnWhiteBackground", js.Any.fromFunction0(value))
    }
  }
}
