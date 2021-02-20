package typings.tweetnacl

import org.scalablytyped.runtime.Shortcut
import typings.std.Uint8Array
import typings.tweetnacl.mod.box.keyPair
import typings.tweetnacl.mod.box.open
import typings.tweetnacl.mod.sign.detached
import typings.tweetnacl.tweetnaclBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tweetnacl", JSImport.Namespace)
  @js.native
  val ^ : nacl = js.native
  
  @js.native
  trait BoxKeyPair extends StObject {
    
    var publicKey: Uint8Array = js.native
    
    var secretKey: Uint8Array = js.native
  }
  object BoxKeyPair {
    
    @scala.inline
    def apply(publicKey: Uint8Array, secretKey: Uint8Array): BoxKeyPair = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxKeyPair]
    }
    
    @scala.inline
    implicit class BoxKeyPairMutableBuilder[Self <: BoxKeyPair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPublicKey(value: Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKey(value: Uint8Array): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SignKeyPair extends StObject {
    
    var publicKey: Uint8Array = js.native
    
    var secretKey: Uint8Array = js.native
  }
  object SignKeyPair {
    
    @scala.inline
    def apply(publicKey: Uint8Array, secretKey: Uint8Array): SignKeyPair = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignKeyPair]
    }
    
    @scala.inline
    implicit class SignKeyPairMutableBuilder[Self <: SignKeyPair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPublicKey(value: Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKey(value: Uint8Array): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = nacl
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: nacl = ^
  
  @js.native
  trait box extends StObject {
    
    def apply(msg: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
    
    def after(msg: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
    
    def before(publicKey: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
    
    def keyPair(): BoxKeyPair = js.native
    @JSName("keyPair")
    var keyPair_Original: keyPair = js.native
    
    val nonceLength: Double = js.native
    
    def open(msg: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, secretKey: Uint8Array): Uint8Array | `false` = js.native
    @JSName("open")
    var open_Original: open = js.native
    
    val overheadLength: Double = js.native
    
    val publicKeyLength: Double = js.native
    
    val secretKeyLength: Double = js.native
    
    val sharedKeyLength: Double = js.native
  }
  object box {
    
    @js.native
    trait keyPair extends StObject {
      
      def apply(): BoxKeyPair = js.native
      
      def fromSecretKey(secretKey: Uint8Array): BoxKeyPair = js.native
    }
    
    @js.native
    trait open extends StObject {
      
      def apply(msg: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, secretKey: Uint8Array): Uint8Array | `false` = js.native
      
      def after(box: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array | `false` = js.native
    }
  }
  
  @js.native
  trait hash extends StObject {
    
    def apply(msg: Uint8Array): Uint8Array = js.native
    
    val hashLength: Double = js.native
  }
  
  @js.native
  trait nacl extends StObject {
    
    def box(msg: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
    @JSName("box")
    var box_Original: box = js.native
    
    def hash(msg: Uint8Array): Uint8Array = js.native
    @JSName("hash")
    var hash_Original: hash = js.native
    
    def randomBytes(n: Double): Uint8Array = js.native
    
    def scalarMult(n: Uint8Array, p: Uint8Array): Uint8Array = js.native
    @JSName("scalarMult")
    var scalarMult_Original: scalarMult = js.native
    
    def secretbox(msg: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSName("secretbox")
    var secretbox_Original: secretbox = js.native
    
    def setPRNG(fn: js.Function2[/* x */ Uint8Array, /* n */ Double, Unit]): Unit = js.native
    
    def sign(msg: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
    @JSName("sign")
    var sign_Original: sign = js.native
    
    def verify(x: Uint8Array, y: Uint8Array): Boolean = js.native
  }
  
  @js.native
  trait scalarMult extends StObject {
    
    def apply(n: Uint8Array, p: Uint8Array): Uint8Array = js.native
    
    def base(n: Uint8Array): Uint8Array = js.native
    
    val groupElementLength: Double = js.native
    
    val scalarLength: Double = js.native
  }
  
  @js.native
  trait secretbox extends StObject {
    
    def apply(msg: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
    
    val keyLength: Double = js.native
    
    val nonceLength: Double = js.native
    
    def open(box: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array | `false` = js.native
    
    val overheadLength: Double = js.native
  }
  
  @js.native
  trait sign extends StObject {
    
    def apply(msg: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
    
    def detached(msg: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
    @JSName("detached")
    var detached_Original: detached = js.native
    
    def keyPair(): SignKeyPair = js.native
    @JSName("keyPair")
    var keyPair_Original: typings.tweetnacl.mod.sign.keyPair = js.native
    
    def open(signedMsg: Uint8Array, publicKey: Uint8Array): Uint8Array | Null = js.native
    
    val publicKeyLength: Double = js.native
    
    val secretKeyLength: Double = js.native
    
    val seedLength: Double = js.native
    
    val signatureLength: Double = js.native
  }
  object sign {
    
    @js.native
    trait detached extends StObject {
      
      def apply(msg: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
      
      def verify(msg: Uint8Array, sig: Uint8Array, publicKey: Uint8Array): Boolean = js.native
    }
    
    @js.native
    trait keyPair extends StObject {
      
      def apply(): SignKeyPair = js.native
      
      def fromSecretKey(secretKey: Uint8Array): SignKeyPair = js.native
      
      def fromSeed(secretKey: Uint8Array): SignKeyPair = js.native
    }
  }
}
