package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildOptionDefinition extends BuildOptionDefinitionReference {
  
  /**
    * The description.
    */
  var description: String = js.native
  
  /**
    * The list of input groups defined for the build option.
    */
  var groups: js.Array[BuildOptionGroupDefinition] = js.native
  
  /**
    * The list of inputs defined for the build option.
    */
  var inputs: js.Array[BuildOptionInputDefinition] = js.native
  
  /**
    * The name of the build option.
    */
  var name: String = js.native
  
  /**
    * A value that indicates the relative order in which the behavior should be applied.
    */
  var ordinal: Double = js.native
}
object BuildOptionDefinition {
  
  @scala.inline
  def apply(
    description: String,
    groups: js.Array[BuildOptionGroupDefinition],
    id: String,
    inputs: js.Array[BuildOptionInputDefinition],
    name: String,
    ordinal: Double
  ): BuildOptionDefinition = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptionDefinition]
  }
  
  @scala.inline
  implicit class BuildOptionDefinitionMutableBuilder[Self <: BuildOptionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: js.Array[BuildOptionGroupDefinition]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: BuildOptionGroupDefinition*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[BuildOptionInputDefinition]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: BuildOptionInputDefinition*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
  }
}
