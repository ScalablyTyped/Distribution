package typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDescriptor extends StObject {
  
  /**
    * The ids of all inputs that the value of this input is dependent on.
    */
  var dependencyInputIds: js.Array[String]
  
  /**
    * Description of what this input is used for
    */
  var description: String
  
  /**
    * The group localized name to which this input belongs and can be shown as a header for the container that will include all the inputs in the group.
    */
  var groupName: String
  
  /**
    * If true, the value information for this input is dynamic and should be fetched when the value of dependency inputs change.
    */
  var hasDynamicValueInformation: Boolean
  
  /**
    * Identifier for the subscription input
    */
  var id: String
  
  /**
    * Mode in which the value of this input should be entered
    */
  var inputMode: InputMode
  
  /**
    * Gets whether this input is confidential, such as for a password or application key
    */
  var isConfidential: Boolean
  
  /**
    * Localized name which can be shown as a label for the subscription input
    */
  var name: String
  
  /**
    * Gets whether this input is included in the default generated action description.
    */
  var useInDefaultDescription: Boolean
  
  /**
    * Information to use to validate this input's value
    */
  var validation: InputValidation
  
  /**
    * A hint for input value. It can be used in the UI as the input placeholder.
    */
  var valueHint: String
  
  /**
    * Information about possible values for this input
    */
  var values: InputValues
}
object InputDescriptor {
  
  inline def apply(
    dependencyInputIds: js.Array[String],
    description: String,
    groupName: String,
    hasDynamicValueInformation: Boolean,
    id: String,
    inputMode: InputMode,
    isConfidential: Boolean,
    name: String,
    useInDefaultDescription: Boolean,
    validation: InputValidation,
    valueHint: String,
    values: InputValues
  ): InputDescriptor = {
    val __obj = js.Dynamic.literal(dependencyInputIds = dependencyInputIds.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], hasDynamicValueInformation = hasDynamicValueInformation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], isConfidential = isConfidential.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], useInDefaultDescription = useInDefaultDescription.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueHint = valueHint.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDescriptor]
  }
  
  extension [Self <: InputDescriptor](x: Self) {
    
    inline def setDependencyInputIds(value: js.Array[String]): Self = StObject.set(x, "dependencyInputIds", value.asInstanceOf[js.Any])
    
    inline def setDependencyInputIdsVarargs(value: String*): Self = StObject.set(x, "dependencyInputIds", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setHasDynamicValueInformation(value: Boolean): Self = StObject.set(x, "hasDynamicValueInformation", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInputMode(value: InputMode): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    inline def setIsConfidential(value: Boolean): Self = StObject.set(x, "isConfidential", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUseInDefaultDescription(value: Boolean): Self = StObject.set(x, "useInDefaultDescription", value.asInstanceOf[js.Any])
    
    inline def setValidation(value: InputValidation): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValueHint(value: String): Self = StObject.set(x, "valueHint", value.asInstanceOf[js.Any])
    
    inline def setValues(value: InputValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
