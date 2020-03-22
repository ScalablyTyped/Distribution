package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wegame-api.wx.types.CallbacksWithType<{  openIdList  :std.ReadonlyArray<string>,   errCode  :number,   errMsg  :string}> & {  signature  :string,   nonceStr  :string,   timeStamp  :number,   groupId  :string,   muteConfig ? :{  muteMicrophone ? :boolean,   muteEarphone ? :boolean}} */
trait CallbacksWithTypeopenIdLi extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 小游戏内此房间/群聊的 ID。同一时刻传入相同 groupId 的用户会进入到同个实时语音房间。
    */
  var groupId: String
  /**
    * 静音设置
    */
  var muteConfig: js.UndefOr[AnonMuteEarphone] = js.undefined
  /**
    * 验证所需的随机字符串
    */
  var nonceStr: String
  /**
    * 签名，用于验证小游戏的身份
    */
  var signature: String
  var success: js.UndefOr[js.Function1[/* res */ AnonOpenIdList, Unit]] = js.undefined
  /**
    * 验证所需的时间戳
    */
  var timeStamp: Double
}

object CallbacksWithTypeopenIdLi {
  @scala.inline
  def apply(
    groupId: String,
    nonceStr: String,
    signature: String,
    timeStamp: Double,
    complete: () => Unit = null,
    fail: () => Unit = null,
    muteConfig: AnonMuteEarphone = null,
    success: /* res */ AnonOpenIdList => Unit = null
  ): CallbacksWithTypeopenIdLi = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (muteConfig != null) __obj.updateDynamic("muteConfig")(muteConfig.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CallbacksWithTypeopenIdLi]
  }
}

