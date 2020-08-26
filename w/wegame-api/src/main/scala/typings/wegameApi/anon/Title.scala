package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.loading
import typings.wegameApi.wegameApiStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Title extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 提示的延迟时间
    */
  var duration: js.UndefOr[Double] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 图标
    */
  var icon: js.UndefOr[success | loading] = js.native
  /**
    * 自定义图标的本地路径，image 的优先级高于 icon
    */
  var image: js.UndefOr[String] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 提示的内容
    */
  var title: js.UndefOr[String] = js.native
}

object Title {
  @scala.inline
  def apply(): Title = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Title]
  }
  @scala.inline
  implicit class TitleOps[Self <: Title] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setIcon(value: success | loading): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

