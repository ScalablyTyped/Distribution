package typings.vsoNodeApi.buildInterfacesMod

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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptionDefinition]
  }
}

