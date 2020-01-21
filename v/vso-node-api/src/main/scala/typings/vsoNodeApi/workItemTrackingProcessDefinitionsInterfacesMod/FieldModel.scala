package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldModel extends js.Object {
  /**
    * Description about field
    */
  var description: String
  /**
    * ID of the field
    */
  var id: String
  /**
    * Name of the field
    */
  var name: String
  /**
    * Reference to picklist in this field
    */
  var pickList: PickListMetadataModel
  /**
    * Type of field
    */
  var `type`: FieldType
  /**
    * Url to the field
    */
  var url: String
}

object FieldModel {
  @scala.inline
  def apply(
    description: String,
    id: String,
    name: String,
    pickList: PickListMetadataModel,
    `type`: FieldType,
    url: String
  ): FieldModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pickList = pickList.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldModel]
  }
}

