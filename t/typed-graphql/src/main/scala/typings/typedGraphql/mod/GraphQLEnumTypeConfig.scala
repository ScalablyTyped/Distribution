package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLEnumTypeConfig extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var values: GraphQLEnumValueConfigMap
}
object GraphQLEnumTypeConfig {
  
  @scala.inline
  def apply(name: String, values: GraphQLEnumValueConfigMap): GraphQLEnumTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumTypeConfig]
  }
  
  @scala.inline
  implicit class GraphQLEnumTypeConfigMutableBuilder[Self <: GraphQLEnumTypeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: GraphQLEnumValueConfigMap): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
