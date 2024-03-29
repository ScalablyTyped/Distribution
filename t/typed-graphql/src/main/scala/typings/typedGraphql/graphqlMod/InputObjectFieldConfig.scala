package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputObjectFieldConfig extends StObject {
  
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var `type`: GraphQLInputType
}
object InputObjectFieldConfig {
  
  inline def apply(`type`: GraphQLInputType): InputObjectFieldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputObjectFieldConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputObjectFieldConfig] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setType(value: GraphQLInputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
