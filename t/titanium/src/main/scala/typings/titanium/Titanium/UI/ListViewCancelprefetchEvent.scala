package typings.titanium.Titanium.UI

import typings.titanium.ListItemEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when list items that previously were considered as candidates for pre-fetching were not
  * actually used. Note that this event is only available on iOS 10 and later
  */
trait ListViewCancelprefetchEvent extends ListViewBaseEvent {
  /**
    * An array of prefetched items.
    */
  var prefetchedItems: js.Array[ListItemEventType]
}

object ListViewCancelprefetchEvent {
  @scala.inline
  def apply(prefetchedItems: js.Array[ListItemEventType], source: ListView): ListViewCancelprefetchEvent = {
    val __obj = js.Dynamic.literal(prefetchedItems = prefetchedItems.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewCancelprefetchEvent]
  }
}

