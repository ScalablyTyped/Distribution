package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a list row is moved to a different location by the user.
  */
trait ListViewMoveEvent extends ListViewBaseEvent {
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
    * List section from which the item is moved.
    */
  var section: ListSection
  /**
    * Section index.
    */
  var sectionIndex: Double
  /**
    * Position within the `targetSection`.
    */
  var targetItemIndex: Double
  /**
    * List section to which the item is moved. Might be the same as `section` property.
    */
  var targetSection: ListSection
  /**
    * Section index.
    */
  var targetSectionIndex: Double
}

object ListViewMoveEvent {
  @scala.inline
  def apply(
    bubbles: Boolean,
    itemId: String,
    itemIndex: Double,
    section: ListSection,
    sectionIndex: Double,
    source: ListView,
    targetItemIndex: Double,
    targetSection: ListSection,
    targetSectionIndex: Double
  ): ListViewMoveEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], targetItemIndex = targetItemIndex.asInstanceOf[js.Any], targetSection = targetSection.asInstanceOf[js.Any], targetSectionIndex = targetSectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewMoveEvent]
  }
}

