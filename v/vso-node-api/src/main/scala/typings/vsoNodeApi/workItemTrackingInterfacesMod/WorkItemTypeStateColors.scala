package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeStateColors extends js.Object {
  /**
    * Work item type state colors
    */
  var stateColors: js.Array[WorkItemStateColor]
  /**
    * Work item type name
    */
  var workItemTypeName: String
}

object WorkItemTypeStateColors {
  @scala.inline
  def apply(stateColors: js.Array[WorkItemStateColor], workItemTypeName: String): WorkItemTypeStateColors = {
    val __obj = js.Dynamic.literal(stateColors = stateColors.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeStateColors]
  }
}

