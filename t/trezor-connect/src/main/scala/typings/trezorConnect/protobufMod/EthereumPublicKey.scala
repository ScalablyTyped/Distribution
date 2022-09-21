package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumPublicKey extends StObject {
  
  var node: HDNodeType
  
  var xpub: String
}
object EthereumPublicKey {
  
  inline def apply(node: HDNodeType, xpub: String): EthereumPublicKey = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumPublicKey]
  }
  
  extension [Self <: EthereumPublicKey](x: Self) {
    
    inline def setNode(value: HDNodeType): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setXpub(value: String): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
  }
}
