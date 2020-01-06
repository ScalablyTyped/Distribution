package typings.useDashResizeDashObserver.useDashResizeDashObserverMod

import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverResultWithoutDefaultSize[TElement] extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var ref: RefObject[TElement]
  var width: js.UndefOr[Double] = js.undefined
}

object ObserverResultWithoutDefaultSize {
  @scala.inline
  def apply[TElement](ref: RefObject[TElement], height: Int | Double = null, width: Int | Double = null): ObserverResultWithoutDefaultSize[TElement] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverResultWithoutDefaultSize[TElement]]
  }
}

