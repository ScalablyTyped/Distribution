package typings.titanium.Titanium.UI

import typings.titanium.ListItemEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when new list items are prefetched. The items are ordered ascending by geometric distance
  * from the list view. Note that this event is only available on iOS 10 and later.
  */
@js.native
trait ListViewPrefetchEvent extends ListViewBaseEvent {
  
  /**
    * An array of prefetched items.
    */
  var prefetchedItems: js.Array[ListItemEventType] = js.native
}
object ListViewPrefetchEvent {
  
  @scala.inline
  def apply(prefetchedItems: js.Array[ListItemEventType], source: ListView): ListViewPrefetchEvent = {
    val __obj = js.Dynamic.literal(prefetchedItems = prefetchedItems.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewPrefetchEvent]
  }
  
  @scala.inline
  implicit class ListViewPrefetchEventMutableBuilder[Self <: ListViewPrefetchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefetchedItems(value: js.Array[ListItemEventType]): Self = StObject.set(x, "prefetchedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefetchedItemsVarargs(value: ListItemEventType*): Self = StObject.set(x, "prefetchedItems", js.Array(value :_*))
  }
}
