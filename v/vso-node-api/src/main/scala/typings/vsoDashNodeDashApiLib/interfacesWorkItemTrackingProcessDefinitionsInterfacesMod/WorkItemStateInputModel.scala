package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemStateInputModel extends js.Object {
  /**
    * Color of the state
    */
  var color: java.lang.String
  /**
    * Name of the state
    */
  var name: java.lang.String
  /**
    * Order in which state should appear
    */
  var order: scala.Double
  /**
    * Category of the state
    */
  var stateCategory: java.lang.String
}

object WorkItemStateInputModel {
  @scala.inline
  def apply(
    color: java.lang.String,
    name: java.lang.String,
    order: scala.Double,
    stateCategory: java.lang.String
  ): WorkItemStateInputModel = {
    val __obj = js.Dynamic.literal(color = color, name = name, order = order, stateCategory = stateCategory)
  
    __obj.asInstanceOf[WorkItemStateInputModel]
  }
}

