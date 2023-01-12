package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxTime extends StObject {
  
  // Proto: "timebounds_start"
  var maxTime: Double
  
  var minTime: Double
}
object MaxTime {
  
  inline def apply(maxTime: Double, minTime: Double): MaxTime = {
    val __obj = js.Dynamic.literal(maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxTime] (val x: Self) extends AnyVal {
    
    inline def setMaxTime(value: Double): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
    
    inline def setMinTime(value: Double): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
  }
}
