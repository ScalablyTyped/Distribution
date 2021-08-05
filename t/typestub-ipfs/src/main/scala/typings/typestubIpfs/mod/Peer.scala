package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Peer extends StObject {
  
  var addr: Multiaddr
  
  var peer: PeerInfo
}
object Peer {
  
  inline def apply(addr: Multiaddr, peer: PeerInfo): Peer = {
    val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Peer]
  }
  
  extension [Self <: Peer](x: Self) {
    
    inline def setAddr(value: Multiaddr): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: PeerInfo): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
  }
}
