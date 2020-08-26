package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a StreamSocketListener object. */
@js.native
trait StreamSocketListenerControl extends js.Object {
  /** A value that indicates whether keep-alive packets should be sent on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var keepAlive: Boolean = js.native
  /** A value that indicates whether the Nagle algorithm is used on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var noDelay: Boolean = js.native
  /** The size, in bytes, of the send buffer to be used for sending data on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var outboundBufferSizeInBytes: Double = js.native
  /** The hop limit on an outbound packet sent to a unicast IP address by the StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var outboundUnicastHopLimit: Double = js.native
  /** The quality of service to be set on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var qualityOfService: SocketQualityOfService = js.native
}

object StreamSocketListenerControl {
  @scala.inline
  def apply(
    keepAlive: Boolean,
    noDelay: Boolean,
    outboundBufferSizeInBytes: Double,
    outboundUnicastHopLimit: Double,
    qualityOfService: SocketQualityOfService
  ): StreamSocketListenerControl = {
    val __obj = js.Dynamic.literal(keepAlive = keepAlive.asInstanceOf[js.Any], noDelay = noDelay.asInstanceOf[js.Any], outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], outboundUnicastHopLimit = outboundUnicastHopLimit.asInstanceOf[js.Any], qualityOfService = qualityOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketListenerControl]
  }
  @scala.inline
  implicit class StreamSocketListenerControlOps[Self <: StreamSocketListenerControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoDelay(value: Boolean): Self = this.set("noDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutboundBufferSizeInBytes(value: Double): Self = this.set("outboundBufferSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutboundUnicastHopLimit(value: Double): Self = this.set("outboundUnicastHopLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setQualityOfService(value: SocketQualityOfService): Self = this.set("qualityOfService", value.asInstanceOf[js.Any])
  }
  
}

