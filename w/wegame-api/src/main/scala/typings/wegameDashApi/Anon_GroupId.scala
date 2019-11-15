package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupId extends js.Object {
  /**
    * 小游戏内此房间/群聊的 ID。同一时刻传入相同 groupId 的用户会进入到同个实时语音房间。
    */
  var groupId: String
  /**
    * 静音设置
    */
  var muteConfig: js.UndefOr[Anon_MuteEarphone] = js.undefined
  /**
    * 验证所需的随机字符串
    */
  var nonceStr: String
  /**
    * 签名，用于验证小游戏的身份
    */
  var signature: String
  /**
    * 验证所需的时间戳
    */
  var timeStamp: Double
}

object Anon_GroupId {
  @scala.inline
  def apply(
    groupId: String,
    nonceStr: String,
    signature: String,
    timeStamp: Double,
    muteConfig: Anon_MuteEarphone = null
  ): Anon_GroupId = {
    val __obj = js.Dynamic.literal(groupId = groupId, nonceStr = nonceStr, signature = signature, timeStamp = timeStamp)
    if (muteConfig != null) __obj.updateDynamic("muteConfig")(muteConfig)
    __obj.asInstanceOf[Anon_GroupId]
  }
}

