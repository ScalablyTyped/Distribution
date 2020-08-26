package typings.useResizeObserver.mod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserverResultWithSize[TElement] extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var ref: RefObject[TElement] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ObserverResultWithSize {
  @scala.inline
  def apply[TElement](ref: RefObject[TElement]): ObserverResultWithSize[TElement] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverResultWithSize[TElement]]
  }
  @scala.inline
  implicit class ObserverResultWithSizeOps[Self <: ObserverResultWithSize[_], TElement] (val x: Self with ObserverResultWithSize[TElement]) extends AnyVal {
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
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

