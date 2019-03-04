package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemStateResultModel extends js.Object {
  var color: java.lang.String
  var hidden: scala.Boolean
  var id: java.lang.String
  var name: java.lang.String
  var order: scala.Double
  var stateCategory: java.lang.String
  var url: java.lang.String
}

object WorkItemStateResultModel {
  @scala.inline
  def apply(
    color: java.lang.String,
    hidden: scala.Boolean,
    id: java.lang.String,
    name: java.lang.String,
    order: scala.Double,
    stateCategory: java.lang.String,
    url: java.lang.String
  ): WorkItemStateResultModel = {
    val __obj = js.Dynamic.literal(color = color, hidden = hidden, id = id, name = name, order = order, stateCategory = stateCategory, url = url)
  
    __obj.asInstanceOf[WorkItemStateResultModel]
  }
}

