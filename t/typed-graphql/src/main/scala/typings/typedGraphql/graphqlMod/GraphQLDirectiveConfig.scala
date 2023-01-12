package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLDirectiveConfig extends StObject {
  
  var args: js.UndefOr[js.Array[GraphQLArgument]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var onField: js.UndefOr[Boolean] = js.undefined
  
  var onFragment: js.UndefOr[Boolean] = js.undefined
  
  var onOperation: js.UndefOr[Boolean] = js.undefined
}
object GraphQLDirectiveConfig {
  
  inline def apply(name: String): GraphQLDirectiveConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirectiveConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphQLDirectiveConfig] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[GraphQLArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: GraphQLArgument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnField(value: Boolean): Self = StObject.set(x, "onField", value.asInstanceOf[js.Any])
    
    inline def setOnFieldUndefined: Self = StObject.set(x, "onField", js.undefined)
    
    inline def setOnFragment(value: Boolean): Self = StObject.set(x, "onFragment", value.asInstanceOf[js.Any])
    
    inline def setOnFragmentUndefined: Self = StObject.set(x, "onFragment", js.undefined)
    
    inline def setOnOperation(value: Boolean): Self = StObject.set(x, "onOperation", value.asInstanceOf[js.Any])
    
    inline def setOnOperationUndefined: Self = StObject.set(x, "onOperation", js.undefined)
  }
}
