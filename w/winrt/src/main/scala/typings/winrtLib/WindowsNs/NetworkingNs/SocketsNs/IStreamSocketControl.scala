package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamSocketControl extends js.Object {
  var keepAlive: scala.Boolean
  var noDelay: scala.Boolean
  var outboundBufferSizeInBytes: scala.Double
  var outboundUnicastHopLimit: scala.Double
  var qualityOfService: SocketQualityOfService
}

object IStreamSocketControl {
  @scala.inline
  def apply(
    keepAlive: scala.Boolean,
    noDelay: scala.Boolean,
    outboundBufferSizeInBytes: scala.Double,
    outboundUnicastHopLimit: scala.Double,
    qualityOfService: SocketQualityOfService
  ): IStreamSocketControl = {
    val __obj = js.Dynamic.literal(keepAlive = keepAlive, noDelay = noDelay, outboundBufferSizeInBytes = outboundBufferSizeInBytes, outboundUnicastHopLimit = outboundUnicastHopLimit, qualityOfService = qualityOfService)
  
    __obj.asInstanceOf[IStreamSocketControl]
  }
}

