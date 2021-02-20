package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the scrollable region stops being dragged.
  */
@js.native
trait TableViewDragendEvent extends TableViewBaseEvent {
  
  /**
    * Indicates whether scrolling will continue but decelerate, now that the drag gesture has
    * been released by the touch. If `false`, scrolling will stop immediately.
    */
  var decelerate: Boolean = js.native
}
object TableViewDragendEvent {
  
  @scala.inline
  def apply(decelerate: Boolean, source: TableView): TableViewDragendEvent = {
    val __obj = js.Dynamic.literal(decelerate = decelerate.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewDragendEvent]
  }
  
  @scala.inline
  implicit class TableViewDragendEventMutableBuilder[Self <: TableViewDragendEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecelerate(value: Boolean): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
  }
}
