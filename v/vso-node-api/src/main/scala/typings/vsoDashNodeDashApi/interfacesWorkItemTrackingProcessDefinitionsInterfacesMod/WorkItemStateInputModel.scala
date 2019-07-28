package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemStateInputModel extends js.Object {
  /**
    * Color of the state
    */
  var color: String
  /**
    * Name of the state
    */
  var name: String
  /**
    * Order in which state should appear
    */
  var order: Double
  /**
    * Category of the state
    */
  var stateCategory: String
}

object WorkItemStateInputModel {
  @scala.inline
  def apply(color: String, name: String, order: Double, stateCategory: String): WorkItemStateInputModel = {
    val __obj = js.Dynamic.literal(color = color, name = name, order = order, stateCategory = stateCategory)
  
    __obj.asInstanceOf[WorkItemStateInputModel]
  }
}

