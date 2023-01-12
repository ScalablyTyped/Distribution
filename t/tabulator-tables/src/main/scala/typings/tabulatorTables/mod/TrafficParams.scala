package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficParams
  extends StObject
     with _FormatterParams {
  
  var color: js.UndefOr[Color] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  // Traffic
  var min: js.UndefOr[Double] = js.undefined
}
object TrafficParams {
  
  inline def apply(): TrafficParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrafficParams] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction1(value: /* value */ Any => String): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Any*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
