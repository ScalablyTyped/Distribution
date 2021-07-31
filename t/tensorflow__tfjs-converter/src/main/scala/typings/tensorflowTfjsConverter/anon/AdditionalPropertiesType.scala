package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalPropertiesType extends StObject {
  
  var additionalProperties: Boolean
  
  var `type`: String
}
object AdditionalPropertiesType {
  
  @scala.inline
  def apply(additionalProperties: Boolean, `type`: String): AdditionalPropertiesType = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalPropertiesType]
  }
  
  @scala.inline
  implicit class AdditionalPropertiesTypeMutableBuilder[Self <: AdditionalPropertiesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
