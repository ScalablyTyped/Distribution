package typings.useResizeObserver.mod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserverResultForResizeHandler[TElement] extends js.Object {
  var ref: RefObject[TElement] = js.native
}

object ObserverResultForResizeHandler {
  @scala.inline
  def apply[TElement](ref: RefObject[TElement]): ObserverResultForResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverResultForResizeHandler[TElement]]
  }
  @scala.inline
  implicit class ObserverResultForResizeHandlerOps[Self <: ObserverResultForResizeHandler[_], TElement] (val x: Self with ObserverResultForResizeHandler[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRef(value: RefObject[TElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
  }
  
}

