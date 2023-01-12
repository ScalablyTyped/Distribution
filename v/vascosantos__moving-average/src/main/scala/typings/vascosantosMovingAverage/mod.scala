package typings.vascosantosMovingAverage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(timespan: Double): IMovingAverage = ^.asInstanceOf[js.Dynamic].apply(timespan.asInstanceOf[js.Any]).asInstanceOf[IMovingAverage]
  
  @JSImport("@vascosantos/moving-average", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IMovingAverage extends StObject {
    
    def deviation(): Double
    
    def forecast(): Double
    
    def movingAverage(): Double
    
    def push(time: Double, value: Double): Unit
    
    def variance(): Double
  }
  object IMovingAverage {
    
    inline def apply(
      deviation: () => Double,
      forecast: () => Double,
      movingAverage: () => Double,
      push: (Double, Double) => Unit,
      variance: () => Double
    ): IMovingAverage = {
      val __obj = js.Dynamic.literal(deviation = js.Any.fromFunction0(deviation), forecast = js.Any.fromFunction0(forecast), movingAverage = js.Any.fromFunction0(movingAverage), push = js.Any.fromFunction2(push), variance = js.Any.fromFunction0(variance))
      __obj.asInstanceOf[IMovingAverage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMovingAverage] (val x: Self) extends AnyVal {
      
      inline def setDeviation(value: () => Double): Self = StObject.set(x, "deviation", js.Any.fromFunction0(value))
      
      inline def setForecast(value: () => Double): Self = StObject.set(x, "forecast", js.Any.fromFunction0(value))
      
      inline def setMovingAverage(value: () => Double): Self = StObject.set(x, "movingAverage", js.Any.fromFunction0(value))
      
      inline def setPush(value: (Double, Double) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
      
      inline def setVariance(value: () => Double): Self = StObject.set(x, "variance", js.Any.fromFunction0(value))
    }
  }
}
