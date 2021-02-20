package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// type/directives.js
@js.native
trait GraphQLDirective extends StObject {
  
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
  implicit class GraphQLDirectiveMutableBuilder[Self <: GraphQLDirective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[GraphQLArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: GraphQLArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnField(value: Boolean): Self = StObject.set(x, "onField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFragment(value: Boolean): Self = StObject.set(x, "onFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOperation(value: Boolean): Self = StObject.set(x, "onOperation", value.asInstanceOf[js.Any])
  }
}
