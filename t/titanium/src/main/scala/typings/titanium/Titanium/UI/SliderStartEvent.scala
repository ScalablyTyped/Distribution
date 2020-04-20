package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the user starts tracking the slider.
		 */
trait SliderStartEvent extends SliderBaseEvent {
  /**
  			 * False. This event does not bubble.
  			 */
  var bubbles: Boolean
  /**
  			 * Current value of the slider.
  			 */
  var value: Double
}

object SliderStartEvent {
  @scala.inline
  def apply(bubbles: Boolean, source: Slider, value: Double): SliderStartEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderStartEvent]
  }
}

