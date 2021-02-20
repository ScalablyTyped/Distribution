package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Properties extends StObject {
  
  var additionalProperties: Boolean = js.native
  
  var properties: DefaultValue = js.native
  
  var required: js.Array[String] = js.native
  
  var `type`: String = js.native
}
object Properties {
  
  @scala.inline
  def apply(
    additionalProperties: Boolean,
    properties: DefaultValue,
    required: js.Array[String],
    `type`: String
  ): Properties = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  
  @scala.inline
  implicit class PropertiesMutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: DefaultValue): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
