package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLObjectTypeConfig extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap = js.native
  
  var interfaces: js.UndefOr[GraphQLInterfacesThunk | js.Array[GraphQLInterfaceType]] = js.native
  
  var isTypeOf: js.UndefOr[GraphQLIsTypeOfFn] = js.native
  
  var name: String = js.native
}
object GraphQLObjectTypeConfig {
  
  @scala.inline
  def apply(fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap, name: String): GraphQLObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLObjectTypeConfig]
  }
  
  @scala.inline
  implicit class GraphQLObjectTypeConfigOps[Self <: GraphQLObjectTypeConfig] (val x: Self) extends AnyVal {
    
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
    def setInterfacesVarargs(value: GraphQLInterfaceType*): Self = this.set("interfaces", js.Array(value :_*))
    
    @scala.inline
    def setInterfacesFunction0(value: () => js.Array[GraphQLInterfaceType]): Self = this.set("interfaces", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInterfaces(value: GraphQLInterfacesThunk | js.Array[GraphQLInterfaceType]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaces: Self = this.set("interfaces", js.undefined)
    
    @scala.inline
    def setIsTypeOf(value: (/* source */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo) => Boolean): Self = this.set("isTypeOf", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteIsTypeOf: Self = this.set("isTypeOf", js.undefined)
  }
}
