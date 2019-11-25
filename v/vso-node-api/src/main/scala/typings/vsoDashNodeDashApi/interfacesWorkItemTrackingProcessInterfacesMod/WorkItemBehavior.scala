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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overriden = overriden.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemBehavior]
  }
}

