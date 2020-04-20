package typings.useResizeObserver.mod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverResultForResizeHandler[TElement] extends js.Object {
  var ref: RefObject[TElement]
}

object ObserverResultForResizeHandler {
  @scala.inline
  def apply[TElement](ref: RefObject[TElement]): ObserverResultForResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverResultForResizeHandler[TElement]]
  }
}

