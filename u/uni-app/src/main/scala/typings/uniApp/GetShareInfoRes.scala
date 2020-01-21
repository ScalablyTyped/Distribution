package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetShareInfoRes extends js.Object {
  /**
    * 包括敏感数据在内的完整转发信息的加密数据
    */
  var encryptedData: js.UndefOr[String] = js.undefined
  /**
    * 错误信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
  /**
    * 加密算法的初始向量
    */
  var iv: js.UndefOr[String] = js.undefined
}

object GetShareInfoRes {
  @scala.inline
  def apply(encryptedData: String = null, errMsg: String = null, iv: String = null): GetShareInfoRes = {
    val __obj = js.Dynamic.literal()
    if (encryptedData != null) __obj.updateDynamic("encryptedData")(encryptedData.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShareInfoRes]
  }
}

