package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CipherKeyValueParams
  extends StObject
     with CommonParams {
  
  var askOnDecrypt: js.UndefOr[Boolean] = js.undefined
  
  var askOnEncrypt: js.UndefOr[Boolean] = js.undefined
  
  var iv: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var path: String | js.Array[Double]
  
  var value: js.UndefOr[String] = js.undefined
}
object CipherKeyValueParams {
  
  inline def apply(path: String | js.Array[Double]): CipherKeyValueParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherKeyValueParams]
  }
  
  extension [Self <: CipherKeyValueParams](x: Self) {
    
    inline def setAskOnDecrypt(value: Boolean): Self = StObject.set(x, "askOnDecrypt", value.asInstanceOf[js.Any])
    
    inline def setAskOnDecryptUndefined: Self = StObject.set(x, "askOnDecrypt", js.undefined)
    
    inline def setAskOnEncrypt(value: Boolean): Self = StObject.set(x, "askOnEncrypt", value.asInstanceOf[js.Any])
    
    inline def setAskOnEncryptUndefined: Self = StObject.set(x, "askOnEncrypt", js.undefined)
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
