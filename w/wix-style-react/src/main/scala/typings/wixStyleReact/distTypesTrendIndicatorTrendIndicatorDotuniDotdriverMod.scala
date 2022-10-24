package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTrendIndicatorTrendIndicatorDotuniDotdriverMod {
  
  trait TrendIndicatorUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getTrendValue(): js.Promise[Double]
    
    def hasTrendIndicatorIcon(): js.Promise[Boolean]
    
    def isTrendIndicatorDown(): js.Promise[Boolean]
    
    def isTrendIndicatorUp(): js.Promise[Boolean]
  }
  object TrendIndicatorUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getTrendValue: () => js.Promise[Double],
      hasTrendIndicatorIcon: () => js.Promise[Boolean],
      isTrendIndicatorDown: () => js.Promise[Boolean],
      isTrendIndicatorUp: () => js.Promise[Boolean]
    ): TrendIndicatorUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getTrendValue = js.Any.fromFunction0(getTrendValue), hasTrendIndicatorIcon = js.Any.fromFunction0(hasTrendIndicatorIcon), isTrendIndicatorDown = js.Any.fromFunction0(isTrendIndicatorDown), isTrendIndicatorUp = js.Any.fromFunction0(isTrendIndicatorUp))
      __obj.asInstanceOf[TrendIndicatorUniDriver]
    }
    
    extension [Self <: TrendIndicatorUniDriver](x: Self) {
      
      inline def setGetTrendValue(value: () => js.Promise[Double]): Self = StObject.set(x, "getTrendValue", js.Any.fromFunction0(value))
      
      inline def setHasTrendIndicatorIcon(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasTrendIndicatorIcon", js.Any.fromFunction0(value))
      
      inline def setIsTrendIndicatorDown(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTrendIndicatorDown", js.Any.fromFunction0(value))
      
      inline def setIsTrendIndicatorUp(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTrendIndicatorUp", js.Any.fromFunction0(value))
    }
  }
}
