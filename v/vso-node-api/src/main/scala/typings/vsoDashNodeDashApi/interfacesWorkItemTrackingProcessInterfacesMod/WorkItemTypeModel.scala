package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeModel extends js.Object {
  var behaviors: js.Array[WorkItemTypeBehavior]
  var `class`: WorkItemTypeClass
  var color: String
  var description: String
  var icon: String
  var id: String
  /**
    * Parent WIT Id/Internal ReferenceName that it inherits from
    */
  var inherits: String
  var isDisabled: Boolean
  var layout: FormLayout
  var name: String
  var states: js.Array[WorkItemStateResultModel]
  var url: String
}

object WorkItemTypeModel {
  @scala.inline
  def apply(
    behaviors: js.Array[WorkItemTypeBehavior],
    `class`: WorkItemTypeClass,
    color: String,
    description: String,
    icon: String,
    id: String,
    inherits: String,
    isDisabled: Boolean,
    layout: FormLayout,
    name: String,
    states: js.Array[WorkItemStateResultModel],
    url: String
  ): WorkItemTypeModel = {
    val __obj = js.Dynamic.literal(behaviors = behaviors, color = color, description = description, icon = icon, id = id, inherits = inherits, isDisabled = isDisabled, layout = layout, name = name, states = states, url = url)
    __obj.updateDynamic("class")(`class`)
    __obj.asInstanceOf[WorkItemTypeModel]
  }
}

