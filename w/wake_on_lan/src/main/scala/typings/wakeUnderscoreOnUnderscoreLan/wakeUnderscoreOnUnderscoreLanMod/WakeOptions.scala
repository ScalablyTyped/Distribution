package typings.wakeUnderscoreOnUnderscoreLan.wakeUnderscoreOnUnderscoreLanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WakeOptions extends js.Object {
  /**
  		 * The ip address to which the packet is send  (default: 255.255.255.255)
  		 */
  var address: js.UndefOr[String] = js.undefined
  /**
  		 * The interval between packets (default: 100ms)
  		 */
  var interval: js.UndefOr[Double] = js.undefined
  /**
  		 * Number of packets to send (default: 3)
  		 */
  var num_packets: js.UndefOr[Double] = js.undefined
  /**
  		 * The port to send to (default: 9)
  		 */
  var port: js.UndefOr[Double] = js.undefined
}

object WakeOptions {
  @scala.inline
  def apply(
    address: String = null,
    interval: Int | Double = null,
    num_packets: Int | Double = null,
    port: Int | Double = null
  ): WakeOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (num_packets != null) __obj.updateDynamic("num_packets")(num_packets.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[WakeOptions]
  }
}

