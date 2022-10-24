package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStackedBarChartStackedBarChartDotuniDotdriverMod {
  
  trait StackedBarChartUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDataLength(): js.Promise[Double]
    
    def getTooltipContentAt(index: Double): js.Promise[Any]
  }
  object StackedBarChartUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getDataLength: () => js.Promise[Double],
      getTooltipContentAt: Double => js.Promise[Any]
    ): StackedBarChartUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getDataLength = js.Any.fromFunction0(getDataLength), getTooltipContentAt = js.Any.fromFunction1(getTooltipContentAt))
      __obj.asInstanceOf[StackedBarChartUniDriver]
    }
    
    extension [Self <: StackedBarChartUniDriver](x: Self) {
      
      inline def setGetDataLength(value: () => js.Promise[Double]): Self = StObject.set(x, "getDataLength", js.Any.fromFunction0(value))
      
      inline def setGetTooltipContentAt(value: Double => js.Promise[Any]): Self = StObject.set(x, "getTooltipContentAt", js.Any.fromFunction1(value))
    }
  }
}
