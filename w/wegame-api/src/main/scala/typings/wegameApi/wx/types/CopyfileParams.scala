package typings.wegameApi.wx.types

import typings.wegameApi.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var destPath: String = js.native
  var fail: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.native
  var srcPath: String = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object CopyfileParams {
  @scala.inline
  def apply(destPath: String, srcPath: String): CopyfileParams = {
    val __obj = js.Dynamic.literal(destPath = destPath.asInstanceOf[js.Any], srcPath = srcPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyfileParams]
  }
  @scala.inline
  implicit class CopyfileParamsOps[Self <: CopyfileParams] (val x: Self) extends AnyVal {
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
    def setDestPath(value: String): Self = this.set("destPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcPath(value: String): Self = this.set("srcPath", value.asInstanceOf[js.Any])
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

