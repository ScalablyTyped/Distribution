package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Types extends StObject {
  
  var Buffer: js.Any
  
  var CID: typings.typestubIpfs.mod.CID
  
  var PeerId: String | js.Any
  
  var PeerInfo: js.Any
  
  var multiaddr: Multiaddr
  
  var multihash: Multihash
}
object Types {
  
  @scala.inline
  def apply(
    Buffer: js.Any,
    CID: CID,
    PeerId: String | js.Any,
    PeerInfo: js.Any,
    multiaddr: Multiaddr,
    multihash: Multihash
  ): Types = {
    val __obj = js.Dynamic.literal(Buffer = Buffer.asInstanceOf[js.Any], CID = CID.asInstanceOf[js.Any], PeerId = PeerId.asInstanceOf[js.Any], PeerInfo = PeerInfo.asInstanceOf[js.Any], multiaddr = multiaddr.asInstanceOf[js.Any], multihash = multihash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  
  @scala.inline
  implicit class TypesMutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: js.Any): Self = StObject.set(x, "Buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCID(value: CID): Self = StObject.set(x, "CID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiaddr(value: Multiaddr): Self = StObject.set(x, "multiaddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultihash(value: Multihash): Self = StObject.set(x, "multihash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerId(value: String | js.Any): Self = StObject.set(x, "PeerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerInfo(value: js.Any): Self = StObject.set(x, "PeerInfo", value.asInstanceOf[js.Any])
  }
}
