package typings.twilio.mod

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
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(includeHelpers)) __obj.updateDynamic("includeHelpers")(includeHelpers.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookOptions]
  }
}

