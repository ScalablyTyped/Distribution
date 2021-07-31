package typings.web3Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cipher extends StObject {
    
    var cipher: String
    
    var cipherparams: Iv
    
    var ciphertext: String
    
    var kdf: String
    
    var kdfparams: Dklen
    
    var mac: String
  }
  object Cipher {
    
    @scala.inline
    def apply(cipher: String, cipherparams: Iv, ciphertext: String, kdf: String, kdfparams: Dklen, mac: String): Cipher = {
      val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], cipherparams = cipherparams.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], kdf = kdf.asInstanceOf[js.Any], kdfparams = kdfparams.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cipher]
    }
    
    @scala.inline
    implicit class CipherMutableBuilder[Self <: Cipher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCipherparams(value: Iv): Self = StObject.set(x, "cipherparams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKdf(value: String): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKdfparams(value: Dklen): Self = StObject.set(x, "kdfparams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: String
    
    var topics: js.Array[js.Any]
  }
  object Data {
    
    @scala.inline
    def apply(data: String, topics: js.Array[js.Any]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopics(value: js.Array[js.Any]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicsVarargs(value: js.Any*): Self = StObject.set(x, "topics", js.Array(value :_*))
    }
  }
  
  trait Dklen extends StObject {
    
    var dklen: Double
    
    var n: Double
    
    var p: Double
    
    var r: Double
    
    var salt: String
  }
  object Dklen {
    
    @scala.inline
    def apply(dklen: Double, n: Double, p: Double, r: Double, salt: String): Dklen = {
      val __obj = js.Dynamic.literal(dklen = dklen.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dklen]
    }
    
    @scala.inline
    implicit class DklenMutableBuilder[Self <: Dklen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDklen(value: Double): Self = StObject.set(x, "dklen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Gas extends StObject {
    
    var gas: String
    
    var gasPrice: String
    
    var hash: String
    
    var input: String
    
    var nonce: String
    
    var r: String
    
    var s: String
    
    var to: String
    
    var v: String
    
    var value: String
  }
  object Gas {
    
    @scala.inline
    def apply(
      gas: String,
      gasPrice: String,
      hash: String,
      input: String,
      nonce: String,
      r: String,
      s: String,
      to: String,
      v: String,
      value: String
    ): Gas = {
      val __obj = js.Dynamic.literal(gas = gas.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gas]
    }
    
    @scala.inline
    implicit class GasMutableBuilder[Self <: Gas] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGas(value: String): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Iv extends StObject {
    
    var iv: String
  }
  object Iv {
    
    @scala.inline
    def apply(iv: String): Iv = {
      val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iv]
    }
    
    @scala.inline
    implicit class IvMutableBuilder[Self <: Iv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    }
  }
}
