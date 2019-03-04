package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeModel extends js.Object {
  var behaviors: js.Array[WorkItemTypeBehavior]
  var `class`: WorkItemTypeClass
  var color: java.lang.String
  var description: java.lang.String
  var icon: java.lang.String
  var id: java.lang.String
  /**
    * Parent WIT Id/Internal ReferenceName that it inherits from
    */
  var inherits: java.lang.String
  var isDisabled: scala.Boolean
  var layout: FormLayout
  var name: java.lang.String
  var states: js.Array[WorkItemStateResultModel]
  var url: java.lang.String
}

object WorkItemTypeModel {
  @scala.inline
  def apply(
    behaviors: js.Array[WorkItemTypeBehavior],
    `class`: WorkItemTypeClass,
    color: java.lang.String,
    description: java.lang.String,
    icon: java.lang.String,
    id: java.lang.String,
    inherits: java.lang.String,
    isDisabled: scala.Boolean,
    layout: FormLayout,
    name: java.lang.String,
    states: js.Array[WorkItemStateResultModel],
    url: java.lang.String
  ): WorkItemTypeModel = {
    val __obj = js.Dynamic.literal(behaviors = behaviors, color = color, description = description, icon = icon, id = id, inherits = inherits, isDisabled = isDisabled, layout = layout, name = name, states = states, url = url)
    __obj.updateDynamic("class")(`class`)
    __obj.asInstanceOf[WorkItemTypeModel]
  }
}

