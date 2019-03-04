package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeColor extends js.Object {
  /**
    * Gets or sets the color of the primary.
    */
  var primaryColor: java.lang.String
  /**
    * Gets or sets the color of the secondary.
    */
  var secondaryColor: java.lang.String
  /**
    * The name of the work item type.
    */
  var workItemTypeName: java.lang.String
}

object WorkItemTypeColor {
  @scala.inline
  def apply(
    primaryColor: java.lang.String,
    secondaryColor: java.lang.String,
    workItemTypeName: java.lang.String
  ): WorkItemTypeColor = {
    val __obj = js.Dynamic.literal(primaryColor = primaryColor, secondaryColor = secondaryColor, workItemTypeName = workItemTypeName)
  
    __obj.asInstanceOf[WorkItemTypeColor]
  }
}

