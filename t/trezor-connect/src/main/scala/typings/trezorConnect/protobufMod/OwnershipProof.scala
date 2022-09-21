package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnershipProof extends StObject {
  
  var ownership_proof: String
  
  var signature: String
}
object OwnershipProof {
  
  inline def apply(ownership_proof: String, signature: String): OwnershipProof = {
    val __obj = js.Dynamic.literal(ownership_proof = ownership_proof.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnershipProof]
  }
  
  extension [Self <: OwnershipProof](x: Self) {
    
    inline def setOwnership_proof(value: String): Self = StObject.set(x, "ownership_proof", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
