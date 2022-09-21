package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WifiDirectStatus extends StObject {
  
  /**
    * A list of objects that provides information about connected peers.
    */
  var connectedPeers: js.UndefOr[js.Array[WifiPeerInfo]] = js.undefined
  
  /**
    * The IP address of the local connection endpoint.
    */
  var localIp: js.UndefOr[String] = js.undefined
  
  /**
    * If the Wi-Fi connection is available it will be set to 'connected'.
    * If the Wi-Fi connection is not available, it will be set to 'disconnected'.
    */
  var state: ConnectionState
}
object WifiDirectStatus {
  
  inline def apply(state: ConnectionState): WifiDirectStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiDirectStatus]
  }
  
  extension [Self <: WifiDirectStatus](x: Self) {
    
    inline def setConnectedPeers(value: js.Array[WifiPeerInfo]): Self = StObject.set(x, "connectedPeers", value.asInstanceOf[js.Any])
    
    inline def setConnectedPeersUndefined: Self = StObject.set(x, "connectedPeers", js.undefined)
    
    inline def setConnectedPeersVarargs(value: WifiPeerInfo*): Self = StObject.set(x, "connectedPeers", js.Array(value*))
    
    inline def setLocalIp(value: String): Self = StObject.set(x, "localIp", value.asInstanceOf[js.Any])
    
    inline def setLocalIpUndefined: Self = StObject.set(x, "localIp", js.undefined)
    
    inline def setState(value: ConnectionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
