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
    val __obj = js.Dynamic.literal(`class` = `class`)
    __obj.updateDynamic("behaviors")(behaviors)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("inherits")(inherits)
    __obj.updateDynamic("isDisabled")(isDisabled)
    __obj.updateDynamic("layout")(layout)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("states")(states)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemTypeModel]
  }
}

