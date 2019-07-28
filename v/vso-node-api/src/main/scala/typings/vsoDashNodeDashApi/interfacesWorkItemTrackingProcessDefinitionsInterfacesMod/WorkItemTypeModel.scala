package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeModel extends js.Object {
  /**
    * Behaviors of the work item type
    */
  var behaviors: js.Array[WorkItemTypeBehavior]
  /**
    * Class of the work item type
    */
  var `class`: WorkItemTypeClass
  /**
    * Color of the work item type
    */
  var color: String
  /**
    * Description of the work item type
    */
  var description: String
  /**
    * Icon of the work item type
    */
  var icon: String
  /**
    * The ID of the work item type
    */
  var id: String
  /**
    * Parent WIT Id/Internal ReferenceName that it inherits from
    */
  var inherits: String
  /**
    * Is work item type disabled
    */
  var isDisabled: Boolean
  /**
    * Layout of the work item type
    */
  var layout: FormLayout
  /**
    * Name of the work item type
    */
  var name: String
  /**
    * States of the work item type
    */
  var states: js.Array[WorkItemStateResultModel]
  /**
    * Url of the work item type
    */
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

