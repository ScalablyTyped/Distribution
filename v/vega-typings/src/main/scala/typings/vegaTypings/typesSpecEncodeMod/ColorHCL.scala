package typings.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorHCL extends StObject {
  
  var c: NumericValueRef
  
  var h: NumericValueRef
  
  var l: NumericValueRef
}
object ColorHCL {
  
  inline def apply(c: NumericValueRef, h: NumericValueRef, l: NumericValueRef): ColorHCL = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHCL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorHCL] (val x: Self) extends AnyVal {
    
    inline def setC(value: NumericValueRef): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setH(value: NumericValueRef): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setL(value: NumericValueRef): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
