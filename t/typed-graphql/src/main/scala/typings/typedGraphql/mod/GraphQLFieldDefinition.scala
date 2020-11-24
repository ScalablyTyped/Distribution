package typings.typedGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLFieldDefinition extends js.Object {
  
  var args: js.Array[GraphQLArgument] = js.native
  
  var deprecationReason: js.UndefOr[String] = js.native
  
  var description: String = js.native
  
  var name: String = js.native
  
  var resolve: js.UndefOr[GraphQLFieldResolveFn] = js.native
  
  var `type`: GraphQLOutputType = js.native
}
object GraphQLFieldDefinition {
  
  @scala.inline
  def apply(args: js.Array[GraphQLArgument], description: String, name: String, `type`: GraphQLOutputType): GraphQLFieldDefinition = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFieldDefinition]
  }
  
  @scala.inline
  implicit class GraphQLFieldDefinitionOps[Self <: GraphQLFieldDefinition] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: GraphQLArgument*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[GraphQLArgument]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: GraphQLOutputType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationReason(value: String): Self = this.set("deprecationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecationReason: Self = this.set("deprecationReason", js.undefined)
    
    @scala.inline
    def setResolve(
      value: (/* source */ js.Any, /* args */ StringDictionary[js.Any], /* context */ js.Any, /* info */ GraphQLResolveInfo) => js.Any
    ): Self = this.set("resolve", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
  }
}
