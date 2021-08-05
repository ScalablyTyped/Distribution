package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKey extends StObject {
  
  // optional for segwit accounts: xpub in segwit format
  var chainCode: String
  
  // BIP32 serialization format
  var childNum: Double
  
  // BIP32 serialization format
  var depth: Double
  
  // BIP32 serialization format
  var fingerprint: Double
  
  var path: js.Array[Double]
  
  // BIP32 serialization format
  var publicKey: String
  
  // hardended path
  var serializedPath: String
  
  // serialized path
  var xpub: String
  
  // xpub in legacy format
  var xpubSegwit: js.UndefOr[String] = js.undefined
}
object PublicKey {
  
  inline def apply(
    chainCode: String,
    childNum: Double,
    depth: Double,
    fingerprint: Double,
    path: js.Array[Double],
    publicKey: String,
    serializedPath: String,
    xpub: String
  ): PublicKey = {
    val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], childNum = childNum.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  extension [Self <: PublicKey](x: Self) {
    
    inline def setChainCode(value: String): Self = StObject.set(x, "chainCode", value.asInstanceOf[js.Any])
    
    inline def setChildNum(value: Double): Self = StObject.set(x, "childNum", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setFingerprint(value: Double): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
    
    inline def setXpub(value: String): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
    
    inline def setXpubSegwit(value: String): Self = StObject.set(x, "xpubSegwit", value.asInstanceOf[js.Any])
    
    inline def setXpubSegwitUndefined: Self = StObject.set(x, "xpubSegwit", js.undefined)
  }
}
