package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// type/directives.js
@js.native
trait GraphQLDirective extends js.Object {
  
  var args: js.Array[GraphQLArgument] = js.native
  
  var description: String = js.native
  
  var name: String = js.native
  
  var onField: Boolean = js.native
  
  var onFragment: Boolean = js.native
  
  var onOperation: Boolean = js.native
}
object GraphQLDirective {
  
  @scala.inline
  def apply(
    args: js.Array[GraphQLArgument],
    description: String,
    name: String,
    onField: Boolean,
    onFragment: Boolean,
    onOperation: Boolean
  ): GraphQLDirective = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onField = onField.asInstanceOf[js.Any], onFragment = onFragment.asInstanceOf[js.Any], onOperation = onOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirective]
  }
  
  @scala.inline
  implicit class GraphQLDirectiveOps[Self <: GraphQLDirective] (val x: Self) extends AnyVal {
    
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
    def setOnField(value: Boolean): Self = this.set("onField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFragment(value: Boolean): Self = this.set("onFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOperation(value: Boolean): Self = this.set("onOperation", value.asInstanceOf[js.Any])
  }
}
