package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeColor extends js.Object {
  /**
    * Gets or sets the color of the primary.
    */
  var primaryColor: String
  /**
    * Gets or sets the color of the secondary.
    */
  var secondaryColor: String
  /**
    * The name of the work item type.
    */
  var workItemTypeName: String
}

object WorkItemTypeColor {
  @scala.inline
  def apply(primaryColor: String, secondaryColor: String, workItemTypeName: String): WorkItemTypeColor = {
    val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any], secondaryColor = secondaryColor.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemTypeColor]
  }
}

