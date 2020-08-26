package typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceIdResult extends js.Object {
  var error: js.UndefOr[String] = js.native
  var instance_id: js.UndefOr[String] = js.native
  var status: String = js.native
}

object GetInstanceIdResult {
  @scala.inline
  def apply(status: String): GetInstanceIdResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceIdResult]
  }
  @scala.inline
  implicit class GetInstanceIdResultOps[Self <: GetInstanceIdResult] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInstance_id(value: String): Self = this.set("instance_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance_id: Self = this.set("instance_id", js.undefined)
  }
  
}

