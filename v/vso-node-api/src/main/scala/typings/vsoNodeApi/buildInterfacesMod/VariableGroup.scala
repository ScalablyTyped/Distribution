package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableGroup extends VariableGroupReference {
  
  /**
    * The description.
    */
  var description: String = js.native
  
  /**
    * The name of the variable group.
    */
  var name: String = js.native
  
  /**
    * The type of the variable group.
    */
  var `type`: String = js.native
  
  var variables: StringDictionary[BuildDefinitionVariable] = js.native
}
object VariableGroup {
  
  @scala.inline
  def apply(
    description: String,
    id: Double,
    name: String,
    `type`: String,
    variables: StringDictionary[BuildDefinitionVariable]
  ): VariableGroup = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableGroup]
  }
  
  @scala.inline
  implicit class VariableGroupMutableBuilder[Self <: VariableGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: StringDictionary[BuildDefinitionVariable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
