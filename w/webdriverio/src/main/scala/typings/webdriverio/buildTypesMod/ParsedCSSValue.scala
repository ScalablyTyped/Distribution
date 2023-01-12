package typings.webdriverio.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedCSSValue extends StObject {
  
  var parsed: ParsedColor
  
  var property: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object ParsedCSSValue {
  
  inline def apply(parsed: ParsedColor): ParsedCSSValue = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedCSSValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedCSSValue] (val x: Self) extends AnyVal {
    
    inline def setParsed(value: ParsedColor): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
