package typings.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides socket control data on a StreamSocketListener object. */
trait StreamSocketListenerControl extends StObject {
  
  /** A value that indicates whether keep-alive packets should be sent on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var keepAlive: Boolean
  
  /** A value that indicates whether the Nagle algorithm is used on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var noDelay: Boolean
  
  /** The size, in bytes, of the send buffer to be used for sending data on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var outboundBufferSizeInBytes: Double
  
  /** The hop limit on an outbound packet sent to a unicast IP address by the StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var outboundUnicastHopLimit: Double
  
  /** The quality of service to be set on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var qualityOfService: SocketQualityOfService
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
  implicit class StreamSocketListenerControlMutableBuilder[Self <: StreamSocketListenerControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundBufferSizeInBytes(value: Double): Self = StObject.set(x, "outboundBufferSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundUnicastHopLimit(value: Double): Self = StObject.set(x, "outboundUnicastHopLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityOfService(value: SocketQualityOfService): Self = StObject.set(x, "qualityOfService", value.asInstanceOf[js.Any])
  }
}
