package typings.twilioMcsClient.mod

import typings.twilioMcsClient.transportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var transport: js.UndefOr[Transport] = js.undefined
}

object Options {
  @scala.inline
  def apply(logLevel: LogLevel = null, region: String = null, transport: Transport = null): Options = {
    val __obj = js.Dynamic.literal()
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

