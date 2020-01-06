package typings.useDashResizeDashObserver.useDashResizeDashObserverMod

import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverResultWithDefaultWidthOnly[TElement] extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var ref: RefObject[TElement]
  var width: Double
}

object ObserverResultWithDefaultWidthOnly {
  @scala.inline
  def apply[TElement](ref: RefObject[TElement], width: Double, height: Int | Double = null): ObserverResultWithDefaultWidthOnly[TElement] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverResultWithDefaultWidthOnly[TElement]]
  }
}

