package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginRes extends js.Object {
  /**
    * 登录服务商提供的登录信息，服务商不同返回的结果不完全相同
    */
  var authResult: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 描述信息
    */
  var errMsg: js.UndefOr[java.lang.String] = js.undefined
}

object LoginRes {
  @scala.inline
  def apply(authResult: java.lang.String = null, errMsg: java.lang.String = null): LoginRes = {
    val __obj = js.Dynamic.literal()
    if (authResult != null) __obj.updateDynamic("authResult")(authResult)
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    __obj.asInstanceOf[LoginRes]
  }
}

