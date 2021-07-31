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
  
  @scala.inline
  def apply(ha: Double, outline: js.Array[Double], x_max: Double, x_min: Double): Outline = {
    val __obj = js.Dynamic.literal(ha = ha.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outline]
  }
  
  @scala.inline
  implicit class OutlineMutableBuilder[Self <: Outline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHa(value: Double): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: js.Array[Double]): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineVarargs(value: Double*): Self = StObject.set(x, "outline", js.Array(value :_*))
    
    @scala.inline
    def setX_max(value: Double): Self = StObject.set(x, "x_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_min(value: Double): Self = StObject.set(x, "x_min", value.asInstanceOf[js.Any])
  }
}
