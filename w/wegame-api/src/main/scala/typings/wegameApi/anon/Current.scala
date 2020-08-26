package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Current extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 当前显示图片的链接，默认为urls的第一张
    */
  var current: js.UndefOr[String] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 需要预览的图片链接列表
    */
  var urls: js.Array[String] = js.native
}

object Current {
  @scala.inline
  def apply(urls: js.Array[String]): Current = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  @scala.inline
  implicit class CurrentOps[Self <: Current] (val x: Self) extends AnyVal {
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
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setCurrent(value: String): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

