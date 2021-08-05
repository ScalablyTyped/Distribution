package typings.winrt.global.Windows.Security.Cryptography

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames")
  @js.native
  class AsymmetricAlgorithmNames ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames
  /* static members */
  object AsymmetricAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.dsaSha1")
    @js.native
    def dsaSha1: String = js.native
    inline def dsaSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dsaSha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.dsaSha256")
    @js.native
    def dsaSha256: String = js.native
    inline def dsaSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dsaSha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.ecdsaP256Sha256")
    @js.native
    def ecdsaP256Sha256: String = js.native
    inline def ecdsaP256Sha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsaP256Sha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.ecdsaP384Sha384")
    @js.native
    def ecdsaP384Sha384: String = js.native
    inline def ecdsaP384Sha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsaP384Sha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.ecdsaP521Sha512")
    @js.native
    def ecdsaP521Sha512: String = js.native
    inline def ecdsaP521Sha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsaP521Sha512")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaOaepSha1")
    @js.native
    def rsaOaepSha1: String = js.native
    inline def rsaOaepSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaOaepSha256")
    @js.native
    def rsaOaepSha256: String = js.native
    inline def rsaOaepSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaOaepSha384")
    @js.native
    def rsaOaepSha384: String = js.native
    inline def rsaOaepSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaOaepSha512")
    @js.native
    def rsaOaepSha512: String = js.native
    inline def rsaOaepSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha512")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaPkcs1")
    @js.native
    def rsaPkcs1: String = js.native
    inline def rsaPkcs1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaPkcs1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPkcs1Sha1")
    @js.native
    def rsaSignPkcs1Sha1: String = js.native
    inline def rsaSignPkcs1Sha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPkcs1Sha256")
    @js.native
    def rsaSignPkcs1Sha256: String = js.native
    inline def rsaSignPkcs1Sha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPkcs1Sha384")
    @js.native
    def rsaSignPkcs1Sha384: String = js.native
    inline def rsaSignPkcs1Sha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPkcs1Sha512")
    @js.native
    def rsaSignPkcs1Sha512: String = js.native
    inline def rsaSignPkcs1Sha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha512")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPssSha1")
    @js.native
    def rsaSignPssSha1: String = js.native
    inline def rsaSignPssSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPssSha256")
    @js.native
    def rsaSignPssSha256: String = js.native
    inline def rsaSignPssSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPssSha384")
    @js.native
    def rsaSignPssSha384: String = js.native
    inline def rsaSignPssSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPssSha512")
    @js.native
    def rsaSignPssSha512: String = js.native
    inline def rsaSignPssSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha512")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider")
  @js.native
  class AsymmetricKeyAlgorithmProvider ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider
  /* static members */
  object AsymmetricKeyAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("openAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider]
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
  @js.native
  class CryptographicEngine ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.CryptographicEngine
  /* static members */
  object CryptographicEngine {
    
    @JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
    
    inline def decryptAndAuthenticate(
      key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      nonce: IBuffer,
      authenticationTag: IBuffer,
      authenticatedData: IBuffer
    ): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptAndAuthenticate")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], authenticationTag.asInstanceOf[js.Any], authenticatedData.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
    
    inline def deriveKeyMaterial(
      key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
      parameters: typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters,
      desiredKeySize: Double
    ): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("deriveKeyMaterial")(key.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], desiredKeySize.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
    
    inline def encrypt(key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
    
    inline def encryptAndAuthenticate(
      key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      nonce: IBuffer,
      authenticatedData: IBuffer
    ): typings.winrt.Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptAndAuthenticate")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], authenticatedData.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData]
    
    inline def sign(key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
    
    inline def verifySignature(
      key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      signature: IBuffer
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicHash")
  @js.native
  class CryptographicHash ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.CryptographicHash {
    
    /* CompleteClass */
    override def append(data: IBuffer): Unit = js.native
    
    /* CompleteClass */
    override def getValueAndReset(): IBuffer = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicKey")
  @js.native
  class CryptographicKey ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey
  
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType")
  @js.native
  object CryptographicPrivateKeyBlobType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType & Double
      ] = js.native
    
    /* 2 */ val bCryptPrivateKey: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.bCryptPrivateKey & Double = js.native
    
    /* 3 */ val capi1PrivateKey: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.capi1PrivateKey & Double = js.native
    
    /* 1 */ val pkcs1RsaPrivateKey: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.pkcs1RsaPrivateKey & Double = js.native
    
    /* 0 */ val pkcs8RawPrivateKeyInfo: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.pkcs8RawPrivateKeyInfo & Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType")
  @js.native
  object CryptographicPublicKeyBlobType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType & Double
      ] = js.native
    
    /* 2 */ val bCryptPublicKey: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.bCryptPublicKey & Double = js.native
    
    /* 3 */ val capi1PublicKey: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.capi1PublicKey & Double = js.native
    
    /* 1 */ val pkcs1RsaPublicKey: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.pkcs1RsaPublicKey & Double = js.native
    
    /* 0 */ val x509SubjectPublicKeyInfo: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.x509SubjectPublicKeyInfo & Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData")
  @js.native
  class EncryptedAndAuthenticatedData ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData {
    
    /* CompleteClass */
    var authenticationTag: IBuffer = js.native
    
    /* CompleteClass */
    var encryptedData: IBuffer = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames")
  @js.native
  class HashAlgorithmNames ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.HashAlgorithmNames
  /* static members */
  object HashAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.md5")
    @js.native
    def md5: String = js.native
    inline def md5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md5")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.sha1")
    @js.native
    def sha1: String = js.native
    inline def sha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.sha256")
    @js.native
    def sha256: String = js.native
    inline def sha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.sha384")
    @js.native
    def sha384: String = js.native
    inline def sha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.sha512")
    @js.native
    def sha512: String = js.native
    inline def sha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
  @js.native
  class HashAlgorithmProvider ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.HashAlgorithmProvider {
    
    /* CompleteClass */
    var algorithmName: String = js.native
    
    /* CompleteClass */
    override def createHash(): typings.winrt.Windows.Security.Cryptography.Core.CryptographicHash = js.native
    
    /* CompleteClass */
    override def hashData(data: IBuffer): IBuffer = js.native
    
    /* CompleteClass */
    var hashLength: Double = js.native
  }
  /* static members */
  object HashAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.HashAlgorithmProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("openAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Security.Cryptography.Core.HashAlgorithmProvider]
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames")
  @js.native
  class KeyDerivationAlgorithmNames ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames
  /* static members */
  object KeyDerivationAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Md5")
    @js.native
    def pbkdf2Md5: String = js.native
    inline def pbkdf2Md5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Md5")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Sha1")
    @js.native
    def pbkdf2Sha1: String = js.native
    inline def pbkdf2Sha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Sha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Sha256")
    @js.native
    def pbkdf2Sha256: String = js.native
    inline def pbkdf2Sha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Sha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Sha384")
    @js.native
    def pbkdf2Sha384: String = js.native
    inline def pbkdf2Sha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Sha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Sha512")
    @js.native
    def pbkdf2Sha512: String = js.native
    inline def pbkdf2Sha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Sha512")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacMd5")
    @js.native
    def sp800108CtrHmacMd5: String = js.native
    inline def sp800108CtrHmacMd5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacMd5")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacSha1")
    @js.native
    def sp800108CtrHmacSha1: String = js.native
    inline def sp800108CtrHmacSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacSha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacSha256")
    @js.native
    def sp800108CtrHmacSha256: String = js.native
    inline def sp800108CtrHmacSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacSha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacSha384")
    @js.native
    def sp800108CtrHmacSha384: String = js.native
    inline def sp800108CtrHmacSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacSha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacSha512")
    @js.native
    def sp800108CtrHmacSha512: String = js.native
    inline def sp800108CtrHmacSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacSha512")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatMd5")
    @js.native
    def sp80056aConcatMd5: String = js.native
    inline def sp80056aConcatMd5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatMd5")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatSha1")
    @js.native
    def sp80056aConcatSha1: String = js.native
    inline def sp80056aConcatSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatSha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatSha256")
    @js.native
    def sp80056aConcatSha256: String = js.native
    inline def sp80056aConcatSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatSha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatSha384")
    @js.native
    def sp80056aConcatSha384: String = js.native
    inline def sp80056aConcatSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatSha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatSha512")
    @js.native
    def sp80056aConcatSha512: String = js.native
    inline def sp80056aConcatSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatSha512")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
  @js.native
  class KeyDerivationAlgorithmProvider ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider {
    
    /* CompleteClass */
    var algorithmName: String = js.native
    
    /* CompleteClass */
    override def createKey(keyMaterial: IBuffer): typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey = js.native
  }
  /* static members */
  object KeyDerivationAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("openAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider]
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
  @js.native
  class KeyDerivationParameters ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters {
    
    /* CompleteClass */
    var iterationCount: Double = js.native
    
    /* CompleteClass */
    var kdfGenericBinary: IBuffer = js.native
  }
  /* static members */
  object KeyDerivationParameters {
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildForPbkdf2(pbkdf2Salt: IBuffer, iterationCount: Double): typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("buildForPbkdf2")(pbkdf2Salt.asInstanceOf[js.Any], iterationCount.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters]
    
    inline def buildForSP800108(label: IBuffer, context: IBuffer): typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("buildForSP800108")(label.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters]
    
    inline def buildForSP80056a(
      algorithmId: IBuffer,
      partyUInfo: IBuffer,
      partyVInfo: IBuffer,
      suppPubInfo: IBuffer,
      suppPrivInfo: IBuffer
    ): typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("buildForSP80056a")(algorithmId.asInstanceOf[js.Any], partyUInfo.asInstanceOf[js.Any], partyVInfo.asInstanceOf[js.Any], suppPubInfo.asInstanceOf[js.Any], suppPrivInfo.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters]
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames")
  @js.native
  class MacAlgorithmNames ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.MacAlgorithmNames
  /* static members */
  object MacAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.aesCmac")
    @js.native
    def aesCmac: String = js.native
    inline def aesCmac_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesCmac")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacMd5")
    @js.native
    def hmacMd5: String = js.native
    inline def hmacMd5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacMd5")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacSha1")
    @js.native
    def hmacSha1: String = js.native
    inline def hmacSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacSha256")
    @js.native
    def hmacSha256: String = js.native
    inline def hmacSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacSha384")
    @js.native
    def hmacSha384: String = js.native
    inline def hmacSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacSha512")
    @js.native
    def hmacSha512: String = js.native
    inline def hmacSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha512")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
  @js.native
  class MacAlgorithmProvider ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.MacAlgorithmProvider {
    
    /* CompleteClass */
    var algorithmName: String = js.native
    
    /* CompleteClass */
    override def createKey(keyMaterial: IBuffer): typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey = js.native
    
    /* CompleteClass */
    var macLength: Double = js.native
  }
  /* static members */
  object MacAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.MacAlgorithmProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("openAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Security.Cryptography.Core.MacAlgorithmProvider]
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames")
  @js.native
  class SymmetricAlgorithmNames ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.SymmetricAlgorithmNames
  /* static members */
  object SymmetricAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesCbc")
    @js.native
    def aesCbc: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesCbcPkcs7")
    @js.native
    def aesCbcPkcs7: String = js.native
    inline def aesCbcPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesCbcPkcs7")(x.asInstanceOf[js.Any])
    
    inline def aesCbc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesCbc")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesCcm")
    @js.native
    def aesCcm: String = js.native
    inline def aesCcm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesCcm")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesEcb")
    @js.native
    def aesEcb: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesEcbPkcs7")
    @js.native
    def aesEcbPkcs7: String = js.native
    inline def aesEcbPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesEcbPkcs7")(x.asInstanceOf[js.Any])
    
    inline def aesEcb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesEcb")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesGcm")
    @js.native
    def aesGcm: String = js.native
    inline def aesGcm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesGcm")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.desCbc")
    @js.native
    def desCbc: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.desCbcPkcs7")
    @js.native
    def desCbcPkcs7: String = js.native
    inline def desCbcPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desCbcPkcs7")(x.asInstanceOf[js.Any])
    
    inline def desCbc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desCbc")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.desEcb")
    @js.native
    def desEcb: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.desEcbPkcs7")
    @js.native
    def desEcbPkcs7: String = js.native
    inline def desEcbPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desEcbPkcs7")(x.asInstanceOf[js.Any])
    
    inline def desEcb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desEcb")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc2Cbc")
    @js.native
    def rc2Cbc: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc2CbcPkcs7")
    @js.native
    def rc2CbcPkcs7: String = js.native
    inline def rc2CbcPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc2CbcPkcs7")(x.asInstanceOf[js.Any])
    
    inline def rc2Cbc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc2Cbc")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc2Ecb")
    @js.native
    def rc2Ecb: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc2EcbPkcs7")
    @js.native
    def rc2EcbPkcs7: String = js.native
    inline def rc2EcbPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc2EcbPkcs7")(x.asInstanceOf[js.Any])
    
    inline def rc2Ecb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc2Ecb")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc4")
    @js.native
    def rc4: String = js.native
    inline def rc4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc4")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.tripleDesCbc")
    @js.native
    def tripleDesCbc: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.tripleDesCbcPkcs7")
    @js.native
    def tripleDesCbcPkcs7: String = js.native
    inline def tripleDesCbcPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesCbcPkcs7")(x.asInstanceOf[js.Any])
    
    inline def tripleDesCbc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesCbc")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.tripleDesEcb")
    @js.native
    def tripleDesEcb: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.tripleDesEcbPkcs7")
    @js.native
    def tripleDesEcbPkcs7: String = js.native
    inline def tripleDesEcbPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesEcbPkcs7")(x.asInstanceOf[js.Any])
    
    inline def tripleDesEcb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesEcb")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
  @js.native
  class SymmetricKeyAlgorithmProvider ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider {
    
    /* CompleteClass */
    var algorithmName: String = js.native
    
    /* CompleteClass */
    var blockLength: Double = js.native
    
    /* CompleteClass */
    override def createSymmetricKey(keyMaterial: IBuffer): typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey = js.native
  }
  /* static members */
  object SymmetricKeyAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("openAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider]
  }
}
