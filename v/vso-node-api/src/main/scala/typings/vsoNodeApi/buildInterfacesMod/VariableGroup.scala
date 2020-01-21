package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableGroup extends VariableGroupReference {
  /**
    * The description.
    */
  var description: String
  /**
    * The name of the variable group.
    */
  var name: String
  /**
    * The type of the variable group.
    */
  var `type`: String
  var variables: StringDictionary[BuildDefinitionVariable]
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
}

