package typings.titanium.Titanium.UI

import typings.titanium.SelectedItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when user stops two-pan gesture interaction for selecting multiple items.
		 * It is used with <Titanium.UI.ListView.allowsMultipleSelectionInteraction>.
		 */
trait ListViewItemsselectedEvent extends ListViewBaseEvent {
  /**
  			 * List of items selected by user.
  			 */
  var selectedItems: js.Array[SelectedItem]
  /**
  			 * First item selected when user started interaction.
  			 */
  var startingItem: SelectedItem
}

object ListViewItemsselectedEvent {
  @scala.inline
  def apply(selectedItems: js.Array[SelectedItem], source: ListView, startingItem: SelectedItem): ListViewItemsselectedEvent = {
    val __obj = js.Dynamic.literal(selectedItems = selectedItems.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], startingItem = startingItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewItemsselectedEvent]
  }
}

