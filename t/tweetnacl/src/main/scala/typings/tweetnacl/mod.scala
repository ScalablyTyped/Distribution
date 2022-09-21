package typings.tweetnacl

import org.scalablytyped.runtime.Shortcut
import typings.tweetnacl.mod.boxProps.keyPair
import typings.tweetnacl.mod.boxProps.open
import typings.tweetnacl.mod.signProps.detached
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tweetnacl", JSImport.Namespace)
  @js.native
  val ^ : nacl = js.native
  
  trait BoxKeyPair extends StObject {
    
    var publicKey: js.typedarray.Uint8Array
    
    var secretKey: js.typedarray.Uint8Array
  }
  object BoxKeyPair {
    
    inline def apply(publicKey: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): BoxKeyPair = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxKeyPair]
    }
    
    extension [Self <: BoxKeyPair](x: Self) {
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignKeyPair extends StObject {
    
    var publicKey: js.typedarray.Uint8Array
    
    var secretKey: js.typedarray.Uint8Array
  }
  object SignKeyPair {
    
    inline def apply(publicKey: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): SignKeyPair = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignKeyPair]
    }
    
    extension [Self <: SignKeyPair](x: Self) {
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = nacl
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: nacl = ^
  
  @js.native
  trait box extends StObject {
    
    def apply(
      msg: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      publicKey: js.typedarray.Uint8Array,
      secretKey: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    
    def after(msg: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def before(publicKey: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def keyPair(): BoxKeyPair = js.native
    @JSName("keyPair")
    var keyPair_Original: keyPair = js.native
    
    val nonceLength: Double = js.native
    
    def open(
      msg: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      publicKey: js.typedarray.Uint8Array,
      secretKey: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array | Null = js.native
    @JSName("open")
    var open_Original: open = js.native
    
    val overheadLength: Double = js.native
    
    val publicKeyLength: Double = js.native
    
    val secretKeyLength: Double = js.native
    
    val sharedKeyLength: Double = js.native
  }
  
  object boxProps {
    
    @js.native
    trait keyPair extends StObject {
      
      def apply(): BoxKeyPair = js.native
      
      def fromSecretKey(secretKey: js.typedarray.Uint8Array): BoxKeyPair = js.native
    }
    
    @js.native
    trait open extends StObject {
      
      def apply(
        msg: js.typedarray.Uint8Array,
        nonce: js.typedarray.Uint8Array,
        publicKey: js.typedarray.Uint8Array,
        secretKey: js.typedarray.Uint8Array
      ): js.typedarray.Uint8Array | Null = js.native
      
      def after(box: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = js.native
    }
  }
  
  @js.native
  trait hash extends StObject {
    
    def apply(msg: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    val hashLength: Double = js.native
  }
  
  trait nacl extends StObject {
    
    def box(
      msg: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      publicKey: js.typedarray.Uint8Array,
      secretKey: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array
    @JSName("box")
    var box_Original: box
    
    def hash(msg: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    @JSName("hash")
    var hash_Original: hash
    
    def randomBytes(n: Double): js.typedarray.Uint8Array
    
    def scalarMult(n: js.typedarray.Uint8Array, p: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    @JSName("scalarMult")
    var scalarMult_Original: scalarMult
    
    def secretbox(msg: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    @JSName("secretbox")
    var secretbox_Original: secretbox
    
    def setPRNG(fn: js.Function2[/* x */ js.typedarray.Uint8Array, /* n */ Double, Unit]): Unit
    
    def sign(msg: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    @JSName("sign")
    var sign_Original: sign
    
    def verify(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array): Boolean
  }
  object nacl {
    
    inline def apply(
      box: box,
      hash: hash,
      randomBytes: Double => js.typedarray.Uint8Array,
      scalarMult: scalarMult,
      secretbox: secretbox,
      setPRNG: js.Function2[/* x */ js.typedarray.Uint8Array, /* n */ Double, Unit] => Unit,
      sign: sign,
      verify: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Boolean
    ): nacl = {
      val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], randomBytes = js.Any.fromFunction1(randomBytes), scalarMult = scalarMult.asInstanceOf[js.Any], secretbox = secretbox.asInstanceOf[js.Any], setPRNG = js.Any.fromFunction1(setPRNG), sign = sign.asInstanceOf[js.Any], verify = js.Any.fromFunction2(verify))
      __obj.asInstanceOf[nacl]
    }
    
    extension [Self <: nacl](x: Self) {
      
      inline def setBox(value: box): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setHash(value: hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setRandomBytes(value: Double => js.typedarray.Uint8Array): Self = StObject.set(x, "randomBytes", js.Any.fromFunction1(value))
      
      inline def setScalarMult(value: scalarMult): Self = StObject.set(x, "scalarMult", value.asInstanceOf[js.Any])
      
      inline def setSecretbox(value: secretbox): Self = StObject.set(x, "secretbox", value.asInstanceOf[js.Any])
      
      inline def setSetPRNG(value: js.Function2[/* x */ js.typedarray.Uint8Array, /* n */ Double, Unit] => Unit): Self = StObject.set(x, "setPRNG", js.Any.fromFunction1(value))
      
      inline def setSign(value: sign): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
      
      inline def setVerify(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait scalarMult extends StObject {
    
    def apply(n: js.typedarray.Uint8Array, p: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def base(n: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    val groupElementLength: Double = js.native
    
    val scalarLength: Double = js.native
  }
  
  @js.native
  trait secretbox extends StObject {
    
    def apply(msg: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    val keyLength: Double = js.native
    
    val nonceLength: Double = js.native
    
    def open(box: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = js.native
    
    val overheadLength: Double = js.native
  }
  
  @js.native
  trait sign extends StObject {
    
    def apply(msg: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def detached(msg: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSName("detached")
    var detached_Original: detached = js.native
    
    def keyPair(): SignKeyPair = js.native
    @JSName("keyPair")
    var keyPair_Original: typings.tweetnacl.mod.signProps.keyPair = js.native
    
    def open(signedMsg: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = js.native
    
    val publicKeyLength: Double = js.native
    
    val secretKeyLength: Double = js.native
    
    val seedLength: Double = js.native
    
    val signatureLength: Double = js.native
  }
  
  object signProps {
    
    @js.native
    trait detached extends StObject {
      
      def apply(msg: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
      
      def verify(msg: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): Boolean = js.native
    }
    
    @js.native
    trait keyPair extends StObject {
      
      def apply(): SignKeyPair = js.native
      
      def fromSecretKey(secretKey: js.typedarray.Uint8Array): SignKeyPair = js.native
      
      def fromSeed(secretKey: js.typedarray.Uint8Array): SignKeyPair = js.native
    }
  }
}
