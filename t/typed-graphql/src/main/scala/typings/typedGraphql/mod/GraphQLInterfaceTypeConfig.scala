package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLInterfaceTypeConfig extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap
  
  var name: String
  
  var resolveType: js.UndefOr[GraphQLTypeResolveFn] = js.undefined
}
object GraphQLInterfaceTypeConfig {
  
  inline def apply(fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap, name: String): GraphQLInterfaceTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInterfaceTypeConfig]
  }
  
  extension [Self <: GraphQLInterfaceTypeConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFields(value: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsFunction0(value: () => GraphQLFieldConfigMap): Self = StObject.set(x, "fields", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResolveType(value: (/* value */ Any, /* context */ Any, /* info */ GraphQLResolveInfo) => GraphQLObjectType): Self = StObject.set(x, "resolveType", js.Any.fromFunction3(value))
    
    inline def setResolveTypeUndefined: Self = StObject.set(x, "resolveType", js.undefined)
  }
}
