package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectionEnumValue extends StObject {
  
  var deprecationReason: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var isDeprecated: Boolean
  
  var name: String
}
object IntrospectionEnumValue {
  
  @scala.inline
  def apply(isDeprecated: Boolean, name: String): IntrospectionEnumValue = {
    val __obj = js.Dynamic.literal(isDeprecated = isDeprecated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionEnumValue]
  }
  
  @scala.inline
  implicit class IntrospectionEnumValueMutableBuilder[Self <: IntrospectionEnumValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecationReason(value: String): Self = StObject.set(x, "deprecationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationReasonUndefined: Self = StObject.set(x, "deprecationReason", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIsDeprecated(value: Boolean): Self = StObject.set(x, "isDeprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
