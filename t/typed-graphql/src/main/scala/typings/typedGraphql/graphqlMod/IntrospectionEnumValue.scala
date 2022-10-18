package typings.typedGraphql.graphqlMod

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
  
  inline def apply(isDeprecated: Boolean, name: String): IntrospectionEnumValue = {
    val __obj = js.Dynamic.literal(isDeprecated = isDeprecated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionEnumValue]
  }
  
  extension [Self <: IntrospectionEnumValue](x: Self) {
    
    inline def setDeprecationReason(value: String): Self = StObject.set(x, "deprecationReason", value.asInstanceOf[js.Any])
    
    inline def setDeprecationReasonUndefined: Self = StObject.set(x, "deprecationReason", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsDeprecated(value: Boolean): Self = StObject.set(x, "isDeprecated", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
