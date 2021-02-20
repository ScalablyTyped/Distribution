package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the scrollable region stops being dragged.
  */
@js.native
trait ScrollView_DragEndEvent extends ScrollViewBaseEvent {
  
  /**
    * Indicates whether scrolling will continue but decelerate, now that the drag gesture has
    * been released by the touch. If `false`, scrolling will stop immediately.
    */
  var decelerate: Boolean = js.native
}
object ScrollView_DragEndEvent {
  
  @scala.inline
  def apply(decelerate: Boolean, source: ScrollView): ScrollView_DragEndEvent = {
    val __obj = js.Dynamic.literal(decelerate = decelerate.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollView_DragEndEvent]
  }
  
  @scala.inline
  implicit class ScrollView_DragEndEventMutableBuilder[Self <: ScrollView_DragEndEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecelerate(value: Boolean): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
  }
}
