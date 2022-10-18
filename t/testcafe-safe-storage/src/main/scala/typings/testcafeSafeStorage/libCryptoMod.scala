package typings.testcafeSafeStorage

import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.KeyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCryptoMod {
  
  @JSImport("testcafe-safe-storage/lib/crypto", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CryptoContext {
    
    /* private */ /* CompleteClass */
    var _createCipher: Any = js.native
    
    /* private */ /* CompleteClass */
    var _createDecipher: Any = js.native
    
    /* CompleteClass */
    override def _generateEncryptionKeys(): js.Promise[EncryptionContext] = js.native
    
    /* CompleteClass */
    override def _generateKeyPair(): js.Promise[KeyPair] = js.native
    
    /* CompleteClass */
    override def _generateNonce(): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def _generatePassphrase(nonce: Buffer): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def _loadAuthTag(): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def _loadDecryptionKeys(): js.Promise[DecryptionContext] = js.native
    
    /* private */ /* CompleteClass */
    var _loadNonce: Any = js.native
    
    /* CompleteClass */
    override def _loadPassphrase(privateKey: KeyObject): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def _loadPrivateKey(nonce: Buffer): js.Promise[KeyObject] = js.native
    
    /* CompleteClass */
    override def _saveAuthTag(authTag: Buffer): js.Promise[Unit] = js.native
    
    /* private */ /* CompleteClass */
    var _saveNonce: Any = js.native
    
    /* CompleteClass */
    override def _savePassphrase(passphrase: Buffer, publicKey: KeyObject): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def _savePrivateKey(privateKey: KeyObject, nonce: Buffer): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def decrypt(data: Buffer): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def encrypt(data: Buffer): js.Promise[Buffer] = js.native
  }
  
  trait CryptoContext extends StObject {
    
    /* private */ var _createCipher: Any
    
    /* private */ var _createDecipher: Any
    
    def _generateEncryptionKeys(): js.Promise[EncryptionContext]
    
    def _generateKeyPair(): js.Promise[KeyPair]
    
    def _generateNonce(): js.Promise[Buffer]
    
    def _generatePassphrase(nonce: Buffer): js.Promise[Buffer]
    
    def _loadAuthTag(): js.Promise[Buffer]
    
    def _loadDecryptionKeys(): js.Promise[DecryptionContext]
    
    /* private */ var _loadNonce: Any
    
    def _loadPassphrase(privateKey: KeyObject): js.Promise[Buffer]
    
    def _loadPrivateKey(nonce: Buffer): js.Promise[KeyObject]
    
    def _saveAuthTag(authTag: Buffer): js.Promise[Unit]
    
    /* private */ var _saveNonce: Any
    
    def _savePassphrase(passphrase: Buffer, publicKey: KeyObject): js.Promise[Unit]
    
    def _savePrivateKey(privateKey: KeyObject, nonce: Buffer): js.Promise[Unit]
    
    def decrypt(data: Buffer): js.Promise[Buffer]
    
    def encrypt(data: Buffer): js.Promise[Buffer]
  }
  object CryptoContext {
    
    inline def apply(
      _createCipher: Any,
      _createDecipher: Any,
      _generateEncryptionKeys: () => js.Promise[EncryptionContext],
      _generateKeyPair: () => js.Promise[KeyPair],
      _generateNonce: () => js.Promise[Buffer],
      _generatePassphrase: Buffer => js.Promise[Buffer],
      _loadAuthTag: () => js.Promise[Buffer],
      _loadDecryptionKeys: () => js.Promise[DecryptionContext],
      _loadNonce: Any,
      _loadPassphrase: KeyObject => js.Promise[Buffer],
      _loadPrivateKey: Buffer => js.Promise[KeyObject],
      _saveAuthTag: Buffer => js.Promise[Unit],
      _saveNonce: Any,
      _savePassphrase: (Buffer, KeyObject) => js.Promise[Unit],
      _savePrivateKey: (KeyObject, Buffer) => js.Promise[Unit],
      decrypt: Buffer => js.Promise[Buffer],
      encrypt: Buffer => js.Promise[Buffer]
    ): CryptoContext = {
      val __obj = js.Dynamic.literal(_createCipher = _createCipher.asInstanceOf[js.Any], _createDecipher = _createDecipher.asInstanceOf[js.Any], _generateEncryptionKeys = js.Any.fromFunction0(_generateEncryptionKeys), _generateKeyPair = js.Any.fromFunction0(_generateKeyPair), _generateNonce = js.Any.fromFunction0(_generateNonce), _generatePassphrase = js.Any.fromFunction1(_generatePassphrase), _loadAuthTag = js.Any.fromFunction0(_loadAuthTag), _loadDecryptionKeys = js.Any.fromFunction0(_loadDecryptionKeys), _loadNonce = _loadNonce.asInstanceOf[js.Any], _loadPassphrase = js.Any.fromFunction1(_loadPassphrase), _loadPrivateKey = js.Any.fromFunction1(_loadPrivateKey), _saveAuthTag = js.Any.fromFunction1(_saveAuthTag), _saveNonce = _saveNonce.asInstanceOf[js.Any], _savePassphrase = js.Any.fromFunction2(_savePassphrase), _savePrivateKey = js.Any.fromFunction2(_savePrivateKey), decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
      __obj.asInstanceOf[CryptoContext]
    }
    
    extension [Self <: CryptoContext](x: Self) {
      
      inline def setDecrypt(value: Buffer => js.Promise[Buffer]): Self = StObject.set(x, "decrypt", js.Any.fromFunction1(value))
      
      inline def setEncrypt(value: Buffer => js.Promise[Buffer]): Self = StObject.set(x, "encrypt", js.Any.fromFunction1(value))
      
      inline def set_createCipher(value: Any): Self = StObject.set(x, "_createCipher", value.asInstanceOf[js.Any])
      
      inline def set_createDecipher(value: Any): Self = StObject.set(x, "_createDecipher", value.asInstanceOf[js.Any])
      
      inline def set_generateEncryptionKeys(value: () => js.Promise[EncryptionContext]): Self = StObject.set(x, "_generateEncryptionKeys", js.Any.fromFunction0(value))
      
      inline def set_generateKeyPair(value: () => js.Promise[KeyPair]): Self = StObject.set(x, "_generateKeyPair", js.Any.fromFunction0(value))
      
      inline def set_generateNonce(value: () => js.Promise[Buffer]): Self = StObject.set(x, "_generateNonce", js.Any.fromFunction0(value))
      
      inline def set_generatePassphrase(value: Buffer => js.Promise[Buffer]): Self = StObject.set(x, "_generatePassphrase", js.Any.fromFunction1(value))
      
      inline def set_loadAuthTag(value: () => js.Promise[Buffer]): Self = StObject.set(x, "_loadAuthTag", js.Any.fromFunction0(value))
      
      inline def set_loadDecryptionKeys(value: () => js.Promise[DecryptionContext]): Self = StObject.set(x, "_loadDecryptionKeys", js.Any.fromFunction0(value))
      
      inline def set_loadNonce(value: Any): Self = StObject.set(x, "_loadNonce", value.asInstanceOf[js.Any])
      
      inline def set_loadPassphrase(value: KeyObject => js.Promise[Buffer]): Self = StObject.set(x, "_loadPassphrase", js.Any.fromFunction1(value))
      
      inline def set_loadPrivateKey(value: Buffer => js.Promise[KeyObject]): Self = StObject.set(x, "_loadPrivateKey", js.Any.fromFunction1(value))
      
      inline def set_saveAuthTag(value: Buffer => js.Promise[Unit]): Self = StObject.set(x, "_saveAuthTag", js.Any.fromFunction1(value))
      
      inline def set_saveNonce(value: Any): Self = StObject.set(x, "_saveNonce", value.asInstanceOf[js.Any])
      
      inline def set_savePassphrase(value: (Buffer, KeyObject) => js.Promise[Unit]): Self = StObject.set(x, "_savePassphrase", js.Any.fromFunction2(value))
      
      inline def set_savePrivateKey(value: (KeyObject, Buffer) => js.Promise[Unit]): Self = StObject.set(x, "_savePrivateKey", js.Any.fromFunction2(value))
    }
  }
  
  trait DecryptionContext
    extends StObject
       with EncryptionContext {
    
    var authTag: Buffer
  }
  object DecryptionContext {
    
    inline def apply(authTag: Buffer, nonce: Buffer, passphrase: Buffer): DecryptionContext = {
      val __obj = js.Dynamic.literal(authTag = authTag.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptionContext]
    }
    
    extension [Self <: DecryptionContext](x: Self) {
      
      inline def setAuthTag(value: Buffer): Self = StObject.set(x, "authTag", value.asInstanceOf[js.Any])
    }
  }
  
  trait EncryptionContext extends StObject {
    
    var nonce: Buffer
    
    var passphrase: Buffer
  }
  object EncryptionContext {
    
    inline def apply(nonce: Buffer, passphrase: Buffer): EncryptionContext = {
      val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptionContext]
    }
    
    extension [Self <: EncryptionContext](x: Self) {
      
      inline def setNonce(value: Buffer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setPassphrase(value: Buffer): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyPair extends StObject {
    
    var privateKey: KeyObject
    
    var publicKey: KeyObject
  }
  object KeyPair {
    
    inline def apply(privateKey: KeyObject, publicKey: KeyObject): KeyPair = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPair]
    }
    
    extension [Self <: KeyPair](x: Self) {
      
      inline def setPrivateKey(value: KeyObject): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: KeyObject): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
