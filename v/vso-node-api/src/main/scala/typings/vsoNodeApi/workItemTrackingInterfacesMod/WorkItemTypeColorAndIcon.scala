package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeColorAndIcon extends js.Object {
  /**
    * The color of the work item type in hex format.
    */
  var color: String
  /**
    * Tthe work item type icon.
    */
  var icon: String
  /**
    * The name of the work item type.
    */
  var workItemTypeName: String
}

object WorkItemTypeColorAndIcon {
  @scala.inline
  def apply(color: String, icon: String, workItemTypeName: String): WorkItemTypeColorAndIcon = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeColorAndIcon]
  }
}

