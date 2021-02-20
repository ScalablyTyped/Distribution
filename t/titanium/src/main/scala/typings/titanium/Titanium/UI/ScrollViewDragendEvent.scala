package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the scrollable region stops being dragged.
  */
@js.native
trait ScrollViewDragendEvent extends ScrollViewBaseEvent {
  
  /**
    * Indicates whether scrolling will continue but decelerate, now that the drag gesture has
    * been released by the touch. If `false`, scrolling will stop immediately.
    * Is always `true` on Android.
    */
  var decelerate: Boolean = js.native
}
object ScrollViewDragendEvent {
  
  @scala.inline
  def apply(decelerate: Boolean, source: ScrollView): ScrollViewDragendEvent = {
    val __obj = js.Dynamic.literal(decelerate = decelerate.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewDragendEvent]
  }
  
  @scala.inline
  implicit class ScrollViewDragendEventMutableBuilder[Self <: ScrollViewDragendEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecelerate(value: Boolean): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
  }
}
