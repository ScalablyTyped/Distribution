package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fires when the list view ends scrolling. Calling the `scrollTo` methods will not fire this event
  */
@js.native
trait ListViewScrollendEvent extends ListViewBaseEvent {
  
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean = js.native
  
  /**
    * The first visible item in the list view when the event fires; this item might not be fully visible. May be -1 on iOS.
    */
  var firstVisibleItem: js.Any = js.native
  
  /**
    * The index of the first visible item in the list view when the event fires; this item might not be fully visible.
    */
  var firstVisibleItemIndex: Double = js.native
  
  /**
    * The first visible section in the list view when the event fires.
    */
  var firstVisibleSection: ListSection = js.native
  
  /**
    * The index of the first visible section in the list view when the event fires.
    */
  var firstVisibleSectionIndex: Double = js.native
  
  /**
    * The number of visible items in the list view when the event fires.
    */
  var visibleItemCount: Double = js.native
}
object ListViewScrollendEvent {
  
  @scala.inline
  def apply(
    bubbles: Boolean,
    firstVisibleItem: js.Any,
    firstVisibleItemIndex: Double,
    firstVisibleSection: ListSection,
    firstVisibleSectionIndex: Double,
    source: ListView,
    visibleItemCount: Double
  ): ListViewScrollendEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], firstVisibleItem = firstVisibleItem.asInstanceOf[js.Any], firstVisibleItemIndex = firstVisibleItemIndex.asInstanceOf[js.Any], firstVisibleSection = firstVisibleSection.asInstanceOf[js.Any], firstVisibleSectionIndex = firstVisibleSectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], visibleItemCount = visibleItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewScrollendEvent]
  }
  
  @scala.inline
  implicit class ListViewScrollendEventMutableBuilder[Self <: ListViewScrollendEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstVisibleItem(value: js.Any): Self = StObject.set(x, "firstVisibleItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstVisibleItemIndex(value: Double): Self = StObject.set(x, "firstVisibleItemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstVisibleSection(value: ListSection): Self = StObject.set(x, "firstVisibleSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstVisibleSectionIndex(value: Double): Self = StObject.set(x, "firstVisibleSectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleItemCount(value: Double): Self = StObject.set(x, "visibleItemCount", value.asInstanceOf[js.Any])
  }
}
