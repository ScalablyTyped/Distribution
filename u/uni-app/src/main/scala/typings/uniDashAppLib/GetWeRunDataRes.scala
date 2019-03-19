package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWeRunDataRes extends js.Object {
  /**
    * 包括敏感数据在内的完整用户信息的加密数据
    */
  var encryptedData: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 加密算法的初始向量
    */
  var iv: js.UndefOr[java.lang.String] = js.undefined
}

object GetWeRunDataRes {
  @scala.inline
  def apply(
    encryptedData: java.lang.String = null,
    errMsg: java.lang.String = null,
    iv: java.lang.String = null
  ): GetWeRunDataRes = {
    val __obj = js.Dynamic.literal()
    if (encryptedData != null) __obj.updateDynamic("encryptedData")(encryptedData)
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    if (iv != null) __obj.updateDynamic("iv")(iv)
    __obj.asInstanceOf[GetWeRunDataRes]
  }
}

