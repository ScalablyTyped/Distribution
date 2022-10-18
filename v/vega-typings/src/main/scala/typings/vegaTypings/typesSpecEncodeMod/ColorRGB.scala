package typings.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorRGB extends StObject {
  
  var b: NumericValueRef
  
  var g: NumericValueRef
  
  var r: NumericValueRef
}
object ColorRGB {
  
  inline def apply(b: NumericValueRef, g: NumericValueRef, r: NumericValueRef): ColorRGB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorRGB]
  }
  
  extension [Self <: ColorRGB](x: Self) {
    
    inline def setB(value: NumericValueRef): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: NumericValueRef): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setR(value: NumericValueRef): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
