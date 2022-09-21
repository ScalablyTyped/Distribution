package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ha extends StObject {
  
  var ha: Double
  
  var o: js.Array[String]
  
  var x_max: Double
  
  var x_min: Double
}
object Ha {
  
  inline def apply(ha: Double, o: js.Array[String], x_max: Double, x_min: Double): Ha = {
    val __obj = js.Dynamic.literal(ha = ha.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ha]
  }
  
  extension [Self <: Ha](x: Self) {
    
    inline def setHa(value: Double): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
    
    inline def setO(value: js.Array[String]): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    
    inline def setOVarargs(value: String*): Self = StObject.set(x, "o", js.Array(value*))
    
    inline def setX_max(value: Double): Self = StObject.set(x, "x_max", value.asInstanceOf[js.Any])
    
    inline def setX_min(value: Double): Self = StObject.set(x, "x_min", value.asInstanceOf[js.Any])
  }
}
