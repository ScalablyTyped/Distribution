package typings.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avg extends StObject {
  
  var avg: Double
  
  var count: Double
  
  var max: Double
  
  var min: Double
  
  var sum: Double
}
object Avg {
  
  inline def apply(avg: Double, count: Double, max: Double, min: Double, sum: Double): Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avg]
  }
  
  extension [Self <: Avg](x: Self) {
    
    inline def setAvg(value: Double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
  }
}
