package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKey extends StObject {
  
  // optional for segwit accounts: xpub in segwit format
  var chainCode: String = js.native
  
  // BIP32 serialization format
  var childNum: Double = js.native
  
  // BIP32 serialization format
  var depth: Double = js.native
  
  // BIP32 serialization format
  var fingerprint: Double = js.native
  
  var path: js.Array[Double] = js.native
  
  // BIP32 serialization format
  var publicKey: String = js.native
  
  // hardended path
  var serializedPath: String = js.native
  
  // serialized path
  var xpub: String = js.native
  
  // xpub in legacy format
  var xpubSegwit: js.UndefOr[String] = js.native
}
object PublicKey {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PublicKeyMutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChainCode(value: String): Self = StObject.set(x, "chainCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNum(value: Double): Self = StObject.set(x, "childNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: Double): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpub(value: String): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpubSegwit(value: String): Self = StObject.set(x, "xpubSegwit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpubSegwitUndefined: Self = StObject.set(x, "xpubSegwit", js.undefined)
  }
}
