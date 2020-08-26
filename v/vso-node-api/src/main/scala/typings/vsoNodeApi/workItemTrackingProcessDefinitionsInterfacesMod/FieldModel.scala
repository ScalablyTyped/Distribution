package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldModel extends js.Object {
  /**
    * Description about field
    */
  var description: String = js.native
  /**
    * ID of the field
    */
  var id: String = js.native
  /**
    * Name of the field
    */
  var name: String = js.native
  /**
    * Reference to picklist in this field
    */
  var pickList: PickListMetadataModel = js.native
  /**
    * Type of field
    */
  var `type`: FieldType = js.native
  /**
    * Url to the field
    */
  var url: String = js.native
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
  @scala.inline
  implicit class FieldModelOps[Self <: FieldModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPickList(value: PickListMetadataModel): Self = this.set("pickList", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: FieldType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

