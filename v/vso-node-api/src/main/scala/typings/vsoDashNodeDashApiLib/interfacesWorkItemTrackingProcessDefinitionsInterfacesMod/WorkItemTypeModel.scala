package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

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
  var color: java.lang.String
  /**
    * Description of the work item type
    */
  var description: java.lang.String
  /**
    * Icon of the work item type
    */
  var icon: java.lang.String
  /**
    * The ID of the work item type
    */
  var id: java.lang.String
  /**
    * Parent WIT Id/Internal ReferenceName that it inherits from
    */
  var inherits: java.lang.String
  /**
    * Is work item type disabled
    */
  var isDisabled: scala.Boolean
  /**
    * Layout of the work item type
    */
  var layout: FormLayout
  /**
    * Name of the work item type
    */
  var name: java.lang.String
  /**
    * States of the work item type
    */
  var states: js.Array[WorkItemStateResultModel]
  /**
    * Url of the work item type
    */
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

