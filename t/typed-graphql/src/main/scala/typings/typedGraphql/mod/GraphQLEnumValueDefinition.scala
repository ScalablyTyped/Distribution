package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLEnumValueDefinition extends StObject {
  
  var deprecationReason: String = js.native
  
  var description: String = js.native
  
  var name: String = js.native
  
  var value: js.Any = js.native
}
object GraphQLEnumValueDefinition {
  
  @scala.inline
  def apply(deprecationReason: String, description: String, name: String, value: js.Any): GraphQLEnumValueDefinition = {
    val __obj = js.Dynamic.literal(deprecationReason = deprecationReason.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumValueDefinition]
  }
  
  @scala.inline
  implicit class GraphQLEnumValueDefinitionMutableBuilder[Self <: GraphQLEnumValueDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecationReason(value: String): Self = StObject.set(x, "deprecationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
