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
    val __obj = js.Dynamic.literal(`abstract` = `abstract`)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("inherits")(inherits)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("overriden")(overriden)
    __obj.updateDynamic("rank")(rank)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemBehavior]
  }
}

