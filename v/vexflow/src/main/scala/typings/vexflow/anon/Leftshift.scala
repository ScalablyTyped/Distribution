package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Leftshift extends StObject {
  
  var left_shift: Double = js.native
  
  var right_shift: Double = js.native
  
  var text_line: Double = js.native
}
object Leftshift {
  
  @scala.inline
  def apply(left_shift: Double, right_shift: Double, text_line: Double): Leftshift = {
    val __obj = js.Dynamic.literal(left_shift = left_shift.asInstanceOf[js.Any], right_shift = right_shift.asInstanceOf[js.Any], text_line = text_line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leftshift]
  }
  
  @scala.inline
  implicit class LeftshiftMutableBuilder[Self <: Leftshift] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft_shift(value: Double): Self = StObject.set(x, "left_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight_shift(value: Double): Self = StObject.set(x, "right_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_line(value: Double): Self = StObject.set(x, "text_line", value.asInstanceOf[js.Any])
  }
}
