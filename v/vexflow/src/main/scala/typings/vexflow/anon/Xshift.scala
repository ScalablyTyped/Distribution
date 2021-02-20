package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xshift extends StObject {
  
  var code: String = js.native
  
  var x_shift: Double = js.native
  
  var y_shift: Double = js.native
}
object Xshift {
  
  @scala.inline
  def apply(code: String, x_shift: Double, y_shift: Double): Xshift = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xshift]
  }
  
  @scala.inline
  implicit class XshiftMutableBuilder[Self <: Xshift] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_shift(value: Double): Self = StObject.set(x, "x_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY_shift(value: Double): Self = StObject.set(x, "y_shift", value.asInstanceOf[js.Any])
  }
}
