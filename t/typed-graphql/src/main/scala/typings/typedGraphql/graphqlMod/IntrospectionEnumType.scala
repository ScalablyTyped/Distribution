package typings.typedGraphql.graphqlMod

import typings.typedGraphql.typedGraphqlStrings.ENUM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectionEnumType
  extends StObject
     with IntrospectionType {
  
  var description: js.UndefOr[String] = js.undefined
  
  var enumValues: js.Array[IntrospectionEnumValue]
  
  var kind: ENUM
  
  var name: String
}
object IntrospectionEnumType {
  
  inline def apply(enumValues: js.Array[IntrospectionEnumValue], name: String): IntrospectionEnumType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = "ENUM", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionEnumType]
  }
  
  extension [Self <: IntrospectionEnumType](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnumValues(value: js.Array[IntrospectionEnumValue]): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
    
    inline def setEnumValuesVarargs(value: IntrospectionEnumValue*): Self = StObject.set(x, "enumValues", js.Array(value*))
    
    inline def setKind(value: ENUM): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
