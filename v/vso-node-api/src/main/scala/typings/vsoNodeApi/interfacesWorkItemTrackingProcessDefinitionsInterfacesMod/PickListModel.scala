package typings.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

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
  
  inline def apply(
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
  
  extension [Self <: PickListModel](x: Self) {
    
    inline def setItems(value: js.Array[PickListItemModel]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: PickListItemModel*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
