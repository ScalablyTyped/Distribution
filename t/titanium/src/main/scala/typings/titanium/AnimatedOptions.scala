package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JavaScript object holding an `animated` property. Used for many UI methods as a means of specifying some transition should be animated.
  */
trait AnimatedOptions extends js.Object {
  /**
  	 * If `true`, animate a transition for the method/value change.
  	 * Note that for most uses cases the default is assumed to be `false`. The exceptions tend to be <Titanium.UI.Window> methods.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
}

object AnimatedOptions {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): AnimatedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedOptions]
  }
}

