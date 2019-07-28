package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

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
    val __obj = js.Dynamic.literal(description = description, id = id, name = name, pickList = pickList, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FieldModel]
  }
}

