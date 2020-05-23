package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the scrollable region stops being dragged.
  */
trait ScrollView_DragEndEvent extends ScrollViewBaseEvent {
  /**
    * Indicates whether scrolling will continue but decelerate, now that the drag gesture has
    * been released by the touch. If `false`, scrolling will stop immediately.
    */
  var decelerate: Boolean
}

object ScrollView_DragEndEvent {
  @scala.inline
  def apply(decelerate: Boolean, source: ScrollView): ScrollView_DragEndEvent = {
    val __obj = js.Dynamic.literal(decelerate = decelerate.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollView_DragEndEvent]
  }
}

