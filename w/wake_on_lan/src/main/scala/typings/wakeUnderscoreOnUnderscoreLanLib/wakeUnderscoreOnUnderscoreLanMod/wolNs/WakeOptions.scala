package typings
package wakeUnderscoreOnUnderscoreLanLib.wakeUnderscoreOnUnderscoreLanMod.wolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WakeOptions extends js.Object {
  /**
  		 * The ip address to which the packet is send  (default: 255.255.255.255)
  		 */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The interval between packets (default: 100ms)
  		 */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Number of packets to send (default: 3)
  		 */
  var num_packets: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * The port to send to (default: 9)
  		 */
  var port: js.UndefOr[scala.Double] = js.undefined
}

object WakeOptions {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    interval: scala.Int | scala.Double = null,
    num_packets: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null
  ): WakeOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (num_packets != null) __obj.updateDynamic("num_packets")(num_packets.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[WakeOptions]
  }
}

