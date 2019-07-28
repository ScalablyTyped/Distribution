package typings.weixinDashApp

import typings.weixinDashApp.wxNs.AuthModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrMsgSupportMode extends js.Object {
   // 该设备支持的可被SOTER识别的生物识别方式
  var errMsg: String
  var supportMode: js.Array[AuthModes]
}

object Anon_ErrMsgSupportMode {
  @scala.inline
  def apply(errMsg: String, supportMode: js.Array[AuthModes]): Anon_ErrMsgSupportMode = {
    val __obj = js.Dynamic.literal(errMsg = errMsg, supportMode = supportMode)
  
    __obj.asInstanceOf[Anon_ErrMsgSupportMode]
  }
}

