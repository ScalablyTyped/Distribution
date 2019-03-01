package typings
package tcpDashPingLib.tcpDashPingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var attempts: js.UndefOr[scala.Double] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    attempts: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (attempts != null) __obj.updateDynamic("attempts")(attempts.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

