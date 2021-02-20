package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLEnumValueConfig extends StObject {
  
  var deprecationReason: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object GraphQLEnumValueConfig {
  
  @scala.inline
  def apply(): GraphQLEnumValueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLEnumValueConfig]
  }
  
  @scala.inline
  implicit class GraphQLEnumValueConfigMutableBuilder[Self <: GraphQLEnumValueConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecationReason(value: String): Self = StObject.set(x, "deprecationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationReasonUndefined: Self = StObject.set(x, "deprecationReason", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
