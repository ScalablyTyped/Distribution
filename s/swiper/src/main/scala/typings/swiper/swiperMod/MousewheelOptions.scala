package typings.swiper.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MousewheelOptions extends js.Object {
  var eventsTarged: js.UndefOr[SelectableElement] = js.undefined
  var forceToAxis: js.UndefOr[Boolean] = js.undefined
  var invert: js.UndefOr[Boolean] = js.undefined
  var releaseOnEdges: js.UndefOr[Boolean] = js.undefined
  var sensitivity: js.UndefOr[Double] = js.undefined
}

object MousewheelOptions {
  @scala.inline
  def apply(
    eventsTarged: SelectableElement = null,
    forceToAxis: js.UndefOr[Boolean] = js.undefined,
    invert: js.UndefOr[Boolean] = js.undefined,
    releaseOnEdges: js.UndefOr[Boolean] = js.undefined,
    sensitivity: Int | Double = null
  ): MousewheelOptions = {
    val __obj = js.Dynamic.literal()
    if (eventsTarged != null) __obj.updateDynamic("eventsTarged")(eventsTarged.asInstanceOf[js.Any])
    if (!js.isUndefined(forceToAxis)) __obj.updateDynamic("forceToAxis")(forceToAxis)
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert)
    if (!js.isUndefined(releaseOnEdges)) __obj.updateDynamic("releaseOnEdges")(releaseOnEdges)
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MousewheelOptions]
  }
}

