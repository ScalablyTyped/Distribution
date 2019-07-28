package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryConfiguration extends js.Object {
  /**
    * Name
    */
  var name: String
  /**
    * Category Reference Name
    */
  var referenceName: String
  /**
    * Work item types for the backlog category
    */
  var workItemTypes: js.Array[WorkItemTypeReference]
}

object CategoryConfiguration {
  @scala.inline
  def apply(name: String, referenceName: String, workItemTypes: js.Array[WorkItemTypeReference]): CategoryConfiguration = {
    val __obj = js.Dynamic.literal(name = name, referenceName = referenceName, workItemTypes = workItemTypes)
  
    __obj.asInstanceOf[CategoryConfiguration]
  }
}

