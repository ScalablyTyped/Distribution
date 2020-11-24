package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLInterfaceTypeConfig extends js.Object {
  
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
  implicit class GraphQLInterfaceTypeConfigOps[Self <: GraphQLInterfaceTypeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldsFunction0(value: () => GraphQLFieldConfigMap): Self = this.set("fields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFields(value: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setResolveType(
      value: (/* value */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo) => GraphQLObjectType
    ): Self = this.set("resolveType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteResolveType: Self = this.set("resolveType", js.undefined)
  }
}
