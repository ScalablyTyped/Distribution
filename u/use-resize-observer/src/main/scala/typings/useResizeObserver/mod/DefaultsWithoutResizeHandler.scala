package typings.useResizeObserver.mod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsWithoutResizeHandler[TElement] extends ObserverDefaults[TElement] {
  var ref: js.UndefOr[RefObject[TElement]] = js.undefined
}

object DefaultsWithoutResizeHandler {
  @scala.inline
  def apply[TElement](ref: RefObject[TElement] = null): DefaultsWithoutResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsWithoutResizeHandler[TElement]]
  }
}

