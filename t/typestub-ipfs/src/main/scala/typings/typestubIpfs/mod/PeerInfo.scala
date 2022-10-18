package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerInfo extends StObject {
  
  def distinctMultiaddr(): js.Array[Multiaddr]
  
  var id: PeerId
  
  var multiaddr: Multiaddr
  
  var multiaddrs: js.Array[Multiaddr]
}
object PeerInfo {
  
  inline def apply(
    distinctMultiaddr: () => js.Array[Multiaddr],
    id: PeerId,
    multiaddr: Multiaddr,
    multiaddrs: js.Array[Multiaddr]
  ): PeerInfo = {
    val __obj = js.Dynamic.literal(distinctMultiaddr = js.Any.fromFunction0(distinctMultiaddr), id = id.asInstanceOf[js.Any], multiaddr = multiaddr.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerInfo]
  }
  
  extension [Self <: PeerInfo](x: Self) {
    
    inline def setDistinctMultiaddr(value: () => js.Array[Multiaddr]): Self = StObject.set(x, "distinctMultiaddr", js.Any.fromFunction0(value))
    
    inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMultiaddr(value: Multiaddr): Self = StObject.set(x, "multiaddr", value.asInstanceOf[js.Any])
    
    inline def setMultiaddrs(value: js.Array[Multiaddr]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
    
    inline def setMultiaddrsVarargs(value: Multiaddr*): Self = StObject.set(x, "multiaddrs", js.Array(value*))
  }
}
