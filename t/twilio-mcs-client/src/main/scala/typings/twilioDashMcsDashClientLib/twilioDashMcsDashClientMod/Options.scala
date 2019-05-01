package typings
package twilioDashMcsDashClientLib.twilioDashMcsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var transport: js.UndefOr[twilioDashTransportLib.twilioDashTransportMod.Transport] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    logLevel: LogLevel = null,
    region: java.lang.String = null,
    transport: twilioDashTransportLib.twilioDashTransportMod.Transport = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[Options]
  }
}

