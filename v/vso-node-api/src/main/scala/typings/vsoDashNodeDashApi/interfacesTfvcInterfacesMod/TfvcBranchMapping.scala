package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcBranchMapping extends js.Object {
  /**
    * Depth of the branch.
    */
  var depth: String
  /**
    * Server item for the branch.
    */
  var serverItem: String
  /**
    * Type of the branch.
    */
  var `type`: String
}

object TfvcBranchMapping {
  @scala.inline
  def apply(depth: String, serverItem: String, `type`: String): TfvcBranchMapping = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcBranchMapping]
  }
}

