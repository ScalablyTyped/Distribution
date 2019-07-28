package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
    val __obj = js.Dynamic.literal(description = description, id = id, name = name, variables = variables)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VariableGroup]
  }
}

