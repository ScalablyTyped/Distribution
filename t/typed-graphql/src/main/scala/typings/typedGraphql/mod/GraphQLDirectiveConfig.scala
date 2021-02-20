package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLDirectiveConfig extends StObject {
  
  var args: js.UndefOr[js.Array[GraphQLArgument]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var onField: js.UndefOr[Boolean] = js.native
  
  var onFragment: js.UndefOr[Boolean] = js.native
  
  var onOperation: js.UndefOr[Boolean] = js.native
}
object GraphQLDirectiveConfig {
  
  @scala.inline
  def apply(name: String): GraphQLDirectiveConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirectiveConfig]
  }
  
  @scala.inline
  implicit class GraphQLDirectiveConfigMutableBuilder[Self <: GraphQLDirectiveConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[GraphQLArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: GraphQLArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnField(value: Boolean): Self = StObject.set(x, "onField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFieldUndefined: Self = StObject.set(x, "onField", js.undefined)
    
    @scala.inline
    def setOnFragment(value: Boolean): Self = StObject.set(x, "onFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFragmentUndefined: Self = StObject.set(x, "onFragment", js.undefined)
    
    @scala.inline
    def setOnOperation(value: Boolean): Self = StObject.set(x, "onOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOperationUndefined: Self = StObject.set(x, "onOperation", js.undefined)
  }
}
