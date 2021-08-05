package typings.victory.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndAngle extends StObject {
  
  var data: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var endAngle: js.UndefOr[Double] = js.undefined
  
  var padAngle: js.UndefOr[Double] = js.undefined
  
  var startAngle: js.UndefOr[Double] = js.undefined
}
object EndAngle {
  
  inline def apply(): EndAngle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndAngle]
  }
  
  extension [Self <: EndAngle](x: Self) {
    
    inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    inline def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
