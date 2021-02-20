package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firstxpx extends StObject {
  
  var direction: Double = js.native
  
  var first_x_px: Double = js.native
  
  var first_ys: js.Array[Double] = js.native
  
  var last_x_px: Double = js.native
  
  var last_ys: js.Array[Double] = js.native
}
object Firstxpx {
  
  @scala.inline
  def apply(
    direction: Double,
    first_x_px: Double,
    first_ys: js.Array[Double],
    last_x_px: Double,
    last_ys: js.Array[Double]
  ): Firstxpx = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], first_x_px = first_x_px.asInstanceOf[js.Any], first_ys = first_ys.asInstanceOf[js.Any], last_x_px = last_x_px.asInstanceOf[js.Any], last_ys = last_ys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstxpx]
  }
  
  @scala.inline
  implicit class FirstxpxMutableBuilder[Self <: Firstxpx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_x_px(value: Double): Self = StObject.set(x, "first_x_px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_ys(value: js.Array[Double]): Self = StObject.set(x, "first_ys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_ysVarargs(value: Double*): Self = StObject.set(x, "first_ys", js.Array(value :_*))
    
    @scala.inline
    def setLast_x_px(value: Double): Self = StObject.set(x, "last_x_px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_ys(value: js.Array[Double]): Self = StObject.set(x, "last_ys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_ysVarargs(value: Double*): Self = StObject.set(x, "last_ys", js.Array(value :_*))
  }
}
