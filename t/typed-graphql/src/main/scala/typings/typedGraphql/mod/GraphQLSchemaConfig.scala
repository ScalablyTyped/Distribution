package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLSchemaConfig extends js.Object {
  
  var directives: js.UndefOr[js.Array[GraphQLDirective]] = js.native
  
  var mutation: js.UndefOr[GraphQLObjectType] = js.native
  
  var query: GraphQLObjectType = js.native
  
  var subscription: js.UndefOr[GraphQLObjectType] = js.native
  
  var types: js.UndefOr[js.Array[GraphQLNamedType]] = js.native
}
object GraphQLSchemaConfig {
  
  @scala.inline
  def apply(query: GraphQLObjectType): GraphQLSchemaConfig = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaConfig]
  }
  
  @scala.inline
  implicit class GraphQLSchemaConfigOps[Self <: GraphQLSchemaConfig] (val x: Self) extends AnyVal {
    
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
    def setQuery(value: GraphQLObjectType): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesVarargs(value: GraphQLDirective*): Self = this.set("directives", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[GraphQLDirective]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    
    @scala.inline
    def setMutation(value: GraphQLObjectType): Self = this.set("mutation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutation: Self = this.set("mutation", js.undefined)
    
    @scala.inline
    def setSubscription(value: GraphQLObjectType): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: GraphQLNamedType*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[GraphQLNamedType]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
