package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shiftx extends StObject {
  
  var shift_x: js.UndefOr[Double] = js.native
  
  var shift_y: js.UndefOr[Double] = js.native
}
object Shiftx {
  
  @scala.inline
  def apply(): Shiftx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shiftx]
  }
  
  @scala.inline
  implicit class ShiftxMutableBuilder[Self <: Shiftx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShift_x(value: Double): Self = StObject.set(x, "shift_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift_xUndefined: Self = StObject.set(x, "shift_x", js.undefined)
    
    @scala.inline
    def setShift_y(value: Double): Self = StObject.set(x, "shift_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift_yUndefined: Self = StObject.set(x, "shift_y", js.undefined)
  }
}
