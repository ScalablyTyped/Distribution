package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListModel extends PickListMetadataModel {
  /**
    * A list of PicklistItemModel
    */
  var items: js.Array[PickListItemModel]
}

object PickListModel {
  @scala.inline
  def apply(
    id: String,
    isSuggested: Boolean,
    items: js.Array[PickListItemModel],
    name: String,
    `type`: String,
    url: String
  ): PickListModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSuggested = isSuggested.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListModel]
  }
}

