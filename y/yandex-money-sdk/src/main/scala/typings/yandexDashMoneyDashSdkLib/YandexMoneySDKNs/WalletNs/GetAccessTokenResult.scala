package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccessTokenResult extends js.Object {
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
}

object GetAccessTokenResult {
  @scala.inline
  def apply(access_token: java.lang.String = null, error: java.lang.String = null): GetAccessTokenResult = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[GetAccessTokenResult]
  }
}

