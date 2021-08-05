package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectionField extends StObject {
  
  var args: js.Array[IntrospectionInputValue]
  
  var deprecationReason: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var isDeprecated: Boolean
  
  var name: String
  
  var `type`: IntrospectionTypeRef
}
object IntrospectionField {
  
  inline def apply(
    args: js.Array[IntrospectionInputValue],
    isDeprecated: Boolean,
    name: String,
    `type`: IntrospectionTypeRef
  ): IntrospectionField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], isDeprecated = isDeprecated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionField]
  }
  
  extension [Self <: IntrospectionField](x: Self) {
    
    inline def setArgs(value: js.Array[IntrospectionInputValue]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: IntrospectionInputValue*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setDeprecationReason(value: String): Self = StObject.set(x, "deprecationReason", value.asInstanceOf[js.Any])
    
    inline def setDeprecationReasonUndefined: Self = StObject.set(x, "deprecationReason", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsDeprecated(value: Boolean): Self = StObject.set(x, "isDeprecated", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: IntrospectionTypeRef): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
