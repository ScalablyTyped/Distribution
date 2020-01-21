package typings.viewabilityHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var callbackParams: js.UndefOr[js.Array[_]] = js.undefined
  var intersectionPercentage: js.UndefOr[Double] = js.undefined
  var rootMargin: js.UndefOr[String] = js.undefined
  var scrollDimmer: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[js.Array[Double]] = js.undefined
  var unobserve: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    callbackParams: js.Array[_] = null,
    intersectionPercentage: Int | Double = null,
    rootMargin: String = null,
    scrollDimmer: Int | Double = null,
    threshold: js.Array[Double] = null,
    unobserve: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (callbackParams != null) __obj.updateDynamic("callbackParams")(callbackParams.asInstanceOf[js.Any])
    if (intersectionPercentage != null) __obj.updateDynamic("intersectionPercentage")(intersectionPercentage.asInstanceOf[js.Any])
    if (rootMargin != null) __obj.updateDynamic("rootMargin")(rootMargin.asInstanceOf[js.Any])
    if (scrollDimmer != null) __obj.updateDynamic("scrollDimmer")(scrollDimmer.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(unobserve)) __obj.updateDynamic("unobserve")(unobserve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

