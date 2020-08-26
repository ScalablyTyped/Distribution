package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the device detects a swipe gesture against the view.
  */
@js.native
trait ToolbarSwipeEvent extends ToolbarBaseEvent {
  /**
    * Direction of the swipe--either 'left', 'right', 'up', or 'down'.
    */
  var direction: String = js.native
  /**
    * X coordinate of the event's endpoint from the `source` view's coordinate system.
    */
  var x: Double = js.native
  /**
    * Y coordinate of the event's endpoint from the `source` view's coordinate system.
    */
  var y: Double = js.native
}

object ToolbarSwipeEvent {
  @scala.inline
  def apply(direction: String, source: Toolbar, x: Double, y: Double): ToolbarSwipeEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarSwipeEvent]
  }
  @scala.inline
  implicit class ToolbarSwipeEventOps[Self <: ToolbarSwipeEvent] (val x: Self) extends AnyVal {
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

