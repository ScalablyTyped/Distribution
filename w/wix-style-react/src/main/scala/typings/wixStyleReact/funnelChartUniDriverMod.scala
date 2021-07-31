package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object funnelChartUniDriverMod {
  
  trait FunnelChartUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDifferenceFromDataAt(index: Double): js.Promise[String]
    
    def getDifferenceTooltipFromDataAt(index: Double): js.Promise[String]
    
    def getItemsCount(): js.Promise[Double]
    
    def getLabelAt(index: Double): js.Promise[String]
    
    def getValueAt(index: Double): js.Promise[String]
    
    def isDisplayingBadges(): js.Promise[Boolean]
  }
  object FunnelChartUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getDifferenceFromDataAt: Double => js.Promise[String],
      getDifferenceTooltipFromDataAt: Double => js.Promise[String],
      getItemsCount: () => js.Promise[Double],
      getLabelAt: Double => js.Promise[String],
      getValueAt: Double => js.Promise[String],
      isDisplayingBadges: () => js.Promise[Boolean]
    ): FunnelChartUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getDifferenceFromDataAt = js.Any.fromFunction1(getDifferenceFromDataAt), getDifferenceTooltipFromDataAt = js.Any.fromFunction1(getDifferenceTooltipFromDataAt), getItemsCount = js.Any.fromFunction0(getItemsCount), getLabelAt = js.Any.fromFunction1(getLabelAt), getValueAt = js.Any.fromFunction1(getValueAt), isDisplayingBadges = js.Any.fromFunction0(isDisplayingBadges))
      __obj.asInstanceOf[FunnelChartUniDriver]
    }
    
    @scala.inline
    implicit class FunnelChartUniDriverMutableBuilder[Self <: FunnelChartUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDifferenceFromDataAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getDifferenceFromDataAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDifferenceTooltipFromDataAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getDifferenceTooltipFromDataAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetItemsCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getItemsCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getLabelAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getValueAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsDisplayingBadges(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisplayingBadges", js.Any.fromFunction0(value))
    }
  }
}
