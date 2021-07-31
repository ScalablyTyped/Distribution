package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barChartUniDriverMod {
  
  trait BarChartUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDescription(index: Double): js.Promise[String]
    
    def getDescriptionInfo(index: Double): js.Promise[String]
    
    def getItemsCount(): js.Promise[Double]
    
    def getValue(index: Double): js.Promise[String]
    
    def getValueInShort(index: Double): js.Promise[String]
  }
  object BarChartUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getDescription: Double => js.Promise[String],
      getDescriptionInfo: Double => js.Promise[String],
      getItemsCount: () => js.Promise[Double],
      getValue: Double => js.Promise[String],
      getValueInShort: Double => js.Promise[String]
    ): BarChartUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getDescription = js.Any.fromFunction1(getDescription), getDescriptionInfo = js.Any.fromFunction1(getDescriptionInfo), getItemsCount = js.Any.fromFunction0(getItemsCount), getValue = js.Any.fromFunction1(getValue), getValueInShort = js.Any.fromFunction1(getValueInShort))
      __obj.asInstanceOf[BarChartUniDriver]
    }
    
    @scala.inline
    implicit class BarChartUniDriverMutableBuilder[Self <: BarChartUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDescription(value: Double => js.Promise[String]): Self = StObject.set(x, "getDescription", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDescriptionInfo(value: Double => js.Promise[String]): Self = StObject.set(x, "getDescriptionInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetItemsCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getItemsCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: Double => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueInShort(value: Double => js.Promise[String]): Self = StObject.set(x, "getValueInShort", js.Any.fromFunction1(value))
    }
  }
}
