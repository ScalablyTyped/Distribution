package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLInterfaceTypeConfig extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap = js.native
  
  var name: String = js.native
  
  var resolveType: js.UndefOr[GraphQLTypeResolveFn] = js.native
}
object GraphQLInterfaceTypeConfig {
  
  @scala.inline
  def apply(fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap, name: String): GraphQLInterfaceTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInterfaceTypeConfig]
  }
  
  @scala.inline
  implicit class GraphQLInterfaceTypeConfigMutableBuilder[Self <: GraphQLInterfaceTypeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFields(value: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsFunction0(value: () => GraphQLFieldConfigMap): Self = StObject.set(x, "fields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveType(
      value: (/* value */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo) => GraphQLObjectType
    ): Self = StObject.set(x, "resolveType", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResolveTypeUndefined: Self = StObject.set(x, "resolveType", js.undefined)
  }
}
