package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires when the list view is scrolling. Calling the `scrollTo` methods will not fire this event
  */
@js.native
trait ListViewScrollingEvent extends ListViewBaseEvent {
  /**
    * Direction of the scroll either 'up', or 'down'.
    */
  var direction: String = js.native
  /**
    * The expected y axis offset when the scrolling action decelerates to a stop.
    */
  var targetContentOffset: Double = js.native
  /**
    * The velocity of the scroll in scale factor per second
    */
  var velocity: Double = js.native
}

object ListViewScrollingEvent {
  @scala.inline
  def apply(direction: String, source: ListView, targetContentOffset: Double, velocity: Double): ListViewScrollingEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], targetContentOffset = targetContentOffset.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewScrollingEvent]
  }
  @scala.inline
  implicit class ListViewScrollingEventOps[Self <: ListViewScrollingEvent] (val x: Self) extends AnyVal {
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetContentOffset(value: Double): Self = this.set("targetContentOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
  }
  
}

