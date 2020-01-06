package typings.useDashResizeDashObserver.useDashResizeDashObserverMod

import typings.react.reactMod.RefObject
import typings.useDashResizeDashObserver.useDashResizeDashObserverBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsWithWidthOnly[TElement] extends _ObserverDefaults[TElement] {
  var defaultWidth: Double
  var ref: js.UndefOr[RefObject[TElement]] = js.undefined
  var useDefaults: js.UndefOr[`true`] = js.undefined
}

object DefaultsWithWidthOnly {
  @scala.inline
  def apply[TElement](defaultWidth: Double, ref: RefObject[TElement] = null, useDefaults: `true` = null): DefaultsWithWidthOnly[TElement] = {
    val __obj = js.Dynamic.literal(defaultWidth = defaultWidth.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (useDefaults != null) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsWithWidthOnly[TElement]]
  }
}

