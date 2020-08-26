package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** RegisterStatus. */
@js.native
trait RegisterStatus extends js.Object {
  /** The current status of the job: * `created`: The service successfully white-listed the callback URL as a result of the call. * `already created`: The URL was already white-listed. */
  var status: String = js.native
  /** The callback URL that is successfully registered. */
  var url: String = js.native
}

object RegisterStatus {
  @scala.inline
  def apply(status: String, url: String): RegisterStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterStatus]
  }
  @scala.inline
  implicit class RegisterStatusOps[Self <: RegisterStatus] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

