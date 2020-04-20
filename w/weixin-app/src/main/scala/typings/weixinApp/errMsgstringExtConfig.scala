package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  errMsg  :string} & weixin-app.wx.ExtConfig */
trait errMsgstringExtConfig extends js.Object {
  /* 调用结果 */
  var errMsg: String
  /** 第三方平台自定义的数据 */
  var extConfig: js.Any
}

object errMsgstringExtConfig {
  @scala.inline
  def apply(errMsg: String, extConfig: js.Any): errMsgstringExtConfig = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[errMsgstringExtConfig]
  }
}

