package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptionDefinition extends BuildOptionDefinitionReference {
  /**
    * The description.
    */
  var description: java.lang.String
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
  var name: java.lang.String
  /**
    * A value that indicates the relative order in which the behavior should be applied.
    */
  var ordinal: scala.Double
}

object BuildOptionDefinition {
  @scala.inline
  def apply(
    description: java.lang.String,
    groups: js.Array[BuildOptionGroupDefinition],
    id: java.lang.String,
    inputs: js.Array[BuildOptionInputDefinition],
    name: java.lang.String,
    ordinal: scala.Double
  ): BuildOptionDefinition = {
    val __obj = js.Dynamic.literal(description = description, groups = groups, id = id, inputs = inputs, name = name, ordinal = ordinal)
  
    __obj.asInstanceOf[BuildOptionDefinition]
  }
}

