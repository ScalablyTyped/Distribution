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
    val __obj = js.Dynamic.literal(id = id, isSuggested = isSuggested, items = items, name = name, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PickListModel]
  }
}

