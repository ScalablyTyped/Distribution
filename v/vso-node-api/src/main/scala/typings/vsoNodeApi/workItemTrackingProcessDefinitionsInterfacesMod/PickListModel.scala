package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickListModel
  extends StObject
     with PickListMetadataModel {
  
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
  
  @scala.inline
  implicit class PickListModelMutableBuilder[Self <: PickListModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PickListItemModel]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: PickListItemModel*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
