package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLArgumentConfig extends StObject {
  
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var `type`: GraphQLInputType
}
object GraphQLArgumentConfig {
  
  @scala.inline
  def apply(`type`: GraphQLInputType): GraphQLArgumentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLArgumentConfig]
  }
  
  @scala.inline
  implicit class GraphQLArgumentConfigMutableBuilder[Self <: GraphQLArgumentConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setType(value: GraphQLInputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
