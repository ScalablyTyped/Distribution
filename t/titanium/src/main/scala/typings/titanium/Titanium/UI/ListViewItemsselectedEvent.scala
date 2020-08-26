package typings.titanium.Titanium.UI

import typings.titanium.SelectedItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ListViewItemsselectedEventOps[Self <: ListViewItemsselectedEvent] (val x: Self) extends AnyVal {
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
    def setSelectedItemsVarargs(value: SelectedItem*): Self = this.set("selectedItems", js.Array(value :_*))
    @scala.inline
    def setSelectedItems(value: js.Array[SelectedItem]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartingItem(value: SelectedItem): Self = this.set("startingItem", value.asInstanceOf[js.Any])
  }
  
}

