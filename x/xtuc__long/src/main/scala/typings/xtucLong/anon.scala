package typings.xtucLong

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait High extends StObject {
    
    var high: Double
    
    var low: Double
    
    var unsigned: Boolean
  }
  object High {
    
    inline def apply(high: Double, low: Double, unsigned: Boolean): High = {
      val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], unsigned = unsigned.asInstanceOf[js.Any])
      __obj.asInstanceOf[High]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: High] (val x: Self) extends AnyVal {
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
    }
  }
}
