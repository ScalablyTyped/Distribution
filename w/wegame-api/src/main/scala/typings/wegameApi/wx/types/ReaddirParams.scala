package typings.wegameApi.wx.types

import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaddirParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var dirPath: String = js.native
  var fail: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* res */ Files, Unit]] = js.native
}

object ReaddirParams {
  @scala.inline
  def apply(dirPath: String): ReaddirParams = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirParams]
  }
  @scala.inline
  implicit class ReaddirParamsOps[Self <: ReaddirParams] (val x: Self) extends AnyVal {
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
    def setDirPath(value: String): Self = this.set("dirPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ ErrMsg => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ Files => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

