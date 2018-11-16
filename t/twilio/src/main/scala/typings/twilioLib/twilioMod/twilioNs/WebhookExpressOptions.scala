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

