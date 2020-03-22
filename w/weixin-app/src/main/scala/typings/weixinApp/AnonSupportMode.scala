package typings.weixinApp

import typings.weixinApp.wx.AuthModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSupportMode extends js.Object {
   // 该设备支持的可被SOTER识别的生物识别方式
  var errMsg: String
  var supportMode: js.Array[AuthModes]
}

object AnonSupportMode {
  @scala.inline
  def apply(errMsg: String, supportMode: js.Array[AuthModes]): AnonSupportMode = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], supportMode = supportMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSupportMode]
  }
}

