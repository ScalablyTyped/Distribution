package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the user stops dragging the list view.
  */
@js.native
trait ListViewDragendEvent extends ListViewBaseEvent {
  
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean = js.native
}
object ListViewDragendEvent {
  
  @scala.inline
  def apply(bubbles: Boolean, source: ListView): ListViewDragendEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewDragendEvent]
  }
  
  @scala.inline
  implicit class ListViewDragendEventMutableBuilder[Self <: ListViewDragendEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
  }
}
