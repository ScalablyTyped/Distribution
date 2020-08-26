package typings.titanium.Titanium.UI

import typings.titanium.ListItemEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when list items that previously were considered as candidates for pre-fetching were not
  * actually used. Note that this event is only available on iOS 10 and later
  */
@js.native
trait ListViewCancelprefetchEvent extends ListViewBaseEvent {
  /**
    * An array of prefetched items.
    */
  var prefetchedItems: js.Array[ListItemEventType] = js.native
}

object ListViewCancelprefetchEvent {
  @scala.inline
  def apply(prefetchedItems: js.Array[ListItemEventType], source: ListView): ListViewCancelprefetchEvent = {
    val __obj = js.Dynamic.literal(prefetchedItems = prefetchedItems.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewCancelprefetchEvent]
  }
  @scala.inline
  implicit class ListViewCancelprefetchEventOps[Self <: ListViewCancelprefetchEvent] (val x: Self) extends AnyVal {
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
    def setPrefetchedItemsVarargs(value: ListItemEventType*): Self = this.set("prefetchedItems", js.Array(value :_*))
    @scala.inline
    def setPrefetchedItems(value: js.Array[ListItemEventType]): Self = this.set("prefetchedItems", value.asInstanceOf[js.Any])
  }
  
}

