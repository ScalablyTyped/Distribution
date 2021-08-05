package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackedBarChartUniDriverMod {
  
  trait StackedBarChartUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getTooltipContentAt(index: Double): js.Promise[js.Any]
  }
  object StackedBarChartUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getTooltipContentAt: Double => js.Promise[js.Any]
    ): StackedBarChartUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getTooltipContentAt = js.Any.fromFunction1(getTooltipContentAt))
      __obj.asInstanceOf[StackedBarChartUniDriver]
    }
    
    extension [Self <: StackedBarChartUniDriver](x: Self) {
      
      inline def setGetTooltipContentAt(value: Double => js.Promise[js.Any]): Self = StObject.set(x, "getTooltipContentAt", js.Any.fromFunction1(value))
    }
  }
}
