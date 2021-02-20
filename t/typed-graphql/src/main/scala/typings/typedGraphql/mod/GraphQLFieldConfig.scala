package typings.typedGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLFieldConfig extends StObject {
  
  var args: js.UndefOr[GraphQLFieldConfigArgumentMap] = js.native
  
  var deprecationReason: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var resolve: js.UndefOr[GraphQLFieldResolveFn] = js.native
  
  var `type`: GraphQLOutputType = js.native
}
object GraphQLFieldConfig {
  
  @scala.inline
  def apply(`type`: GraphQLOutputType): GraphQLFieldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFieldConfig]
  }
  
  @scala.inline
  implicit class GraphQLFieldConfigMutableBuilder[Self <: GraphQLFieldConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: GraphQLFieldConfigArgumentMap): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setDeprecationReason(value: String): Self = StObject.set(x, "deprecationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationReasonUndefined: Self = StObject.set(x, "deprecationReason", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setResolve(
      value: (/* source */ js.Any, /* args */ StringDictionary[js.Any], /* context */ js.Any, /* info */ GraphQLResolveInfo) => js.Any
    ): Self = StObject.set(x, "resolve", js.Any.fromFunction4(value))
    
    @scala.inline
    def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    @scala.inline
    def setType(value: GraphQLOutputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
