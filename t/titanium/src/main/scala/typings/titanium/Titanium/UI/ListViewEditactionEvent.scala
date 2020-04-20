package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the user interacts with one of the custom edit actions defined by <Titanium.UI.ListItem.editActions>.
		 */
trait ListViewEditactionEvent extends ListViewBaseEvent {
  /**
  			 * The [title](RowActionType.title) as defined in the row action object.
  			 */
  var action: String
  /**
  			 * false. This event does not bubble.
  			 */
  var bubbles: Boolean
  /**
  			 * The [identifier](RowActionType. identifier) of the row action. Only included in the event
  			 * if previously defined. Available in Titanium 6.0.0 and later.
  			 */
  var identifier: String
  /**
  			 * The item ID bound to the list item that generated the event.
  			 */
  var itemId: String
  /**
  			 * Item index.
  			 */
  var itemIndex: Double
  /**
  			 * List section from which the event was generated.
  			 */
  var section: ListSection
  /**
  			 * Section index.
  			 */
  var sectionIndex: Double
}

object ListViewEditactionEvent {
  @scala.inline
  def apply(
    action: String,
    bubbles: Boolean,
    identifier: String,
    itemId: String,
    itemIndex: Double,
    section: ListSection,
    sectionIndex: Double,
    source: ListView
  ): ListViewEditactionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewEditactionEvent]
  }
}

