package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemStateResultModel extends js.Object {
  var color: String
  var hidden: Boolean
  var id: String
  var name: String
  var order: Double
  var stateCategory: String
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
    val __obj = js.Dynamic.literal(color = color, hidden = hidden, id = id, name = name, order = order, stateCategory = stateCategory, url = url)
  
    __obj.asInstanceOf[WorkItemStateResultModel]
  }
}

