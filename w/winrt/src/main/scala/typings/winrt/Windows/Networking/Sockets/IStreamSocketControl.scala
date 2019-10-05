package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamSocketControl extends js.Object {
  var keepAlive: Boolean
  var noDelay: Boolean
  var outboundBufferSizeInBytes: Double
  var outboundUnicastHopLimit: Double
  var qualityOfService: SocketQualityOfService
}

object IStreamSocketControl {
  @scala.inline
  def apply(
    keepAlive: Boolean,
    noDelay: Boolean,
    outboundBufferSizeInBytes: Double,
    outboundUnicastHopLimit: Double,
    qualityOfService: SocketQualityOfService
  ): IStreamSocketControl = {
    val __obj = js.Dynamic.literal(keepAlive = keepAlive, noDelay = noDelay, outboundBufferSizeInBytes = outboundBufferSizeInBytes, outboundUnicastHopLimit = outboundUnicastHopLimit, qualityOfService = qualityOfService)
  
    __obj.asInstanceOf[IStreamSocketControl]
  }
}

