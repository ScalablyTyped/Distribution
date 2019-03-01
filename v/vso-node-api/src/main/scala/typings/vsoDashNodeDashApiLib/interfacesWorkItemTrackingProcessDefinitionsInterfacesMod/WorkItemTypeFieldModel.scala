package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeFieldModel extends js.Object {
  var allowGroups: scala.Boolean
  var defaultValue: java.lang.String
  var name: java.lang.String
  var pickList: PickListMetadataModel
  var readOnly: scala.Boolean
  var referenceName: java.lang.String
  var required: scala.Boolean
  var `type`: FieldType
  var url: java.lang.String
}

object WorkItemTypeFieldModel {
  @scala.inline
  def apply(
    allowGroups: scala.Boolean,
    defaultValue: java.lang.String,
    name: java.lang.String,
    pickList: PickListMetadataModel,
    readOnly: scala.Boolean,
    referenceName: java.lang.String,
    required: scala.Boolean,
    `type`: FieldType,
    url: java.lang.String
  ): WorkItemTypeFieldModel = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("allowGroups")(allowGroups)
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pickList")(pickList)
    __obj.updateDynamic("readOnly")(readOnly)
    __obj.updateDynamic("referenceName")(referenceName)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemTypeFieldModel]
  }
}

