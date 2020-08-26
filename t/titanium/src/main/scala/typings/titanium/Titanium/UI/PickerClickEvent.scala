package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the device detects a click against the view.
  */
@js.native
trait PickerClickEvent extends PickerBaseEvent {
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double = js.native
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double = js.native
}

object PickerClickEvent {
  @scala.inline
  def apply(source: Picker, x: Double, y: Double): PickerClickEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerClickEvent]
  }
  @scala.inline
  implicit class PickerClickEventOps[Self <: PickerClickEvent] (val x: Self) extends AnyVal {
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

