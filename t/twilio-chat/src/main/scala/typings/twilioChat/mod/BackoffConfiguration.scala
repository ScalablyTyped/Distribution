package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackoffConfiguration extends StObject {
  
  var max: Double
  
  var maxAttemptsCount: Double
  
  var min: Double
}
object BackoffConfiguration {
  
  inline def apply(max: Double, maxAttemptsCount: Double, min: Double): BackoffConfiguration = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], maxAttemptsCount = maxAttemptsCount.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffConfiguration]
  }
  
  extension [Self <: BackoffConfiguration](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxAttemptsCount(value: Double): Self = StObject.set(x, "maxAttemptsCount", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
