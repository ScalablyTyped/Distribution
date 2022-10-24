package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadarChartRadarChartDotuniDotdriverMod {
  
  trait RadarChartUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getScaleLinesCount(): js.Promise[Double]
  }
  object RadarChartUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getScaleLinesCount: () => js.Promise[Double]
    ): RadarChartUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getScaleLinesCount = js.Any.fromFunction0(getScaleLinesCount))
      __obj.asInstanceOf[RadarChartUniDriver]
    }
    
    extension [Self <: RadarChartUniDriver](x: Self) {
      
      inline def setGetScaleLinesCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getScaleLinesCount", js.Any.fromFunction0(value))
    }
  }
}
