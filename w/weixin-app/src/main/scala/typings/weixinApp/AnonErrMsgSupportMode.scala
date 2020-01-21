package typings.weixinApp

import typings.weixinApp.wx.AuthModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrMsgSupportMode extends js.Object {
   // 该设备支持的可被SOTER识别的生物识别方式
  var errMsg: String
  var supportMode: js.Array[AuthModes]
}

object AnonErrMsgSupportMode {
  @scala.inline
  def apply(errMsg: String, supportMode: js.Array[AuthModes]): AnonErrMsgSupportMode = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], supportMode = supportMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrMsgSupportMode]
  }
}

