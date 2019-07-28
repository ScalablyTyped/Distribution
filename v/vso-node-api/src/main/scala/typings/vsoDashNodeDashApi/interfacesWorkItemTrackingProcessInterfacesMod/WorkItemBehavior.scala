package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemBehavior extends js.Object {
  var `abstract`: Boolean
  var color: String
  var description: String
  var fields: js.Array[WorkItemBehaviorField]
  var id: String
  var inherits: WorkItemBehaviorReference
  var name: String
  var overriden: Boolean
  var rank: Double
  var url: String
}

object WorkItemBehavior {
  @scala.inline
  def apply(
    `abstract`: Boolean,
    color: String,
    description: String,
    fields: js.Array[WorkItemBehaviorField],
    id: String,
    inherits: WorkItemBehaviorReference,
    name: String,
    overriden: Boolean,
    rank: Double,
    url: String
  ): WorkItemBehavior = {
    val __obj = js.Dynamic.literal(color = color, description = description, fields = fields, id = id, inherits = inherits, name = name, overriden = overriden, rank = rank, url = url)
    __obj.updateDynamic("abstract")(`abstract`)
    __obj.asInstanceOf[WorkItemBehavior]
  }
}

