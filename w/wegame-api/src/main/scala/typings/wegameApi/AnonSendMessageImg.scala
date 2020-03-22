package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSendMessageImg extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 会话内消息卡片图片路径
    */
  var sendMessageImg: js.UndefOr[String] = js.undefined
  /**
    * 会话内消息卡片路径
    */
  var sendMessagePath: js.UndefOr[String] = js.undefined
  /**
    * 会话内消息卡片标题
    */
  var sendMessageTitle: js.UndefOr[String] = js.undefined
  /**
    * 会话来源
    */
  var sessionFrom: js.UndefOr[String] = js.undefined
  /**
    * 是否显示会话内消息卡片，设置此参数为 true，用户进入客服会话之后会收到一个消息卡片，通过以下三个参数设置卡片的内容
    */
  var showMessageCard: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonSendMessageImg {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    sendMessageImg: String = null,
    sendMessagePath: String = null,
    sendMessageTitle: String = null,
    sessionFrom: String = null,
    showMessageCard: js.UndefOr[Boolean] = js.undefined,
    success: () => Unit = null
  ): AnonSendMessageImg = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (sendMessageImg != null) __obj.updateDynamic("sendMessageImg")(sendMessageImg.asInstanceOf[js.Any])
    if (sendMessagePath != null) __obj.updateDynamic("sendMessagePath")(sendMessagePath.asInstanceOf[js.Any])
    if (sendMessageTitle != null) __obj.updateDynamic("sendMessageTitle")(sendMessageTitle.asInstanceOf[js.Any])
    if (sessionFrom != null) __obj.updateDynamic("sessionFrom")(sessionFrom.asInstanceOf[js.Any])
    if (!js.isUndefined(showMessageCard)) __obj.updateDynamic("showMessageCard")(showMessageCard.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AnonSendMessageImg]
  }
}

