package typings.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorLAB extends StObject {
  
  var a: NumericValueRef
  
  var b: NumericValueRef
  
  var l: NumericValueRef
}
object ColorLAB {
  
  inline def apply(a: NumericValueRef, b: NumericValueRef, l: NumericValueRef): ColorLAB = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorLAB]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorLAB] (val x: Self) extends AnyVal {
    
    inline def setA(value: NumericValueRef): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: NumericValueRef): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setL(value: NumericValueRef): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
