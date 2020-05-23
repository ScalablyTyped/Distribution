package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the scrollable region stops being dragged.
  */
trait ScrollViewDragendEvent extends ScrollViewBaseEvent {
  /**
    * Indicates whether scrolling will continue but decelerate, now that the drag gesture has
    * been released by the touch. If `false`, scrolling will stop immediately.
    * Is always `true` on Android.
    */
  var decelerate: Boolean
}

object ScrollViewDragendEvent {
  @scala.inline
  def apply(decelerate: Boolean, source: ScrollView): ScrollViewDragendEvent = {
    val __obj = js.Dynamic.literal(decelerate = decelerate.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewDragendEvent]
  }
}

