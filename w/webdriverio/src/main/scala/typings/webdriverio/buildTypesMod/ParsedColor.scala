package typings.webdriverio.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<webdriverio.webdriverio/build/types.CSSValue> */
trait ParsedColor extends StObject {
  
  var hex: js.UndefOr[String] = js.undefined
  
  var rgb: js.UndefOr[String] = js.undefined
  
  var rgba: js.UndefOr[String] = js.undefined
  
  var string: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object ParsedColor {
  
  inline def apply(): ParsedColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedColor] (val x: Self) extends AnyVal {
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
    
    inline def setRgb(value: String): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
    
    inline def setRgbUndefined: Self = StObject.set(x, "rgb", js.undefined)
    
    inline def setRgba(value: String): Self = StObject.set(x, "rgba", value.asInstanceOf[js.Any])
    
    inline def setRgbaUndefined: Self = StObject.set(x, "rgba", js.undefined)
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
