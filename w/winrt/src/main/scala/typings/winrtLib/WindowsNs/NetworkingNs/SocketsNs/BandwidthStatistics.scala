package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BandwidthStatistics extends js.Object {
  var inboundBandwidthPeaked: scala.Boolean
  var inboundBitsPerSecond: scala.Double
  var inboundBitsPerSecondInstability: scala.Double
  var outboundBandwidthPeaked: scala.Boolean
  var outboundBitsPerSecond: scala.Double
  var outboundBitsPerSecondInstability: scala.Double
}

object BandwidthStatistics {
  @scala.inline
  def apply(
    inboundBandwidthPeaked: scala.Boolean,
    inboundBitsPerSecond: scala.Double,
    inboundBitsPerSecondInstability: scala.Double,
    outboundBandwidthPeaked: scala.Boolean,
    outboundBitsPerSecond: scala.Double,
    outboundBitsPerSecondInstability: scala.Double
  ): BandwidthStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inboundBandwidthPeaked")(inboundBandwidthPeaked)
    __obj.updateDynamic("inboundBitsPerSecond")(inboundBitsPerSecond)
    __obj.updateDynamic("inboundBitsPerSecondInstability")(inboundBitsPerSecondInstability)
    __obj.updateDynamic("outboundBandwidthPeaked")(outboundBandwidthPeaked)
    __obj.updateDynamic("outboundBitsPerSecond")(outboundBitsPerSecond)
    __obj.updateDynamic("outboundBitsPerSecondInstability")(outboundBitsPerSecondInstability)
    __obj.asInstanceOf[BandwidthStatistics]
  }
}

