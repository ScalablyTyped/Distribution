package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

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
    val __obj = js.Dynamic.literal(inboundBandwidthPeaked = inboundBandwidthPeaked, inboundBitsPerSecond = inboundBitsPerSecond, inboundBitsPerSecondInstability = inboundBitsPerSecondInstability, outboundBandwidthPeaked = outboundBandwidthPeaked, outboundBitsPerSecond = outboundBitsPerSecond, outboundBitsPerSecondInstability = outboundBitsPerSecondInstability)
  
    __obj.asInstanceOf[BandwidthStatistics]
  }
}

