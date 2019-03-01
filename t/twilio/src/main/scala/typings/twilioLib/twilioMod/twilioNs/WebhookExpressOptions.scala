package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookExpressOptions extends js.Object {
  // manually specify the host name used by Twilio in a number's webhook config
  var host: js.UndefOr[java.lang.String] = js.undefined
  // manually specify the protocol used by Twilio in a number's webhook config
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  // The full URL (with query string) you used to configure the webhook with Twilio - overrides host/protocol options
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object WebhookExpressOptions {
  @scala.inline
  def apply(host: java.lang.String = null, protocol: java.lang.String = null, url: java.lang.String = null): WebhookExpressOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebhookExpressOptions]
  }
}

