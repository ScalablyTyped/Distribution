package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrMsgSupportMode extends js.Object {
   // 该设备支持的可被SOTER识别的生物识别方式
  var errMsg: java.lang.String
  var supportMode: js.Array[weixinDashAppLib.wxNs.AuthModes]
}

object Anon_ErrMsgSupportMode {
  @scala.inline
  def apply(errMsg: java.lang.String, supportMode: js.Array[weixinDashAppLib.wxNs.AuthModes]): Anon_ErrMsgSupportMode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errMsg")(errMsg)
    __obj.updateDynamic("supportMode")(supportMode)
    __obj.asInstanceOf[Anon_ErrMsgSupportMode]
  }
}

