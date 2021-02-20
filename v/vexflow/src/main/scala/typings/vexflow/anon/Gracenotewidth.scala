package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gracenotewidth extends StObject {
  
  var code: String = js.native
  
  var gracenote_width: Double = js.native
  
  var shift_down: Double = js.native
  
  var shift_right: Double = js.native
  
  var width: Double = js.native
}
object Gracenotewidth {
  
  @scala.inline
  def apply(code: String, gracenote_width: Double, shift_down: Double, shift_right: Double, width: Double): Gracenotewidth = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gracenote_width = gracenote_width.asInstanceOf[js.Any], shift_down = shift_down.asInstanceOf[js.Any], shift_right = shift_right.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gracenotewidth]
  }
  
  @scala.inline
  implicit class GracenotewidthMutableBuilder[Self <: Gracenotewidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGracenote_width(value: Double): Self = StObject.set(x, "gracenote_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift_down(value: Double): Self = StObject.set(x, "shift_down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift_right(value: Double): Self = StObject.set(x, "shift_right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
