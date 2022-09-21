package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalProperties extends StObject {
  
  var additionalProperties: Boolean
  
  var properties: Attrs
  
  var required: js.Array[String]
  
  var `type`: String
}
object AdditionalProperties {
  
  inline def apply(additionalProperties: Boolean, properties: Attrs, required: js.Array[String], `type`: String): AdditionalProperties = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalProperties]
  }
  
  extension [Self <: AdditionalProperties](x: Self) {
    
    inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Attrs): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
