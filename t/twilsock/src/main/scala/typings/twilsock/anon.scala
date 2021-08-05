package typings.twilsock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: Double
    
    var status: String
  }
  object Code {
    
    inline def apply(code: Double, status: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Initial extends StObject {
    
    var initial: js.UndefOr[Double] = js.undefined
    
    var max: Double
    
    var maxAttemptsCount: js.UndefOr[Double] = js.undefined
    
    var maxAttemptsTime: js.UndefOr[Double] = js.undefined
    
    var min: Double
    
    var randomness: js.UndefOr[Double] = js.undefined
  }
  object Initial {
    
    inline def apply(max: Double, min: Double): Initial = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Initial]
    }
    
    extension [Self <: Initial](x: Self) {
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsCount(value: Double): Self = StObject.set(x, "maxAttemptsCount", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsCountUndefined: Self = StObject.set(x, "maxAttemptsCount", js.undefined)
      
      inline def setMaxAttemptsTime(value: Double): Self = StObject.set(x, "maxAttemptsTime", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsTimeUndefined: Self = StObject.set(x, "maxAttemptsTime", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setRandomness(value: Double): Self = StObject.set(x, "randomness", value.asInstanceOf[js.Any])
      
      inline def setRandomnessUndefined: Self = StObject.set(x, "randomness", js.undefined)
    }
  }
}
