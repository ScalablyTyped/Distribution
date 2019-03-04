package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

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
    id: java.lang.String,
    isSuggested: scala.Boolean,
    items: js.Array[PickListItemModel],
    name: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): PickListModel = {
    val __obj = js.Dynamic.literal(id = id, isSuggested = isSuggested, items = items, name = name, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PickListModel]
  }
}

