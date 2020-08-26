package typings.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseEvent extends js.Object {
  var account: js.UndefOr[String] = js.native
  var api_version: String = js.native
  var elapsed: Double = js.native
  var idempotency_key: js.UndefOr[String] = js.native
  var method: String = js.native
  var path: String = js.native
  var request_end_time: Double = js.native
  var request_id: String = js.native
  var request_start_time: Double = js.native
  var status: Double = js.native
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
    status: Double
  ): ResponseEvent = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request_end_time = request_end_time.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], request_start_time = request_start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseEvent]
  }
  @scala.inline
  implicit class ResponseEventOps[Self <: ResponseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApi_version(value: String): Self = this.set("api_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setElapsed(value: Double): Self = this.set("elapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest_end_time(value: Double): Self = this.set("request_end_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest_id(value: String): Self = this.set("request_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest_start_time(value: Double): Self = this.set("request_start_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    @scala.inline
    def setIdempotency_key(value: String): Self = this.set("idempotency_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdempotency_key: Self = this.set("idempotency_key", js.undefined)
  }
  
}

