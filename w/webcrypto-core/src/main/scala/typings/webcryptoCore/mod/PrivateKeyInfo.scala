package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateKeyInfo extends StObject {
  
  var attributes: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var privateKey: js.typedarray.ArrayBuffer
  
  var privateKeyAlgorithm: AlgorithmIdentifier1
  
  var version: Double
}
object PrivateKeyInfo {
  
  inline def apply(privateKey: js.typedarray.ArrayBuffer, privateKeyAlgorithm: AlgorithmIdentifier1, version: Double): PrivateKeyInfo = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], privateKeyAlgorithm = privateKeyAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrivateKeyInfo] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setPrivateKey(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyAlgorithm(value: AlgorithmIdentifier1): Self = StObject.set(x, "privateKeyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
