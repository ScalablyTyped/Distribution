package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarketingLayoutMarketingLayoutDotuniDotdriverMod {
  
  trait MarketingLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDescriptionText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
  }
  object MarketingLayoutUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getDescriptionText: () => js.Promise[String],
      getTitleText: () => js.Promise[String]
    ): MarketingLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getDescriptionText = js.Any.fromFunction0(getDescriptionText), getTitleText = js.Any.fromFunction0(getTitleText))
      __obj.asInstanceOf[MarketingLayoutUniDriver]
    }
    
    extension [Self <: MarketingLayoutUniDriver](x: Self) {
      
      inline def setGetDescriptionText(value: () => js.Promise[String]): Self = StObject.set(x, "getDescriptionText", js.Any.fromFunction0(value))
      
      inline def setGetTitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getTitleText", js.Any.fromFunction0(value))
    }
  }
}
