package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JavaScript object holding `animated` and `duration` properties. Used on iOS For [TablewView](Titanium.UI.TableView) and [ListView](Titanium.UI.ListView) content offset transitions.
  */
trait AnimatedWithDurationOptions extends AnimatedOptions {
  /**
    * The duration in `milliseconds` for animation
    */
  var duration: js.UndefOr[Double] = js.undefined
}

object AnimatedWithDurationOptions {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined, duration: js.UndefOr[Double] = js.undefined): AnimatedWithDurationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedWithDurationOptions]
  }
}

