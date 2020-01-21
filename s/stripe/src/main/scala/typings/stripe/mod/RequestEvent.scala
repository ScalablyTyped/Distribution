package typings.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestEvent extends js.Object {
  var account: js.UndefOr[String] = js.undefined
  var api_version: String
  var idempotency_key: js.UndefOr[String] = js.undefined
  var method: String
  var path: String
  var request_start_time: Double
}

object RequestEvent {
  @scala.inline
  def apply(
    api_version: String,
    method: String,
    path: String,
    request_start_time: Double,
    account: String = null,
    idempotency_key: String = null
  ): RequestEvent = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request_start_time = request_start_time.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (idempotency_key != null) __obj.updateDynamic("idempotency_key")(idempotency_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEvent]
  }
}

