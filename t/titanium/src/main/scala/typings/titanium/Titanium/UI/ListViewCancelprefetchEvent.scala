package typings.titanium.Titanium.UI

import typings.titanium.ListItemEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ListViewCancelprefetchEventMutableBuilder[Self <: ListViewCancelprefetchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefetchedItems(value: js.Array[ListItemEventType]): Self = StObject.set(x, "prefetchedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefetchedItemsVarargs(value: ListItemEventType*): Self = StObject.set(x, "prefetchedItems", js.Array(value :_*))
  }
}
