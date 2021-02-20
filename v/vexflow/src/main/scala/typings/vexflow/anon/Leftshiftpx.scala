package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Leftshiftpx extends StObject {
  
  var height: js.UndefOr[Double] = js.native
  
  var left_shift_px: Double = js.native
  
  var right_shift_px: Double = js.native
  
  var y_shift: Double = js.native
}
object Leftshiftpx {
  
  @scala.inline
  def apply(left_shift_px: Double, right_shift_px: Double, y_shift: Double): Leftshiftpx = {
    val __obj = js.Dynamic.literal(left_shift_px = left_shift_px.asInstanceOf[js.Any], right_shift_px = right_shift_px.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leftshiftpx]
  }
  
  @scala.inline
  implicit class LeftshiftpxMutableBuilder[Self <: Leftshiftpx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft_shift_px(value: Double): Self = StObject.set(x, "left_shift_px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight_shift_px(value: Double): Self = StObject.set(x, "right_shift_px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY_shift(value: Double): Self = StObject.set(x, "y_shift", value.asInstanceOf[js.Any])
  }
}
