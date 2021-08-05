package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Firstxpx extends StObject {
  
  var direction: Double
  
  var first_x_px: Double
  
  var first_ys: js.Array[Double]
  
  var last_x_px: Double
  
  var last_ys: js.Array[Double]
}
object Firstxpx {
  
  inline def apply(
    direction: Double,
    first_x_px: Double,
    first_ys: js.Array[Double],
    last_x_px: Double,
    last_ys: js.Array[Double]
  ): Firstxpx = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], first_x_px = first_x_px.asInstanceOf[js.Any], first_ys = first_ys.asInstanceOf[js.Any], last_x_px = last_x_px.asInstanceOf[js.Any], last_ys = last_ys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstxpx]
  }
  
  extension [Self <: Firstxpx](x: Self) {
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setFirst_x_px(value: Double): Self = StObject.set(x, "first_x_px", value.asInstanceOf[js.Any])
    
    inline def setFirst_ys(value: js.Array[Double]): Self = StObject.set(x, "first_ys", value.asInstanceOf[js.Any])
    
    inline def setFirst_ysVarargs(value: Double*): Self = StObject.set(x, "first_ys", js.Array(value :_*))
    
    inline def setLast_x_px(value: Double): Self = StObject.set(x, "last_x_px", value.asInstanceOf[js.Any])
    
    inline def setLast_ys(value: js.Array[Double]): Self = StObject.set(x, "last_ys", value.asInstanceOf[js.Any])
    
    inline def setLast_ysVarargs(value: Double*): Self = StObject.set(x, "last_ys", js.Array(value :_*))
  }
}
