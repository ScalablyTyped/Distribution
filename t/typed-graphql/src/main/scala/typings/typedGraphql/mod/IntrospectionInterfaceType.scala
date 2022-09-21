package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.INTERFACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectionInterfaceType
  extends StObject
     with IntrospectionType {
  
  var description: js.UndefOr[String] = js.undefined
  
  var fields: js.Array[IntrospectionField]
  
  var kind: INTERFACE
  
  var name: String
  
  var possibleTypes: js.Array[IntrospectionNamedTypeRef]
}
object IntrospectionInterfaceType {
  
  inline def apply(
    fields: js.Array[IntrospectionField],
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef]
  ): IntrospectionInterfaceType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = "INTERFACE", name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInterfaceType]
  }
  
  extension [Self <: IntrospectionInterfaceType](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFields(value: js.Array[IntrospectionField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: IntrospectionField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setKind(value: INTERFACE): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPossibleTypes(value: js.Array[IntrospectionNamedTypeRef]): Self = StObject.set(x, "possibleTypes", value.asInstanceOf[js.Any])
    
    inline def setPossibleTypesVarargs(value: IntrospectionNamedTypeRef*): Self = StObject.set(x, "possibleTypes", js.Array(value*))
  }
}
