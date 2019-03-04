package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemBehavior extends js.Object {
  var `abstract`: scala.Boolean
  var color: java.lang.String
  var description: java.lang.String
  var fields: js.Array[WorkItemBehaviorField]
  var id: java.lang.String
  var inherits: WorkItemBehaviorReference
  var name: java.lang.String
  var overriden: scala.Boolean
  var rank: scala.Double
  var url: java.lang.String
}

object WorkItemBehavior {
  @scala.inline
  def apply(
    `abstract`: scala.Boolean,
    color: java.lang.String,
    description: java.lang.String,
    fields: js.Array[WorkItemBehaviorField],
    id: java.lang.String,
    inherits: WorkItemBehaviorReference,
    name: java.lang.String,
    overriden: scala.Boolean,
    rank: scala.Double,
    url: java.lang.String
  ): WorkItemBehavior = {
    val __obj = js.Dynamic.literal(color = color, description = description, fields = fields, id = id, inherits = inherits, name = name, overriden = overriden, rank = rank, url = url)
    __obj.updateDynamic("abstract")(`abstract`)
    __obj.asInstanceOf[WorkItemBehavior]
  }
}

