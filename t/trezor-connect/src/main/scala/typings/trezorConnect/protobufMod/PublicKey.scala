package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKey extends StObject {
  
  var node: HDNodeType
  
  var root_fingerprint: js.UndefOr[Double] = js.undefined
  
  var xpub: String
}
object PublicKey {
  
  inline def apply(node: HDNodeType, xpub: String): PublicKey = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  extension [Self <: PublicKey](x: Self) {
    
    inline def setNode(value: HDNodeType): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setRoot_fingerprint(value: Double): Self = StObject.set(x, "root_fingerprint", value.asInstanceOf[js.Any])
    
    inline def setRoot_fingerprintUndefined: Self = StObject.set(x, "root_fingerprint", js.undefined)
    
    inline def setXpub(value: String): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
  }
}
