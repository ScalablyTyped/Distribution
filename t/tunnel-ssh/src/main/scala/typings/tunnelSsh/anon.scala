package typings.tunnelSsh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cipher extends StObject {
    
    var cipher: js.UndefOr[js.Array[String]] = js.undefined
    
    var compress: js.UndefOr[js.Array[String]] = js.undefined
    
    var hmac: js.UndefOr[js.Array[String]] = js.undefined
    
    var key: js.UndefOr[js.Array[String]] = js.undefined
    
    var serverHostKey: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Cipher {
    
    inline def apply(): Cipher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cipher]
    }
    
    extension [Self <: Cipher](x: Self) {
      
      inline def setCipher(value: js.Array[String]): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      inline def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
      
      inline def setCipherVarargs(value: String*): Self = StObject.set(x, "cipher", js.Array(value :_*))
      
      inline def setCompress(value: js.Array[String]): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setCompressVarargs(value: String*): Self = StObject.set(x, "compress", js.Array(value :_*))
      
      inline def setHmac(value: js.Array[String]): Self = StObject.set(x, "hmac", value.asInstanceOf[js.Any])
      
      inline def setHmacUndefined: Self = StObject.set(x, "hmac", js.undefined)
      
      inline def setHmacVarargs(value: String*): Self = StObject.set(x, "hmac", js.Array(value :_*))
      
      inline def setKey(value: js.Array[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: String*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      inline def setServerHostKey(value: js.Array[String]): Self = StObject.set(x, "serverHostKey", value.asInstanceOf[js.Any])
      
      inline def setServerHostKeyUndefined: Self = StObject.set(x, "serverHostKey", js.undefined)
      
      inline def setServerHostKeyVarargs(value: String*): Self = StObject.set(x, "serverHostKey", js.Array(value :_*))
    }
  }
}
