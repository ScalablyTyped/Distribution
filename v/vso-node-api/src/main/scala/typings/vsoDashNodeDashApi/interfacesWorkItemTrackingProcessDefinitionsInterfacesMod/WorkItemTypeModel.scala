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
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeModel]
  }
}

