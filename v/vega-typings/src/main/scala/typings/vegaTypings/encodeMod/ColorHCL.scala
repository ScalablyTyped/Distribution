package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorHCL extends StObject {
  
  var c: NumericValueRef = js.native
  
  var h: NumericValueRef = js.native
  
  var l: NumericValueRef = js.native
}
object ColorHCL {
  
  @scala.inline
  def apply(c: NumericValueRef, h: NumericValueRef, l: NumericValueRef): ColorHCL = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHCL]
  }
  
  @scala.inline
  implicit class ColorHCLMutableBuilder[Self <: ColorHCL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: NumericValueRef): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: NumericValueRef): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: NumericValueRef): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
