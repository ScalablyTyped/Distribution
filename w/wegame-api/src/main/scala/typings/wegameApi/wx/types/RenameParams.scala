package typings.wegameApi.wx.types

import typings.wegameApi.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.native
  var newPath: String = js.native
  var oldPath: String = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object RenameParams {
  @scala.inline
  def apply(newPath: String, oldPath: String): RenameParams = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameParams]
  }
  @scala.inline
  implicit class RenameParamsOps[Self <: RenameParams] (val x: Self) extends AnyVal {
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
    def setNewPath(value: String): Self = this.set("newPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldPath(value: String): Self = this.set("oldPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ ErrMsg => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

