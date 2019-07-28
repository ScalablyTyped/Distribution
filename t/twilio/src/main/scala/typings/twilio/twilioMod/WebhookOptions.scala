package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookOptions extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var includeHelpers: js.UndefOr[Boolean] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[Boolean] = js.undefined
}

object WebhookOptions {
  @scala.inline
  def apply(
    host: String = null,
    includeHelpers: js.UndefOr[Boolean] = js.undefined,
    protocol: String = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): WebhookOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(includeHelpers)) __obj.updateDynamic("includeHelpers")(includeHelpers)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[WebhookOptions]
  }
}

