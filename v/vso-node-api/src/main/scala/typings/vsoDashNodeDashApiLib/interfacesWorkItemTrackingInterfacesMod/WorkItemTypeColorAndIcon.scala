package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeColorAndIcon extends js.Object {
  /**
    * The color of the work item type in hex format.
    */
  var color: java.lang.String
  /**
    * Tthe work item type icon.
    */
  var icon: java.lang.String
  /**
    * The name of the work item type.
    */
  var workItemTypeName: java.lang.String
}

object WorkItemTypeColorAndIcon {
  @scala.inline
  def apply(color: java.lang.String, icon: java.lang.String, workItemTypeName: java.lang.String): WorkItemTypeColorAndIcon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("workItemTypeName")(workItemTypeName)
    __obj.asInstanceOf[WorkItemTypeColorAndIcon]
  }
}

