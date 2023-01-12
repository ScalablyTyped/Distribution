package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// type/directives.js
trait GraphQLDirective extends StObject {
  
  var args: js.Array[GraphQLArgument]
  
  var description: String
  
  var name: String
  
  var onField: Boolean
  
  var onFragment: Boolean
  
  var onOperation: Boolean
}
object GraphQLDirective {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: GraphQLDirective] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[GraphQLArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: GraphQLArgument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnField(value: Boolean): Self = StObject.set(x, "onField", value.asInstanceOf[js.Any])
    
    inline def setOnFragment(value: Boolean): Self = StObject.set(x, "onFragment", value.asInstanceOf[js.Any])
    
    inline def setOnOperation(value: Boolean): Self = StObject.set(x, "onOperation", value.asInstanceOf[js.Any])
  }
}
