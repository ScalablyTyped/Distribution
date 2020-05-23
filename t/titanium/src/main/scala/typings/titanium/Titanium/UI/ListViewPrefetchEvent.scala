package typings.titanium.Titanium.UI

import typings.titanium.ListItemEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when new list items are prefetched. The items are ordered ascending by geometric distance
  * from the list view. Note that this event is only available on iOS 10 and later.
  */
trait ListViewPrefetchEvent extends ListViewBaseEvent {
  /**
    * An array of prefetched items.
    */
  var prefetchedItems: js.Array[ListItemEventType]
}

object ListViewPrefetchEvent {
  @scala.inline
  def apply(prefetchedItems: js.Array[ListItemEventType], source: ListView): ListViewPrefetchEvent = {
    val __obj = js.Dynamic.literal(prefetchedItems = prefetchedItems.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewPrefetchEvent]
  }
}

