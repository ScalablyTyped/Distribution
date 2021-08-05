package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLArgument extends StObject {
  
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var `type`: GraphQLInputType
}
object GraphQLArgument {
  
  inline def apply(name: String, `type`: GraphQLInputType): GraphQLArgument = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLArgument]
  }
  
  extension [Self <: GraphQLArgument](x: Self) {
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: GraphQLInputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
