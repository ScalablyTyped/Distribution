package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookOptions extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var includeHelpers: js.UndefOr[scala.Boolean] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var validate: js.UndefOr[scala.Boolean] = js.undefined
}

object WebhookOptions {
  @scala.inline
  def apply(
    host: java.lang.String = null,
    includeHelpers: js.UndefOr[scala.Boolean] = js.undefined,
    protocol: java.lang.String = null,
    validate: js.UndefOr[scala.Boolean] = js.undefined
  ): WebhookOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(includeHelpers)) __obj.updateDynamic("includeHelpers")(includeHelpers)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[WebhookOptions]
  }
}

