package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLEnumTypeConfig extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var values: GraphQLEnumValueConfigMap
}
object GraphQLEnumTypeConfig {
  
  inline def apply(name: String, values: GraphQLEnumValueConfigMap): GraphQLEnumTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumTypeConfig]
  }
  
  extension [Self <: GraphQLEnumTypeConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: GraphQLEnumValueConfigMap): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
