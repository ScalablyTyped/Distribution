package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shiftx extends StObject {
  
  var shift_x: js.UndefOr[Double] = js.undefined
  
  var shift_y: js.UndefOr[Double] = js.undefined
}
object Shiftx {
  
  inline def apply(): Shiftx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shiftx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shiftx] (val x: Self) extends AnyVal {
    
    inline def setShift_x(value: Double): Self = StObject.set(x, "shift_x", value.asInstanceOf[js.Any])
    
    inline def setShift_xUndefined: Self = StObject.set(x, "shift_x", js.undefined)
    
    inline def setShift_y(value: Double): Self = StObject.set(x, "shift_y", value.asInstanceOf[js.Any])
    
    inline def setShift_yUndefined: Self = StObject.set(x, "shift_y", js.undefined)
  }
}
