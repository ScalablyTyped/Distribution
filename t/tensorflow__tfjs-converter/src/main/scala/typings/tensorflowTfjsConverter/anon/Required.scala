package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var additionalProperties: Boolean
  
  var properties: Name
  
  var required: js.Array[String]
  
  var `type`: String
}
object Required {
  
  @scala.inline
  def apply(additionalProperties: Boolean, properties: Name, required: js.Array[String], `type`: String): Required = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
  
  @scala.inline
  implicit class RequiredMutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: Name): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
