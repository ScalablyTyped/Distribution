package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `registerCallback` operation. */
@js.native
trait RegisterCallbackParams extends js.Object {
  /** An HTTP or HTTPS URL to which callback notifications are to be sent. To be white-listed, the URL must successfully echo the challenge string during URL verification. During verification, the client can also check the signature that the service sends in the `X-Callback-Signature` header to verify the origin of the request. */
  var callback_url: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** A user-specified string that the service uses to generate the HMAC-SHA1 signature that it sends via the `X-Callback-Signature` header. The service includes the header during URL verification and with every notification sent to the callback URL. It calculates the signature over the payload of the notification. If you omit the parameter, the service does not send the header. */
  var user_secret: js.UndefOr[String] = js.native
}

object RegisterCallbackParams {
  @scala.inline
  def apply(callback_url: String): RegisterCallbackParams = {
    val __obj = js.Dynamic.literal(callback_url = callback_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCallbackParams]
  }
  @scala.inline
  implicit class RegisterCallbackParamsOps[Self <: RegisterCallbackParams] (val x: Self) extends AnyVal {
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
    def setCallback_url(value: String): Self = this.set("callback_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setUser_secret(value: String): Self = this.set("user_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_secret: Self = this.set("user_secret", js.undefined)
  }
  
}

