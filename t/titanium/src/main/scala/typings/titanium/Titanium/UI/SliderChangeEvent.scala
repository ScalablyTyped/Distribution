package typings.titanium.Titanium.UI

import typings.titanium.Point
import typings.titanium.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the value of the slider changes.
		 */
trait SliderChangeEvent extends SliderBaseEvent {
  /**
  			 * Dictionary with properties `x` and `y` of the thumb's left-top corner in
  			 * the control. Available with custom thumb image.
  			 */
  var thumbOffset: Point
  /**
  			 * Dictionary with properties `width` and `height` of the size of the thumb.
  			 * Available with custom thumb image.
  			 */
  var thumbSize: Size
  /**
  			 * New value of the slider.
  			 */
  var value: Double
}

object SliderChangeEvent {
  @scala.inline
  def apply(source: Slider, thumbOffset: Point, thumbSize: Size, value: Double): SliderChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], thumbOffset = thumbOffset.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderChangeEvent]
  }
}

