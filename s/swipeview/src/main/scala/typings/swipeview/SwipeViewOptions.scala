package typings.swipeview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeViewOptions extends js.Object {
  var hastyPageFlip: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var numberOfPages: js.UndefOr[Double] = js.undefined
  var snapThreshold: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object SwipeViewOptions {
  @scala.inline
  def apply(
    hastyPageFlip: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    numberOfPages: js.UndefOr[Double] = js.undefined,
    snapThreshold: js.UndefOr[Double] = js.undefined,
    text: String = null
  ): SwipeViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hastyPageFlip)) __obj.updateDynamic("hastyPageFlip")(hastyPageFlip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfPages)) __obj.updateDynamic("numberOfPages")(numberOfPages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapThreshold)) __obj.updateDynamic("snapThreshold")(snapThreshold.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeViewOptions]
  }
}

