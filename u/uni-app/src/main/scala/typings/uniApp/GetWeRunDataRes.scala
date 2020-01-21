package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWeRunDataRes extends js.Object {
  /**
    * 包括敏感数据在内的完整用户信息的加密数据
    */
  var encryptedData: js.UndefOr[String] = js.undefined
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  /**
    * 加密算法的初始向量
    */
  var iv: js.UndefOr[String] = js.undefined
}

object GetWeRunDataRes {
  @scala.inline
  def apply(encryptedData: String = null, errMsg: String = null, iv: String = null): GetWeRunDataRes = {
    val __obj = js.Dynamic.literal()
    if (encryptedData != null) __obj.updateDynamic("encryptedData")(encryptedData.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWeRunDataRes]
  }
}

