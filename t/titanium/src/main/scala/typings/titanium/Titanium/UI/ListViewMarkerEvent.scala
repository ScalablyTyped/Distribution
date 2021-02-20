package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the list view displays the reference item.
  */
@js.native
trait ListViewMarkerEvent extends ListViewBaseEvent {
  
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean = js.native
  
  /**
    * section item index of the reference item.
    */
  var itemIndex: Double = js.native
  
  /**
    * section index of the reference item.
    */
  var sectionIndex: Double = js.native
}
object ListViewMarkerEvent {
  
  @scala.inline
  def apply(bubbles: Boolean, itemIndex: Double, sectionIndex: Double, source: ListView): ListViewMarkerEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewMarkerEvent]
  }
  
  @scala.inline
  implicit class ListViewMarkerEventMutableBuilder[Self <: ListViewMarkerEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
  }
}
