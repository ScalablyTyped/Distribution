package typings.useDashResizeDashObserver.useDashResizeDashObserverMod

import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverResultWithDefaultHeightOnly[TElement] extends js.Object {
  var height: Double
  var ref: RefObject[TElement]
  var width: js.UndefOr[Double] = js.undefined
}

object ObserverResultWithDefaultHeightOnly {
  @scala.inline
  def apply[TElement](height: Double, ref: RefObject[TElement], width: Int | Double = null): ObserverResultWithDefaultHeightOnly[TElement] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverResultWithDefaultHeightOnly[TElement]]
  }
}

