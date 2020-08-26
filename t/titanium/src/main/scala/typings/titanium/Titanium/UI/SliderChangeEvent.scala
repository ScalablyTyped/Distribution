package typings.titanium.Titanium.UI

import typings.titanium.Point
import typings.titanium.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the value of the slider changes.
  */
@js.native
trait SliderChangeEvent extends SliderBaseEvent {
  /**
    * Dictionary with properties `x` and `y` of the thumb's left-top corner in
    * the control. Available with custom thumb image.
    */
  var thumbOffset: Point = js.native
  /**
    * Dictionary with properties `width` and `height` of the size of the thumb.
    * Available with custom thumb image.
    */
  var thumbSize: Size = js.native
  /**
    * New value of the slider.
    */
  var value: Double = js.native
}

object SliderChangeEvent {
  @scala.inline
  def apply(source: Slider, thumbOffset: Point, thumbSize: Size, value: Double): SliderChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], thumbOffset = thumbOffset.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderChangeEvent]
  }
  @scala.inline
  implicit class SliderChangeEventOps[Self <: SliderChangeEvent] (val x: Self) extends AnyVal {
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
    def setThumbOffset(value: Point): Self = this.set("thumbOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbSize(value: Size): Self = this.set("thumbSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

