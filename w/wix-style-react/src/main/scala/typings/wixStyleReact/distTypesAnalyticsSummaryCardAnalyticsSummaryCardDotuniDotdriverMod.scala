package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnalyticsSummaryCardAnalyticsSummaryCardDotuniDotdriverMod {
  
  trait AnalyticsSummaryCardUniDriver
    extends StObject
       with BaseUniDriver {
    
    def CTAExists(): js.Promise[Boolean]
    
    def clickCTA(): js.Promise[Unit]
    
    def getTitle(): js.Promise[String]
    
    def getTitleTooltipText(): js.Promise[String]
    
    def getTrendvalue(): js.Promise[Double]
    
    def getValue(): js.Promise[String]
    
    def getValueTooltipText(): js.Promise[String]
    
    def isLoading(): js.Promise[Boolean]
    
    def trendExists(): js.Promise[Boolean]
  }
  object AnalyticsSummaryCardUniDriver {
    
    inline def apply(
      CTAExists: () => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      clickCTA: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getTitle: () => js.Promise[String],
      getTitleTooltipText: () => js.Promise[String],
      getTrendvalue: () => js.Promise[Double],
      getValue: () => js.Promise[String],
      getValueTooltipText: () => js.Promise[String],
      isLoading: () => js.Promise[Boolean],
      trendExists: () => js.Promise[Boolean]
    ): AnalyticsSummaryCardUniDriver = {
      val __obj = js.Dynamic.literal(CTAExists = js.Any.fromFunction0(CTAExists), click = js.Any.fromFunction0(click), clickCTA = js.Any.fromFunction0(clickCTA), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getTitle = js.Any.fromFunction0(getTitle), getTitleTooltipText = js.Any.fromFunction0(getTitleTooltipText), getTrendvalue = js.Any.fromFunction0(getTrendvalue), getValue = js.Any.fromFunction0(getValue), getValueTooltipText = js.Any.fromFunction0(getValueTooltipText), isLoading = js.Any.fromFunction0(isLoading), trendExists = js.Any.fromFunction0(trendExists))
      __obj.asInstanceOf[AnalyticsSummaryCardUniDriver]
    }
    
    extension [Self <: AnalyticsSummaryCardUniDriver](x: Self) {
      
      inline def setCTAExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "CTAExists", js.Any.fromFunction0(value))
      
      inline def setClickCTA(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickCTA", js.Any.fromFunction0(value))
      
      inline def setGetTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      inline def setGetTitleTooltipText(value: () => js.Promise[String]): Self = StObject.set(x, "getTitleTooltipText", js.Any.fromFunction0(value))
      
      inline def setGetTrendvalue(value: () => js.Promise[Double]): Self = StObject.set(x, "getTrendvalue", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setGetValueTooltipText(value: () => js.Promise[String]): Self = StObject.set(x, "getValueTooltipText", js.Any.fromFunction0(value))
      
      inline def setIsLoading(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
      
      inline def setTrendExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "trendExists", js.Any.fromFunction0(value))
    }
  }
}
