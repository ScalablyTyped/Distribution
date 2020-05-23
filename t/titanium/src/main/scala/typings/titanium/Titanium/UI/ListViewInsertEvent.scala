package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a list row is inserted by the user.
  */
trait ListViewInsertEvent extends ListViewBaseEvent {
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean
  /**
    * The item ID bound to the list item that generated the event.
    */
  var itemId: String
  /**
    * Item index.
    */
  var itemIndex: Double
  /**
    * List section from which the item is deleted.
    */
  var section: ListSection
  /**
    * Section index.
    */
  var sectionIndex: Double
}

object ListViewInsertEvent {
  @scala.inline
  def apply(
    bubbles: Boolean,
    itemId: String,
    itemIndex: Double,
    section: ListSection,
    sectionIndex: Double,
    source: ListView
  ): ListViewInsertEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewInsertEvent]
  }
}

