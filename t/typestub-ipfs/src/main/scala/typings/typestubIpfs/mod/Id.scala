package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var addresses: js.Array[Multiaddr]
  
  var agentVersion: String
  
  var id: String
  
  var protocolVersion: String
  
  var publicKey: String
}
object Id {
  
  inline def apply(
    addresses: js.Array[Multiaddr],
    agentVersion: String,
    id: String,
    protocolVersion: String,
    publicKey: String
  ): Id = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], agentVersion = agentVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], protocolVersion = protocolVersion.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setAddresses(value: js.Array[Multiaddr]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: Multiaddr*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersion(value: String): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
