package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outline extends StObject {
  
  var ha: Double
  
  var outline: js.Array[Double]
  
  var x_max: Double
  
  var x_min: Double
}
object Outline {
  
  inline def apply(ha: Double, outline: js.Array[Double], x_max: Double, x_min: Double): Outline = {
    val __obj = js.Dynamic.literal(ha = ha.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outline]
  }
  
  extension [Self <: Outline](x: Self) {
    
    inline def setHa(value: Double): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: js.Array[Double]): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineVarargs(value: Double*): Self = StObject.set(x, "outline", js.Array(value :_*))
    
    inline def setX_max(value: Double): Self = StObject.set(x, "x_max", value.asInstanceOf[js.Any])
    
    inline def setX_min(value: Double): Self = StObject.set(x, "x_min", value.asInstanceOf[js.Any])
  }
}
