package typings.webdriverio.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSValue extends StObject {
  
  var string: String
  
  var `type`: String
  
  var unit: String
  
  var value: Any
}
object CSSValue {
  
  inline def apply(string: String, `type`: String, unit: String, value: Any): CSSValue = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSValue] (val x: Self) extends AnyVal {
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
