package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLEnumValueConfig extends StObject {
  
  var deprecationReason: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object GraphQLEnumValueConfig {
  
  inline def apply(): GraphQLEnumValueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLEnumValueConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphQLEnumValueConfig] (val x: Self) extends AnyVal {
    
    inline def setDeprecationReason(value: String): Self = StObject.set(x, "deprecationReason", value.asInstanceOf[js.Any])
    
    inline def setDeprecationReasonUndefined: Self = StObject.set(x, "deprecationReason", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
