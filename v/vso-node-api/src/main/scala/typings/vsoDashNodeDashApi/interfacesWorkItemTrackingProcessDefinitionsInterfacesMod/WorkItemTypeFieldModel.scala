package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeFieldModel extends js.Object {
  var allowGroups: Boolean
  var defaultValue: String
  var name: String
  var pickList: PickListMetadataModel
  var readOnly: Boolean
  var referenceName: String
  var required: Boolean
  var `type`: FieldType
  var url: String
}

object WorkItemTypeFieldModel {
  @scala.inline
  def apply(
    allowGroups: Boolean,
    defaultValue: String,
    name: String,
    pickList: PickListMetadataModel,
    readOnly: Boolean,
    referenceName: String,
    required: Boolean,
    `type`: FieldType,
    url: String
  ): WorkItemTypeFieldModel = {
    val __obj = js.Dynamic.literal(allowGroups = allowGroups.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pickList = pickList.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeFieldModel]
  }
}

