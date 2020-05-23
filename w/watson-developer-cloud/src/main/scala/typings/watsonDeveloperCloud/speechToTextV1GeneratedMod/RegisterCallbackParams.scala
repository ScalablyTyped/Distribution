package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `registerCallback` operation. */
trait RegisterCallbackParams extends js.Object {
  /** An HTTP or HTTPS URL to which callback notifications are to be sent. To be white-listed, the URL must successfully echo the challenge string during URL verification. During verification, the client can also check the signature that the service sends in the `X-Callback-Signature` header to verify the origin of the request. */
  var callback_url: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** A user-specified string that the service uses to generate the HMAC-SHA1 signature that it sends via the `X-Callback-Signature` header. The service includes the header during URL verification and with every notification sent to the callback URL. It calculates the signature over the payload of the notification. If you omit the parameter, the service does not send the header. */
  var user_secret: js.UndefOr[String] = js.undefined
}

object RegisterCallbackParams {
  @scala.inline
  def apply(
    callback_url: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    user_secret: String = null
  ): RegisterCallbackParams = {
    val __obj = js.Dynamic.literal(callback_url = callback_url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    if (user_secret != null) __obj.updateDynamic("user_secret")(user_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCallbackParams]
  }
}

