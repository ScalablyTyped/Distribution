package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connected extends js.Object {
  /**
    * 连接目前的状态
    */
  var connected: Boolean
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String
}

object Connected {
  @scala.inline
  def apply(connected: Boolean, deviceId: String): Connected = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connected]
  }
}

