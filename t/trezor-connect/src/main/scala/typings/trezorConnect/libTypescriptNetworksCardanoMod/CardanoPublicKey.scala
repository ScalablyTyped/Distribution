package typings.trezorConnect.libTypescriptNetworksCardanoMod

import typings.trezorConnect.libTypescriptTrezorProtobufMod.HDNodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoPublicKey extends StObject {
  
  var node: HDNodeType
  
  var path: js.Array[Double]
  
  var publicKey: String
  
  var serializedPath: String
}
object CardanoPublicKey {
  
  inline def apply(node: HDNodeType, path: js.Array[Double], publicKey: String, serializedPath: String): CardanoPublicKey = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoPublicKey]
  }
  
  extension [Self <: CardanoPublicKey](x: Self) {
    
    inline def setNode(value: HDNodeType): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
  }
}
