package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLFieldConfig extends StObject {
  
  var args: js.UndefOr[GraphQLFieldConfigArgumentMap] = js.undefined
  
  var deprecationReason: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var resolve: js.UndefOr[GraphQLFieldResolveFn] = js.undefined
  
  var `type`: GraphQLOutputType
}
object GraphQLFieldConfig {
  
  inline def apply(`type`: GraphQLOutputType): GraphQLFieldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFieldConfig]
  }
  
  extension [Self <: GraphQLFieldConfig](x: Self) {
    
    inline def setArgs(value: GraphQLFieldConfigArgumentMap): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setDeprecationReason(value: String): Self = StObject.set(x, "deprecationReason", value.asInstanceOf[js.Any])
    
    inline def setDeprecationReasonUndefined: Self = StObject.set(x, "deprecationReason", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setResolve(
      value: (/* source */ Any, /* args */ StringDictionary[Any], /* context */ Any, /* info */ GraphQLResolveInfo) => Any
    ): Self = StObject.set(x, "resolve", js.Any.fromFunction4(value))
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setType(value: GraphQLOutputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
