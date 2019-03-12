package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailSendMessageImg extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 会话内消息卡片图片路径
    */
  var sendMessageImg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 会话内消息卡片路径
    */
  var sendMessagePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 会话内消息卡片标题
    */
  var sendMessageTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 会话来源
    */
  var sessionFrom: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 是否显示会话内消息卡片，设置此参数为 true，用户进入客服会话之后会收到一个消息卡片，通过以下三个参数设置卡片的内容
    */
  var showMessageCard: js.UndefOr[scala.Boolean] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_CompleteFailSendMessageImg {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    sendMessageImg: java.lang.String = null,
    sendMessagePath: java.lang.String = null,
    sendMessageTitle: java.lang.String = null,
    sessionFrom: java.lang.String = null,
    showMessageCard: js.UndefOr[scala.Boolean] = js.undefined,
    success: () => scala.Unit = null
  ): Anon_CompleteFailSendMessageImg = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (sendMessageImg != null) __obj.updateDynamic("sendMessageImg")(sendMessageImg)
    if (sendMessagePath != null) __obj.updateDynamic("sendMessagePath")(sendMessagePath)
    if (sendMessageTitle != null) __obj.updateDynamic("sendMessageTitle")(sendMessageTitle)
    if (sessionFrom != null) __obj.updateDynamic("sessionFrom")(sessionFrom)
    if (!js.isUndefined(showMessageCard)) __obj.updateDynamic("showMessageCard")(showMessageCard)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[Anon_CompleteFailSendMessageImg]
  }
}

