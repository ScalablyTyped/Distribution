package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLUnionTypeConfig extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  /**
    * Optionally provide a custom type resolver function. If one is not provided,
    * the default implementation will call `isTypeOf` on each implementing
    * Object type.
    */
  var resolveType: js.UndefOr[GraphQLTypeResolveFn] = js.undefined
  
  var types: js.Array[GraphQLObjectType]
}
object GraphQLUnionTypeConfig {
  
  inline def apply(name: String, types: js.Array[GraphQLObjectType]): GraphQLUnionTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLUnionTypeConfig]
  }
  
  extension [Self <: GraphQLUnionTypeConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResolveType(value: (/* value */ Any, /* context */ Any, /* info */ GraphQLResolveInfo) => GraphQLObjectType): Self = StObject.set(x, "resolveType", js.Any.fromFunction3(value))
    
    inline def setResolveTypeUndefined: Self = StObject.set(x, "resolveType", js.undefined)
    
    inline def setTypes(value: js.Array[GraphQLObjectType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: GraphQLObjectType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
