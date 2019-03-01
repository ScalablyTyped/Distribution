package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableGroup extends VariableGroupReference {
  /**
    * The description.
    */
  var description: java.lang.String
  /**
    * The name of the variable group.
    */
  var name: java.lang.String
  /**
    * The type of the variable group.
    */
  var `type`: java.lang.String
  var variables: org.scalablytyped.runtime.StringDictionary[BuildDefinitionVariable]
}

object VariableGroup {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    `type`: java.lang.String,
    variables: org.scalablytyped.runtime.StringDictionary[BuildDefinitionVariable]
  ): VariableGroup = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[VariableGroup]
  }
}

