package typings.ttiPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFirstConsistentlyInteractiveOpts extends js.Object {
  /**
    * The lower bound to start forward-searching for the quite window. If no value is set, the default is after the
    * DOMContentLoaded event.
    */
  var minValue: js.UndefOr[Double | Null] = js.undefined
  /**
    * When true (the default), a mutation observer is used to detect when added
    * DOM elements will create additional network requests. This can be
    * disabled to improve performance in cases where you know no additional
    * request-creating DOM elements will be added.
    */
  var useMutationObserver: js.UndefOr[Boolean] = js.undefined
}

object GetFirstConsistentlyInteractiveOpts {
  @scala.inline
  def apply(minValue: Int | Double = null, useMutationObserver: js.UndefOr[Boolean] = js.undefined): GetFirstConsistentlyInteractiveOpts = {
    val __obj = js.Dynamic.literal()
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (!js.isUndefined(useMutationObserver)) __obj.updateDynamic("useMutationObserver")(useMutationObserver.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFirstConsistentlyInteractiveOpts]
  }
}

