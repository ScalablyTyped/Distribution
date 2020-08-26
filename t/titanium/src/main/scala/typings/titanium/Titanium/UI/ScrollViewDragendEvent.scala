package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ScrollViewDragendEventOps[Self <: ScrollViewDragendEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecelerate(value: Boolean): Self = this.set("decelerate", value.asInstanceOf[js.Any])
  }
  
}

