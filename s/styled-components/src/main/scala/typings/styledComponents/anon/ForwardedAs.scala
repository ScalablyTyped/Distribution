package typings.styledComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardedAs[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] extends js.Object {
  var as: js.UndefOr[C] = js.native
  var forwardedAs: js.UndefOr[C] = js.native
}

object ForwardedAs {
  @scala.inline
  def apply[/* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 * / js.Any */ C](): ForwardedAs[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardedAs[C]]
  }
  @scala.inline
  implicit class ForwardedAsOps[Self <: ForwardedAs[_], /* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 * / js.Any */ C] (val x: Self with ForwardedAs[C]) extends AnyVal {
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
    def setAs(value: C): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setForwardedAs(value: C): Self = this.set("forwardedAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardedAs: Self = this.set("forwardedAs", js.undefined)
  }
  
}

