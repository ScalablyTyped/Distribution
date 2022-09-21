package typings.three

import typings.three.threeMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorConverterMod {
  
  object ColorConverter {
    
    @JSImport("three/examples/jsm/math/ColorConverter", "ColorConverter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getHSV(color: Color, target: HSL): HSL = (^.asInstanceOf[js.Dynamic].applyDynamic("getHSV")(color.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[HSL]
    
    inline def setHSV(color: Color, h: Double, s: Double, v: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("setHSV")(color.asInstanceOf[js.Any], h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Color]
  }
  
  trait CMYK extends StObject {
    
    var c: Double
    
    var k: Double
    
    var m: Double
    
    var y: Double
  }
  object CMYK {
    
    inline def apply(c: Double, k: Double, m: Double, y: Double): CMYK = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CMYK]
    }
    
    extension [Self <: CMYK](x: Self) {
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait HSL extends StObject {
    
    var h: Double
    
    var l: Double
    
    var s: Double
  }
  object HSL {
    
    inline def apply(h: Double, l: Double, s: Double): HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSL]
    }
    
    extension [Self <: HSL](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
}
