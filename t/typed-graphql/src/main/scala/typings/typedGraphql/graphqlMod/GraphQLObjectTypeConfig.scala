package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLObjectTypeConfig extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap
  
  var interfaces: js.UndefOr[GraphQLInterfacesThunk | js.Array[GraphQLInterfaceType]] = js.undefined
  
  var isTypeOf: js.UndefOr[GraphQLIsTypeOfFn] = js.undefined
  
  var name: String
}
object GraphQLObjectTypeConfig {
  
  inline def apply(fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap, name: String): GraphQLObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLObjectTypeConfig]
  }
  
  extension [Self <: GraphQLObjectTypeConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFields(value: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsFunction0(value: () => GraphQLFieldConfigMap): Self = StObject.set(x, "fields", js.Any.fromFunction0(value))
    
    inline def setInterfaces(value: GraphQLInterfacesThunk | js.Array[GraphQLInterfaceType]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
    
    inline def setInterfacesFunction0(value: () => js.Array[GraphQLInterfaceType]): Self = StObject.set(x, "interfaces", js.Any.fromFunction0(value))
    
    inline def setInterfacesUndefined: Self = StObject.set(x, "interfaces", js.undefined)
    
    inline def setInterfacesVarargs(value: GraphQLInterfaceType*): Self = StObject.set(x, "interfaces", js.Array(value*))
    
    inline def setIsTypeOf(value: (/* source */ Any, /* context */ Any, /* info */ GraphQLResolveInfo) => Boolean): Self = StObject.set(x, "isTypeOf", js.Any.fromFunction3(value))
    
    inline def setIsTypeOfUndefined: Self = StObject.set(x, "isTypeOf", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
