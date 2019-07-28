package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

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
    val __obj = js.Dynamic.literal(primaryColor = primaryColor, secondaryColor = secondaryColor, workItemTypeName = workItemTypeName)
  
    __obj.asInstanceOf[WorkItemTypeColor]
  }
}

