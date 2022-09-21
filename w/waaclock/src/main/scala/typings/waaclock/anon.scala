package typings.waaclock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Early extends StObject {
    
    var early: js.UndefOr[Double] = js.undefined
    
    var late: js.UndefOr[Double] = js.undefined
  }
  object Early {
    
    inline def apply(): Early = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Early]
    }
    
    extension [Self <: Early](x: Self) {
      
      inline def setEarly(value: Double): Self = StObject.set(x, "early", value.asInstanceOf[js.Any])
      
      inline def setEarlyUndefined: Self = StObject.set(x, "early", js.undefined)
      
      inline def setLate(value: Double): Self = StObject.set(x, "late", value.asInstanceOf[js.Any])
      
      inline def setLateUndefined: Self = StObject.set(x, "late", js.undefined)
    }
  }
  
  trait ToleranceEarly extends StObject {
    
    var toleranceEarly: js.UndefOr[Double] = js.undefined
    
    var toleranceLate: js.UndefOr[Double] = js.undefined
  }
  object ToleranceEarly {
    
    inline def apply(): ToleranceEarly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToleranceEarly]
    }
    
    extension [Self <: ToleranceEarly](x: Self) {
      
      inline def setToleranceEarly(value: Double): Self = StObject.set(x, "toleranceEarly", value.asInstanceOf[js.Any])
      
      inline def setToleranceEarlyUndefined: Self = StObject.set(x, "toleranceEarly", js.undefined)
      
      inline def setToleranceLate(value: Double): Self = StObject.set(x, "toleranceLate", value.asInstanceOf[js.Any])
      
      inline def setToleranceLateUndefined: Self = StObject.set(x, "toleranceLate", js.undefined)
    }
  }
}
