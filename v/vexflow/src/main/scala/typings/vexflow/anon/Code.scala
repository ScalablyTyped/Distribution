package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: Double
  
  var shift_y: Double
  
  var text: String
  
  var width: Double
}
object Code {
  
  @scala.inline
  def apply(code: Double, shift_y: Double, text: String, width: Double): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], shift_y = shift_y.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift_y(value: Double): Self = StObject.set(x, "shift_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
