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
    
    @scala.inline
    def apply(): Cipher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cipher]
    }
    
    @scala.inline
    implicit class CipherMutableBuilder[Self <: Cipher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCipher(value: js.Array[String]): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
      
      @scala.inline
      def setCipherVarargs(value: String*): Self = StObject.set(x, "cipher", js.Array(value :_*))
      
      @scala.inline
      def setCompress(value: js.Array[String]): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setCompressVarargs(value: String*): Self = StObject.set(x, "compress", js.Array(value :_*))
      
      @scala.inline
      def setHmac(value: js.Array[String]): Self = StObject.set(x, "hmac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHmacUndefined: Self = StObject.set(x, "hmac", js.undefined)
      
      @scala.inline
      def setHmacVarargs(value: String*): Self = StObject.set(x, "hmac", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: js.Array[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKeyVarargs(value: String*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setServerHostKey(value: js.Array[String]): Self = StObject.set(x, "serverHostKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerHostKeyUndefined: Self = StObject.set(x, "serverHostKey", js.undefined)
      
      @scala.inline
      def setServerHostKeyVarargs(value: String*): Self = StObject.set(x, "serverHostKey", js.Array(value :_*))
    }
  }
}
