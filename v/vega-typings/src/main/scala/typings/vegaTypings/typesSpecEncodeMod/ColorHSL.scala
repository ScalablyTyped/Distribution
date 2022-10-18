package typings.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorHSL extends StObject {
  
  var h: NumericValueRef
  
  var l: NumericValueRef
  
  var s: NumericValueRef
}
object ColorHSL {
  
  inline def apply(h: NumericValueRef, l: NumericValueRef, s: NumericValueRef): ColorHSL = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHSL]
  }
  
  extension [Self <: ColorHSL](x: Self) {
    
    inline def setH(value: NumericValueRef): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setL(value: NumericValueRef): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setS(value: NumericValueRef): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
