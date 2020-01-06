package typings.useDashResizeDashObserver.useDashResizeDashObserverMod

import typings.react.reactMod.RefObject
import typings.useDashResizeDashObserver.useDashResizeDashObserverBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsWithoutSize[TElement] extends _ObserverDefaults[TElement] {
  var ref: js.UndefOr[RefObject[TElement]] = js.undefined
  var useDefaults: js.UndefOr[`false`] = js.undefined
}

object DefaultsWithoutSize {
  @scala.inline
  def apply[TElement](ref: RefObject[TElement] = null, useDefaults: `false` = null): DefaultsWithoutSize[TElement] = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (useDefaults != null) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsWithoutSize[TElement]]
  }
}

