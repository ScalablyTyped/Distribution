package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageUrl extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function1[/* res */ ErrCode, Unit]] = js.native
  /**
    * 分享图片地址，详见 wx.shareMessageToFriend 同名参数（需要配置模板规则）
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * 分享图片 ID，详见 wx.shareMessageToFriend 同名参数（需要配置模板规则）
    */
  var imageUrlId: js.UndefOr[String] = js.native
  /**
    * 需要修改的数据的 key，目前可以为 '1' - '50'
    */
  var key: String = js.native
  /**
    * 需要修改的数值，目前只能为 1
    */
  var opNum: Double = js.native
  /**
    * 修改类型
    */
  var operation: add = js.native
  /**
    * 是否静默修改（不弹框），静默修改需要用户通过快捷分享消息卡片进入才有效，代表分享反馈操作，无需填写 toUser，直接修改分享者与被分享者交互数据
    * 默认值false
    */
  var quiet: js.UndefOr[Boolean] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 分享标题，如果设置了这个值，则在交互成功后自动询问用户是否分享给好友（需要配置模板规则）
    */
  var title: js.UndefOr[String] = js.native
  /**
    * 目标好友的 openId
    */
  var toUser: js.UndefOr[String] = js.native
}

object ImageUrl {
  @scala.inline
  def apply(key: String, opNum: Double, operation: add): ImageUrl = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], opNum = opNum.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl]
  }
  @scala.inline
  implicit class ImageUrlOps[Self <: ImageUrl] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpNum(value: Double): Self = this.set("opNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: add): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ ErrCode => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setImageUrlId(value: String): Self = this.set("imageUrlId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrlId: Self = this.set("imageUrlId", js.undefined)
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToUser(value: String): Self = this.set("toUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToUser: Self = this.set("toUser", js.undefined)
  }
  
}

