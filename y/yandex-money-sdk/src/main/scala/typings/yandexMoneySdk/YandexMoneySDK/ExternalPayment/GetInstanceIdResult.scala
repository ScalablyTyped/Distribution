package typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceIdResult extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var instance_id: js.UndefOr[String] = js.undefined
  var status: String
}

object GetInstanceIdResult {
  @scala.inline
  def apply(status: String, error: String = null, instance_id: String = null): GetInstanceIdResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (instance_id != null) __obj.updateDynamic("instance_id")(instance_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceIdResult]
  }
}

