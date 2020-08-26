package typings.workerbApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIResponse extends js.Object {
  /**
    * A string that has the response returned by the remote server.
    */
  var response: String = js.native
  /**
    * A number that is the Status Code returned by the remote server.
    */
  var status: Double = js.native
}

object APIResponse {
  @scala.inline
  def apply(response: String, status: Double): APIResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponse]
  }
  @scala.inline
  implicit class APIResponseOps[Self <: APIResponse] (val x: Self) extends AnyVal {
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
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

