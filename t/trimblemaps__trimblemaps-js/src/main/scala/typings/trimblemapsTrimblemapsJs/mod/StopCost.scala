package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopCost extends StObject {
  
  var costOfStop: js.UndefOr[Double] = js.undefined
  
  var hoursPerStop: js.UndefOr[Double] = js.undefined
  
  var loaded: js.UndefOr[Boolean] = js.undefined
  
  var onDuty: js.UndefOr[Boolean] = js.undefined
  
  var useOrigin: js.UndefOr[Boolean] = js.undefined
}
object StopCost {
  
  inline def apply(): StopCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopCost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopCost] (val x: Self) extends AnyVal {
    
    inline def setCostOfStop(value: Double): Self = StObject.set(x, "costOfStop", value.asInstanceOf[js.Any])
    
    inline def setCostOfStopUndefined: Self = StObject.set(x, "costOfStop", js.undefined)
    
    inline def setHoursPerStop(value: Double): Self = StObject.set(x, "hoursPerStop", value.asInstanceOf[js.Any])
    
    inline def setHoursPerStopUndefined: Self = StObject.set(x, "hoursPerStop", js.undefined)
    
    inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setOnDuty(value: Boolean): Self = StObject.set(x, "onDuty", value.asInstanceOf[js.Any])
    
    inline def setOnDutyUndefined: Self = StObject.set(x, "onDuty", js.undefined)
    
    inline def setUseOrigin(value: Boolean): Self = StObject.set(x, "useOrigin", value.asInstanceOf[js.Any])
    
    inline def setUseOriginUndefined: Self = StObject.set(x, "useOrigin", js.undefined)
  }
}
