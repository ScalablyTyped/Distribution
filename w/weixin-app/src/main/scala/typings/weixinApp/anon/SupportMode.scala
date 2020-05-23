package typings.weixinApp.anon

import typings.weixinApp.wx.AuthModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportMode extends js.Object {
   // 该设备支持的可被SOTER识别的生物识别方式
  var errMsg: String
  var supportMode: js.Array[AuthModes]
}

object SupportMode {
  @scala.inline
  def apply(errMsg: String, supportMode: js.Array[AuthModes]): SupportMode = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportMode]
  }
}

