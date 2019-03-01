package typings
package swipeviewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeViewOptions extends js.Object {
  var hastyPageFlip: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var numberOfPages: js.UndefOr[scala.Double] = js.undefined
  var snapThreshold: js.UndefOr[scala.Double] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object SwipeViewOptions {
  @scala.inline
  def apply(
    hastyPageFlip: js.UndefOr[scala.Boolean] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    numberOfPages: scala.Int | scala.Double = null,
    snapThreshold: scala.Int | scala.Double = null,
    text: java.lang.String = null
  ): SwipeViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hastyPageFlip)) __obj.updateDynamic("hastyPageFlip")(hastyPageFlip)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (numberOfPages != null) __obj.updateDynamic("numberOfPages")(numberOfPages.asInstanceOf[js.Any])
    if (snapThreshold != null) __obj.updateDynamic("snapThreshold")(snapThreshold.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SwipeViewOptions]
  }
}

