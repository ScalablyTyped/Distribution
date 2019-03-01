package typings
package viewabilityDashHelperLib.viewabilityDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var callbackParams: js.UndefOr[js.Array[_]] = js.undefined
  var intersectionPercentage: js.UndefOr[scala.Double] = js.undefined
  var rootMargin: js.UndefOr[java.lang.String] = js.undefined
  var scrollDimmer: js.UndefOr[scala.Double] = js.undefined
  var threshold: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var unobserve: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    callbackParams: js.Array[_] = null,
    intersectionPercentage: scala.Int | scala.Double = null,
    rootMargin: java.lang.String = null,
    scrollDimmer: scala.Int | scala.Double = null,
    threshold: js.Array[scala.Double] = null,
    unobserve: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (callbackParams != null) __obj.updateDynamic("callbackParams")(callbackParams)
    if (intersectionPercentage != null) __obj.updateDynamic("intersectionPercentage")(intersectionPercentage.asInstanceOf[js.Any])
    if (rootMargin != null) __obj.updateDynamic("rootMargin")(rootMargin)
    if (scrollDimmer != null) __obj.updateDynamic("scrollDimmer")(scrollDimmer.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold)
    if (!js.isUndefined(unobserve)) __obj.updateDynamic("unobserve")(unobserve)
    __obj.asInstanceOf[Options]
  }
}

