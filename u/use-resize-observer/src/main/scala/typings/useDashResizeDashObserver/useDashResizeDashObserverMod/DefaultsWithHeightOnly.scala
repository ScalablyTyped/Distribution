package typings.useDashResizeDashObserver.useDashResizeDashObserverMod

import typings.react.reactMod.RefObject
import typings.useDashResizeDashObserver.useDashResizeDashObserverBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsWithHeightOnly[TElement] extends _ObserverDefaults[TElement] {
  var defaultHeight: Double
  var ref: js.UndefOr[RefObject[TElement]] = js.undefined
  var useDefaults: js.UndefOr[`true`] = js.undefined
}

object DefaultsWithHeightOnly {
  @scala.inline
  def apply[TElement](defaultHeight: Double, ref: RefObject[TElement] = null, useDefaults: `true` = null): DefaultsWithHeightOnly[TElement] = {
    val __obj = js.Dynamic.literal(defaultHeight = defaultHeight.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (useDefaults != null) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsWithHeightOnly[TElement]]
  }
}

