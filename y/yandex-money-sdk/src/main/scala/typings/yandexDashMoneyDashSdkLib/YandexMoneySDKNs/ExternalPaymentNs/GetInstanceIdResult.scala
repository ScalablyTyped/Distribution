package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceIdResult extends js.Object {
  var error: js.UndefOr[java.lang.String] = js.undefined
  var instance_id: js.UndefOr[java.lang.String] = js.undefined
  var status: java.lang.String
}

object GetInstanceIdResult {
  @scala.inline
  def apply(status: java.lang.String, error: java.lang.String = null, instance_id: java.lang.String = null): GetInstanceIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    if (error != null) __obj.updateDynamic("error")(error)
    if (instance_id != null) __obj.updateDynamic("instance_id")(instance_id)
    __obj.asInstanceOf[GetInstanceIdResult]
  }
}

