package typings.winrt.Windows.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var a: Double
  
  var b: Double
  
  var g: Double
  
  var r: Double
}
object Color {
  
  inline def apply(a: Double, b: Double, g: Double, r: Double): Color = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
