package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageImg extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 会话内消息卡片图片路径
    */
  var sendMessageImg: js.UndefOr[String] = js.native
  /**
    * 会话内消息卡片路径
    */
  var sendMessagePath: js.UndefOr[String] = js.native
  /**
    * 会话内消息卡片标题
    */
  var sendMessageTitle: js.UndefOr[String] = js.native
  /**
    * 会话来源
    */
  var sessionFrom: js.UndefOr[String] = js.native
  /**
    * 是否显示会话内消息卡片，设置此参数为 true，用户进入客服会话之后会收到一个消息卡片，通过以下三个参数设置卡片的内容
    */
  var showMessageCard: js.UndefOr[Boolean] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object SendMessageImg {
  @scala.inline
  def apply(): SendMessageImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageImg]
  }
  @scala.inline
  implicit class SendMessageImgOps[Self <: SendMessageImg] (val x: Self) extends AnyVal {
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
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSendMessageImg(value: String): Self = this.set("sendMessageImg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendMessageImg: Self = this.set("sendMessageImg", js.undefined)
    @scala.inline
    def setSendMessagePath(value: String): Self = this.set("sendMessagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendMessagePath: Self = this.set("sendMessagePath", js.undefined)
    @scala.inline
    def setSendMessageTitle(value: String): Self = this.set("sendMessageTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendMessageTitle: Self = this.set("sendMessageTitle", js.undefined)
    @scala.inline
    def setSessionFrom(value: String): Self = this.set("sessionFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionFrom: Self = this.set("sessionFrom", js.undefined)
    @scala.inline
    def setShowMessageCard(value: Boolean): Self = this.set("showMessageCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMessageCard: Self = this.set("showMessageCard", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

