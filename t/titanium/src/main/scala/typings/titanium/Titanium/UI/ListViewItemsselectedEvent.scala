package typings.titanium.Titanium.UI

import typings.titanium.SelectedItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when user stops two-pan gesture interaction for selecting multiple items.
  * It is used with <Titanium.UI.ListView.allowsMultipleSelectionInteraction>.
  */
@js.native
trait ListViewItemsselectedEvent extends ListViewBaseEvent {
  
  /**
    * List of items selected by user.
    */
  var selectedItems: js.Array[SelectedItem] = js.native
  
  /**
    * First item selected when user started interaction.
    */
  var startingItem: SelectedItem = js.native
}
object ListViewItemsselectedEvent {
  
  @scala.inline
  def apply(selectedItems: js.Array[SelectedItem], source: ListView, startingItem: SelectedItem): ListViewItemsselectedEvent = {
    val __obj = js.Dynamic.literal(selectedItems = selectedItems.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], startingItem = startingItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewItemsselectedEvent]
  }
  
  @scala.inline
  implicit class ListViewItemsselectedEventMutableBuilder[Self <: ListViewItemsselectedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedItems(value: js.Array[SelectedItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsVarargs(value: SelectedItem*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setStartingItem(value: SelectedItem): Self = StObject.set(x, "startingItem", value.asInstanceOf[js.Any])
  }
}
