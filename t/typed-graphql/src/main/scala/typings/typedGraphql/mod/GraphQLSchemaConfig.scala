package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLSchemaConfig extends StObject {
  
  var directives: js.UndefOr[js.Array[GraphQLDirective]] = js.undefined
  
  var mutation: js.UndefOr[GraphQLObjectType] = js.undefined
  
  var query: GraphQLObjectType
  
  var subscription: js.UndefOr[GraphQLObjectType] = js.undefined
  
  var types: js.UndefOr[js.Array[GraphQLNamedType]] = js.undefined
}
object GraphQLSchemaConfig {
  
  inline def apply(query: GraphQLObjectType): GraphQLSchemaConfig = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaConfig]
  }
  
  extension [Self <: GraphQLSchemaConfig](x: Self) {
    
    inline def setDirectives(value: js.Array[GraphQLDirective]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setDirectivesVarargs(value: GraphQLDirective*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    inline def setMutation(value: GraphQLObjectType): Self = StObject.set(x, "mutation", value.asInstanceOf[js.Any])
    
    inline def setMutationUndefined: Self = StObject.set(x, "mutation", js.undefined)
    
    inline def setQuery(value: GraphQLObjectType): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: GraphQLObjectType): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTypes(value: js.Array[GraphQLNamedType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: GraphQLNamedType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
