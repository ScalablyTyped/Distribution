package typings.stripe.mod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebHookGenerateTestHeaderStringOptions extends js.Object {
  /**
    * JSON stringified payload object, containing the 'id' and 'object' parameters
    */
  var payload: js.UndefOr[String] = js.undefined
  /**
    * Version of API to hit. Defaults to 'v1'.
    */
  var scheme: js.UndefOr[String] = js.undefined
  /**
    * Stripe webhook secret 'whsec_...'
    */
  var secret: js.UndefOr[String] = js.undefined
  /**
    * Computed webhook signature
    */
  var signature: js.UndefOr[String] = js.undefined
  /**
    * Timestamp of the header. Defaults to Date.now()
    */
  var timestamp: js.UndefOr[Double] = js.undefined
}

object IWebHookGenerateTestHeaderStringOptions {
  @scala.inline
  def apply(
    payload: String = null,
    scheme: String = null,
    secret: String = null,
    signature: String = null,
    timestamp: Int | Double = null
  ): IWebHookGenerateTestHeaderStringOptions = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebHookGenerateTestHeaderStringOptions]
  }
}

