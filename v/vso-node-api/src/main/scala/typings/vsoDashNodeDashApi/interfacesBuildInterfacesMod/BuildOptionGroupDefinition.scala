package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptionGroupDefinition extends js.Object {
  /**
    * The name of the group to display in the UI.
    */
  var displayName: String
  /**
    * Indicates whether the group is initially displayed as expanded in the UI.
    */
  var isExpanded: Boolean
  /**
    * The internal name of the group.
    */
  var name: String
}

object BuildOptionGroupDefinition {
  @scala.inline
  def apply(displayName: String, isExpanded: Boolean, name: String): BuildOptionGroupDefinition = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildOptionGroupDefinition]
  }
}

