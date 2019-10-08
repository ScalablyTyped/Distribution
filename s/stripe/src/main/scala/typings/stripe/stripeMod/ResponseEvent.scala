package typings.stripe.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseEvent extends js.Object {
  var account: js.UndefOr[String] = js.undefined
  var api_version: String
  var elapsed: Double
  var idempotency_key: js.UndefOr[String] = js.undefined
  var method: String
  var path: String
  var request_end_time: Double
  var request_id: String
  var request_start_time: Double
  var status: Double
}

object ResponseEvent {
  @scala.inline
  def apply(
    api_version: String,
    elapsed: Double,
    method: String,
    path: String,
    request_end_time: Double,
    request_id: String,
    request_start_time: Double,
    status: Double,
    account: String = null,
    idempotency_key: String = null
  ): ResponseEvent = {
    val __obj = js.Dynamic.literal(api_version = api_version, elapsed = elapsed, method = method, path = path, request_end_time = request_end_time, request_id = request_id, request_start_time = request_start_time, status = status)
    if (account != null) __obj.updateDynamic("account")(account)
    if (idempotency_key != null) __obj.updateDynamic("idempotency_key")(idempotency_key)
    __obj.asInstanceOf[ResponseEvent]
  }
}

