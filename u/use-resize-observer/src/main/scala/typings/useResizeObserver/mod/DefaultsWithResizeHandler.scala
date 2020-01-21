package typings.useResizeObserver.mod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsWithResizeHandler[TElement] extends ObserverDefaults[TElement] {
  var onResize: ResizeHandler
  var ref: js.UndefOr[RefObject[TElement]] = js.undefined
}

object DefaultsWithResizeHandler {
  @scala.inline
  def apply[TElement](onResize: /* newSize */ RefSize => Unit, ref: RefObject[TElement] = null): DefaultsWithResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsWithResizeHandler[TElement]]
  }
}

