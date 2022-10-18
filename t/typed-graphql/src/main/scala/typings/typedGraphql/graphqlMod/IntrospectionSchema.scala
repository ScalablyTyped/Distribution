package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectionSchema extends StObject {
  
  var directives: js.Array[IntrospectionDirective]
  
  var mutationType: js.UndefOr[IntrospectionNamedTypeRef] = js.undefined
  
  var queryType: IntrospectionNamedTypeRef
  
  var subscriptionType: js.UndefOr[IntrospectionNamedTypeRef] = js.undefined
  
  var types: js.Array[IntrospectionType]
}
object IntrospectionSchema {
  
  inline def apply(
    directives: js.Array[IntrospectionDirective],
    queryType: IntrospectionNamedTypeRef,
    types: js.Array[IntrospectionType]
  ): IntrospectionSchema = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionSchema]
  }
  
  extension [Self <: IntrospectionSchema](x: Self) {
    
    inline def setDirectives(value: js.Array[IntrospectionDirective]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesVarargs(value: IntrospectionDirective*): Self = StObject.set(x, "directives", js.Array(value*))
    
    inline def setMutationType(value: IntrospectionNamedTypeRef): Self = StObject.set(x, "mutationType", value.asInstanceOf[js.Any])
    
    inline def setMutationTypeUndefined: Self = StObject.set(x, "mutationType", js.undefined)
    
    inline def setQueryType(value: IntrospectionNamedTypeRef): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionType(value: IntrospectionNamedTypeRef): Self = StObject.set(x, "subscriptionType", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionTypeUndefined: Self = StObject.set(x, "subscriptionType", js.undefined)
    
    inline def setTypes(value: js.Array[IntrospectionType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: IntrospectionType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
