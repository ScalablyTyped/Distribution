package typings.vsoNodeApi.workInterfacesMod

import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeReference
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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryConfiguration]
  }
}

