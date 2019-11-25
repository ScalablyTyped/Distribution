package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BandwidthStatistics extends js.Object {
  var inboundBandwidthPeaked: Boolean
  var inboundBitsPerSecond: Double
  var inboundBitsPerSecondInstability: Double
  var outboundBandwidthPeaked: Boolean
  var outboundBitsPerSecond: Double
  var outboundBitsPerSecondInstability: Double
}

object BandwidthStatistics {
  @scala.inline
  def apply(
    inboundBandwidthPeaked: Boolean,
    inboundBitsPerSecond: Double,
    inboundBitsPerSecondInstability: Double,
    outboundBandwidthPeaked: Boolean,
    outboundBitsPerSecond: Double,
    outboundBitsPerSecondInstability: Double
  ): BandwidthStatistics = {
    val __obj = js.Dynamic.literal(inboundBandwidthPeaked = inboundBandwidthPeaked.asInstanceOf[js.Any], inboundBitsPerSecond = inboundBitsPerSecond.asInstanceOf[js.Any], inboundBitsPerSecondInstability = inboundBitsPerSecondInstability.asInstanceOf[js.Any], outboundBandwidthPeaked = outboundBandwidthPeaked.asInstanceOf[js.Any], outboundBitsPerSecond = outboundBitsPerSecond.asInstanceOf[js.Any], outboundBitsPerSecondInstability = outboundBitsPerSecondInstability.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BandwidthStatistics]
  }
}

