package typings
package vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputDescriptor extends js.Object {
  /**
    * The ids of all inputs that the value of this input is dependent on.
    */
  var dependencyInputIds: js.Array[java.lang.String]
  /**
    * Description of what this input is used for
    */
  var description: java.lang.String
  /**
    * The group localized name to which this input belongs and can be shown as a header for the container that will include all the inputs in the group.
    */
  var groupName: java.lang.String
  /**
    * If true, the value information for this input is dynamic and should be fetched when the value of dependency inputs change.
    */
  var hasDynamicValueInformation: scala.Boolean
  /**
    * Identifier for the subscription input
    */
  var id: java.lang.String
  /**
    * Mode in which the value of this input should be entered
    */
  var inputMode: InputMode
  /**
    * Gets whether this input is confidential, such as for a password or application key
    */
  var isConfidential: scala.Boolean
  /**
    * Localized name which can be shown as a label for the subscription input
    */
  var name: java.lang.String
  /**
    * Gets whether this input is included in the default generated action description.
    */
  var useInDefaultDescription: scala.Boolean
  /**
    * Information to use to validate this input's value
    */
  var validation: InputValidation
  /**
    * A hint for input value. It can be used in the UI as the input placeholder.
    */
  var valueHint: java.lang.String
  /**
    * Information about possible values for this input
    */
  var values: InputValues
}

object InputDescriptor {
  @scala.inline
  def apply(
    dependencyInputIds: js.Array[java.lang.String],
    description: java.lang.String,
    groupName: java.lang.String,
    hasDynamicValueInformation: scala.Boolean,
    id: java.lang.String,
    inputMode: InputMode,
    isConfidential: scala.Boolean,
    name: java.lang.String,
    useInDefaultDescription: scala.Boolean,
    validation: InputValidation,
    valueHint: java.lang.String,
    values: InputValues
  ): InputDescriptor = {
    val __obj = js.Dynamic.literal(dependencyInputIds = dependencyInputIds, description = description, groupName = groupName, hasDynamicValueInformation = hasDynamicValueInformation, id = id, inputMode = inputMode, isConfidential = isConfidential, name = name, useInDefaultDescription = useInDefaultDescription, validation = validation, valueHint = valueHint, values = values)
  
    __obj.asInstanceOf[InputDescriptor]
  }
}

