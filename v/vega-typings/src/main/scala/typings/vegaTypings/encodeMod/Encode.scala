package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<vega-typings.vega-typings/types/spec/encode.EncodeEntryName, T>> */
@js.native
trait Encode[T] extends js.Object {
  var enter: js.UndefOr[T] = js.native
  var exit: js.UndefOr[T] = js.native
  var hover: js.UndefOr[T] = js.native
  var leave: js.UndefOr[T] = js.native
  var release: js.UndefOr[T] = js.native
  var select: js.UndefOr[T] = js.native
  var update: js.UndefOr[T] = js.native
}

object Encode {
  @scala.inline
  def apply[T](): Encode[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encode[T]]
  }
  @scala.inline
  implicit class EncodeOps[Self <: Encode[_], T] (val x: Self with Encode[T]) extends AnyVal {
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
    def setEnter(value: T): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setExit(value: T): Self = this.set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    @scala.inline
    def setHover(value: T): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setLeave(value: T): Self = this.set("leave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    @scala.inline
    def setRelease(value: T): Self = this.set("release", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    @scala.inline
    def setSelect(value: T): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setUpdate(value: T): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

