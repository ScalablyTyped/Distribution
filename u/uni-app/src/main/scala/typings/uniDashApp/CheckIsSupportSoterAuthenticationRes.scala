package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIsSupportSoterAuthenticationRes extends js.Object {
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var supportMode: js.UndefOr[js.Array[_]] = js.undefined
}

object CheckIsSupportSoterAuthenticationRes {
  @scala.inline
  def apply(errMsg: String = null, supportMode: js.Array[_] = null): CheckIsSupportSoterAuthenticationRes = {
    val __obj = js.Dynamic.literal()
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    if (supportMode != null) __obj.updateDynamic("supportMode")(supportMode)
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationRes]
  }
}

