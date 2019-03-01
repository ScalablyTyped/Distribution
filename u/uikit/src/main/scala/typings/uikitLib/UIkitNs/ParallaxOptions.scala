package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallaxOptions extends js.Object {
  /**
    * Condition for the active status with a width as integer (e.g. 640) or a css media query
    * @default false
    * <h2>Possible Value</h2>
    * integer / string
    */
  var media: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Element dimension reference for animation duration.
    * @default false
    */
  var target: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Animation velocity during scrolling
    * @default 0.5
    */
  var velocity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animation range depending on the viewport.
    * <h2>Possible value</h2>
    * float (0 to 1)
    * @default false
    */
  var viewport: js.UndefOr[scala.Double] = js.undefined
}

object ParallaxOptions {
  @scala.inline
  def apply(
    media: scala.Double | java.lang.String = null,
    target: js.UndefOr[scala.Boolean] = js.undefined,
    velocity: scala.Int | scala.Double = null,
    viewport: scala.Int | scala.Double = null
  ): ParallaxOptions = {
    val __obj = js.Dynamic.literal()
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target)
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallaxOptions]
  }
}

