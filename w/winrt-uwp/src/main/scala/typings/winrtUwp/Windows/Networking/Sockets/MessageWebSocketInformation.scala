package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides socket information on a MessageWebSocket . */
trait MessageWebSocketInformation extends StObject {
  
  /** Gets bandwidth information for network data transfer on a MessageWebSocket object. */
  var bandwidthStatistics: BandwidthStatistics
  
  /** Gets the IP address associated with a MessageWebSocket object. */
  var localAddress: HostName
  
  /** Gets the WebSocket sub-protocol negotiated with the server during WebSocket handshake on a MessageWebSocket object. */
  var protocol: String
}
object MessageWebSocketInformation {
  
  inline def apply(bandwidthStatistics: BandwidthStatistics, localAddress: HostName, protocol: String): MessageWebSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageWebSocketInformation]
  }
  
  extension [Self <: MessageWebSocketInformation](x: Self) {
    
    inline def setBandwidthStatistics(value: BandwidthStatistics): Self = StObject.set(x, "bandwidthStatistics", value.asInstanceOf[js.Any])
    
    inline def setLocalAddress(value: HostName): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
