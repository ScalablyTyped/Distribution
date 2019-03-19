package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HCEMessageRes extends js.Object {
  /**
    * 客户端接收到 NFC 设备的指令
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 消息类型
    */
  var messageType: js.UndefOr[scala.Double] = js.undefined
  /**
    * 此参数当且仅当 messageType=2 时有效
    */
  var reason: js.UndefOr[scala.Double] = js.undefined
}

object HCEMessageRes {
  @scala.inline
  def apply(
    data: js.Array[_] = null,
    messageType: scala.Int | scala.Double = null,
    reason: scala.Int | scala.Double = null
  ): HCEMessageRes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[HCEMessageRes]
  }
}

