package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

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
  var workItemTypeName: java.lang.String
}

object WorkItemTypeStateColors {
  @scala.inline
  def apply(stateColors: js.Array[WorkItemStateColor], workItemTypeName: java.lang.String): WorkItemTypeStateColors = {
    val __obj = js.Dynamic.literal(stateColors = stateColors, workItemTypeName = workItemTypeName)
  
    __obj.asInstanceOf[WorkItemTypeStateColors]
  }
}

