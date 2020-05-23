package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires when the list view starts scrolling by user interaction. Calling the `scrollTo` methods will not fire this event
  */
trait ListViewScrollstartEvent extends ListViewBaseEvent {
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean
  /**
    * The first visible item in the list view when the event fires; this item might not be fully visible. May be -1 on iOS.
    */
  var firstVisibleItem: js.Any
  /**
    * The index of the first visible item in the list view when the event fires; this item might not be fully visible.
    * Note: The index is `-1` when there are no items in the <Titanium.UI.ListView>.
    */
  var firstVisibleItemIndex: Double
  /**
    * The first visible section in the list view when the event fires.
    */
  var firstVisibleSection: ListSection
  /**
    * The index of the first visible section in the list view when the event fires.
    * Note: The index is `-1` when there are no items in the <Titanium.UI.ListView>.
    */
  var firstVisibleSectionIndex: Double
  /**
    * The number of visible items in the list view when the event fires.
    */
  var visibleItemCount: Double
}

object ListViewScrollstartEvent {
  @scala.inline
  def apply(
    bubbles: Boolean,
    firstVisibleItem: js.Any,
    firstVisibleItemIndex: Double,
    firstVisibleSection: ListSection,
    firstVisibleSectionIndex: Double,
    source: ListView,
    visibleItemCount: Double
  ): ListViewScrollstartEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], firstVisibleItem = firstVisibleItem.asInstanceOf[js.Any], firstVisibleItemIndex = firstVisibleItemIndex.asInstanceOf[js.Any], firstVisibleSection = firstVisibleSection.asInstanceOf[js.Any], firstVisibleSectionIndex = firstVisibleSectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], visibleItemCount = visibleItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewScrollstartEvent]
  }
}

