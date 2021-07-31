package typings.typedGraphql.mod

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
  
  @scala.inline
  def apply(fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap, name: String): GraphQLObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLObjectTypeConfig]
  }
  
  @scala.inline
  implicit class GraphQLObjectTypeConfigMutableBuilder[Self <: GraphQLObjectTypeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFields(value: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsFunction0(value: () => GraphQLFieldConfigMap): Self = StObject.set(x, "fields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInterfaces(value: GraphQLInterfacesThunk | js.Array[GraphQLInterfaceType]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfacesFunction0(value: () => js.Array[GraphQLInterfaceType]): Self = StObject.set(x, "interfaces", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInterfacesUndefined: Self = StObject.set(x, "interfaces", js.undefined)
    
    @scala.inline
    def setInterfacesVarargs(value: GraphQLInterfaceType*): Self = StObject.set(x, "interfaces", js.Array(value :_*))
    
    @scala.inline
    def setIsTypeOf(value: (/* source */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo) => Boolean): Self = StObject.set(x, "isTypeOf", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsTypeOfUndefined: Self = StObject.set(x, "isTypeOf", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
