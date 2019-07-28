package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptionDefinition extends BuildOptionDefinitionReference {
  /**
    * The description.
    */
  var description: String
  /**
    * The list of input groups defined for the build option.
    */
  var groups: js.Array[BuildOptionGroupDefinition]
  /**
    * The list of inputs defined for the build option.
    */
  var inputs: js.Array[BuildOptionInputDefinition]
  /**
    * The name of the build option.
    */
  var name: String
  /**
    * A value that indicates the relative order in which the behavior should be applied.
    */
  var ordinal: Double
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
    val __obj = js.Dynamic.literal(description = description, groups = groups, id = id, inputs = inputs, name = name, ordinal = ordinal)
  
    __obj.asInstanceOf[BuildOptionDefinition]
  }
}

