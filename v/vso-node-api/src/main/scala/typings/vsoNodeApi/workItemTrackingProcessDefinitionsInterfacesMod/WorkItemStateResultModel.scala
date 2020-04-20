package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemStateResultModel extends js.Object {
  /**
    * Color of the state
    */
  var color: String
  /**
    * Is the state hidden
    */
  var hidden: Boolean
  /**
    * The ID of the State
    */
  var id: String
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
  /**
    * Url of the state
    */
  var url: String
}

object WorkItemStateResultModel {
  @scala.inline
  def apply(
    color: String,
    hidden: Boolean,
    id: String,
    name: String,
    order: Double,
    stateCategory: String,
    url: String
  ): WorkItemStateResultModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], stateCategory = stateCategory.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemStateResultModel]
  }
}

