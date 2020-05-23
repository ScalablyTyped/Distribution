package typings.useResizeObserver.mod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverResultWithSize[TElement] extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var ref: RefObject[TElement]
  var width: js.UndefOr[Double] = js.undefined
}

object ObserverResultWithSize {
  @scala.inline
  def apply[TElement](
    ref: RefObject[TElement],
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ObserverResultWithSize[TElement] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverResultWithSize[TElement]]
  }
}

