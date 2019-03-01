package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptionGroupDefinition extends js.Object {
  /**
    * The name of the group to display in the UI.
    */
  var displayName: java.lang.String
  /**
    * Indicates whether the group is initially displayed as expanded in the UI.
    */
  var isExpanded: scala.Boolean
  /**
    * The internal name of the group.
    */
  var name: java.lang.String
}

object BuildOptionGroupDefinition {
  @scala.inline
  def apply(displayName: java.lang.String, isExpanded: scala.Boolean, name: java.lang.String): BuildOptionGroupDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("isExpanded")(isExpanded)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BuildOptionGroupDefinition]
  }
}

