package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherKeyValueParams extends CommonParams {
  
  var askOnDecrypt: js.UndefOr[Boolean] = js.native
  
  var askOnEncrypt: js.UndefOr[Boolean] = js.native
  
  var iv: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var path: String | js.Array[Double] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object CipherKeyValueParams {
  
  @scala.inline
  def apply(path: String | js.Array[Double]): CipherKeyValueParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherKeyValueParams]
  }
  
  @scala.inline
  implicit class CipherKeyValueParamsMutableBuilder[Self <: CipherKeyValueParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAskOnDecrypt(value: Boolean): Self = StObject.set(x, "askOnDecrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAskOnDecryptUndefined: Self = StObject.set(x, "askOnDecrypt", js.undefined)
    
    @scala.inline
    def setAskOnEncrypt(value: Boolean): Self = StObject.set(x, "askOnEncrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAskOnEncryptUndefined: Self = StObject.set(x, "askOnEncrypt", js.undefined)
    
    @scala.inline
    def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
