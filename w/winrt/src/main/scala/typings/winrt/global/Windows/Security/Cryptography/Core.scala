package typings.winrt.global.Windows.Security.Cryptography

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames")
  @js.native
  class AsymmetricAlgorithmNames ()
    extends typings.winrt.Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames
  /* static members */
  object AsymmetricAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.dsaSha1")
    @js.native
    def dsaSha1: String = js.native
    @scala.inline
    def dsaSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dsaSha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.dsaSha256")
    @js.native
    def dsaSha256: String = js.native
    @scala.inline
    def dsaSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dsaSha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.ecdsaP256Sha256")
    @js.native
    def ecdsaP256Sha256: String = js.native
    @scala.inline
    def ecdsaP256Sha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsaP256Sha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.ecdsaP384Sha384")
    @js.native
    def ecdsaP384Sha384: String = js.native
    @scala.inline
    def ecdsaP384Sha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsaP384Sha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.ecdsaP521Sha512")
    @js.native
    def ecdsaP521Sha512: String = js.native
    @scala.inline
    def ecdsaP521Sha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsaP521Sha512")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaOaepSha1")
    @js.native
    def rsaOaepSha1: String = js.native
    @scala.inline
    def rsaOaepSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaOaepSha256")
    @js.native
    def rsaOaepSha256: String = js.native
    @scala.inline
    def rsaOaepSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaOaepSha384")
    @js.native
    def rsaOaepSha384: String = js.native
    @scala.inline
    def rsaOaepSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaOaepSha512")
    @js.native
    def rsaOaepSha512: String = js.native
    @scala.inline
    def rsaOaepSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha512")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaPkcs1")
    @js.native
    def rsaPkcs1: String = js.native
    @scala.inline
    def rsaPkcs1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaPkcs1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPkcs1Sha1")
    @js.native
    def rsaSignPkcs1Sha1: String = js.native
    @scala.inline
    def rsaSignPkcs1Sha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPkcs1Sha256")
    @js.native
    def rsaSignPkcs1Sha256: String = js.native
    @scala.inline
    def rsaSignPkcs1Sha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPkcs1Sha384")
    @js.native
    def rsaSignPkcs1Sha384: String = js.native
    @scala.inline
    def rsaSignPkcs1Sha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPkcs1Sha512")
    @js.native
    def rsaSignPkcs1Sha512: String = js.native
    @scala.inline
    def rsaSignPkcs1Sha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha512")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPssSha1")
    @js.native
    def rsaSignPssSha1: String = js.native
    @scala.inline
    def rsaSignPssSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPssSha256")
    @js.native
    def rsaSignPssSha256: String = js.native
    @scala.inline
    def rsaSignPssSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPssSha384")
    @js.native
    def rsaSignPssSha384: String = js.native
    @scala.inline
    def rsaSignPssSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPssSha512")
    @js.native
    def rsaSignPssSha512: String = js.native
    @scala.inline
    def rsaSignPssSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha512")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider")
  @js.native
  class AsymmetricKeyAlgorithmProvider ()
    extends typings.winrt.Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider
  /* static members */
  object AsymmetricKeyAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider.openAlgorithm")
    @js.native
    def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
  @js.native
  class CryptographicEngine ()
    extends typings.winrt.Windows.Security.Cryptography.Core.CryptographicEngine
  /* static members */
  object CryptographicEngine {
    
    @JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine.decrypt")
    @js.native
    def decrypt(key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine.decryptAndAuthenticate")
    @js.native
    def decryptAndAuthenticate(
      key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      nonce: IBuffer,
      authenticationTag: IBuffer,
      authenticatedData: IBuffer
    ): IBuffer = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine.deriveKeyMaterial")
    @js.native
    def deriveKeyMaterial(
      key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
      parameters: typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters,
      desiredKeySize: Double
    ): IBuffer = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine.encrypt")
    @js.native
    def encrypt(key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine.encryptAndAuthenticate")
    @js.native
    def encryptAndAuthenticate(
      key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      nonce: IBuffer,
      authenticatedData: IBuffer
    ): typings.winrt.Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine.sign")
    @js.native
    def sign(key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer): IBuffer = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine.verifySignature")
    @js.native
    def verifySignature(
      key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      signature: IBuffer
    ): Boolean = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicHash")
  @js.native
  class CryptographicHash ()
    extends typings.winrt.Windows.Security.Cryptography.Core.CryptographicHash
  
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicKey")
  @js.native
  class CryptographicKey ()
    extends typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey
  
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType")
  @js.native
  object CryptographicPrivateKeyBlobType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType with Double
      ] = js.native
    
    /* 2 */ val bCryptPrivateKey: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.bCryptPrivateKey with Double = js.native
    
    /* 3 */ val capi1PrivateKey: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.capi1PrivateKey with Double = js.native
    
    /* 1 */ val pkcs1RsaPrivateKey: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.pkcs1RsaPrivateKey with Double = js.native
    
    /* 0 */ val pkcs8RawPrivateKeyInfo: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.pkcs8RawPrivateKeyInfo with Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType")
  @js.native
  object CryptographicPublicKeyBlobType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType with Double
      ] = js.native
    
    /* 2 */ val bCryptPublicKey: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.bCryptPublicKey with Double = js.native
    
    /* 3 */ val capi1PublicKey: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.capi1PublicKey with Double = js.native
    
    /* 1 */ val pkcs1RsaPublicKey: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.pkcs1RsaPublicKey with Double = js.native
    
    /* 0 */ val x509SubjectPublicKeyInfo: typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.x509SubjectPublicKeyInfo with Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData")
  @js.native
  class EncryptedAndAuthenticatedData ()
    extends typings.winrt.Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData
  
  @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames")
  @js.native
  class HashAlgorithmNames ()
    extends typings.winrt.Windows.Security.Cryptography.Core.HashAlgorithmNames
  /* static members */
  object HashAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.md5")
    @js.native
    def md5: String = js.native
    @scala.inline
    def md5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md5")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.sha1")
    @js.native
    def sha1: String = js.native
    @scala.inline
    def sha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.sha256")
    @js.native
    def sha256: String = js.native
    @scala.inline
    def sha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.sha384")
    @js.native
    def sha384: String = js.native
    @scala.inline
    def sha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.sha512")
    @js.native
    def sha512: String = js.native
    @scala.inline
    def sha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
  @js.native
  class HashAlgorithmProvider ()
    extends typings.winrt.Windows.Security.Cryptography.Core.HashAlgorithmProvider
  /* static members */
  object HashAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider.openAlgorithm")
    @js.native
    def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.HashAlgorithmProvider = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames")
  @js.native
  class KeyDerivationAlgorithmNames ()
    extends typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames
  /* static members */
  object KeyDerivationAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Md5")
    @js.native
    def pbkdf2Md5: String = js.native
    @scala.inline
    def pbkdf2Md5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Md5")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Sha1")
    @js.native
    def pbkdf2Sha1: String = js.native
    @scala.inline
    def pbkdf2Sha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Sha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Sha256")
    @js.native
    def pbkdf2Sha256: String = js.native
    @scala.inline
    def pbkdf2Sha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Sha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Sha384")
    @js.native
    def pbkdf2Sha384: String = js.native
    @scala.inline
    def pbkdf2Sha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Sha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Sha512")
    @js.native
    def pbkdf2Sha512: String = js.native
    @scala.inline
    def pbkdf2Sha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Sha512")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacMd5")
    @js.native
    def sp800108CtrHmacMd5: String = js.native
    @scala.inline
    def sp800108CtrHmacMd5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacMd5")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacSha1")
    @js.native
    def sp800108CtrHmacSha1: String = js.native
    @scala.inline
    def sp800108CtrHmacSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacSha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacSha256")
    @js.native
    def sp800108CtrHmacSha256: String = js.native
    @scala.inline
    def sp800108CtrHmacSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacSha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacSha384")
    @js.native
    def sp800108CtrHmacSha384: String = js.native
    @scala.inline
    def sp800108CtrHmacSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacSha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacSha512")
    @js.native
    def sp800108CtrHmacSha512: String = js.native
    @scala.inline
    def sp800108CtrHmacSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacSha512")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatMd5")
    @js.native
    def sp80056aConcatMd5: String = js.native
    @scala.inline
    def sp80056aConcatMd5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatMd5")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatSha1")
    @js.native
    def sp80056aConcatSha1: String = js.native
    @scala.inline
    def sp80056aConcatSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatSha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatSha256")
    @js.native
    def sp80056aConcatSha256: String = js.native
    @scala.inline
    def sp80056aConcatSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatSha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatSha384")
    @js.native
    def sp80056aConcatSha384: String = js.native
    @scala.inline
    def sp80056aConcatSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatSha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatSha512")
    @js.native
    def sp80056aConcatSha512: String = js.native
    @scala.inline
    def sp80056aConcatSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatSha512")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
  @js.native
  class KeyDerivationAlgorithmProvider ()
    extends typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider
  /* static members */
  object KeyDerivationAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider.openAlgorithm")
    @js.native
    def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
  @js.native
  class KeyDerivationParameters ()
    extends typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters
  /* static members */
  object KeyDerivationParameters {
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters.buildForPbkdf2")
    @js.native
    def buildForPbkdf2(pbkdf2Salt: IBuffer, iterationCount: Double): typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters.buildForSP800108")
    @js.native
    def buildForSP800108(label: IBuffer, context: IBuffer): typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters.buildForSP80056a")
    @js.native
    def buildForSP80056a(
      algorithmId: IBuffer,
      partyUInfo: IBuffer,
      partyVInfo: IBuffer,
      suppPubInfo: IBuffer,
      suppPrivInfo: IBuffer
    ): typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames")
  @js.native
  class MacAlgorithmNames ()
    extends typings.winrt.Windows.Security.Cryptography.Core.MacAlgorithmNames
  /* static members */
  object MacAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.aesCmac")
    @js.native
    def aesCmac: String = js.native
    @scala.inline
    def aesCmac_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesCmac")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacMd5")
    @js.native
    def hmacMd5: String = js.native
    @scala.inline
    def hmacMd5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacMd5")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacSha1")
    @js.native
    def hmacSha1: String = js.native
    @scala.inline
    def hmacSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacSha256")
    @js.native
    def hmacSha256: String = js.native
    @scala.inline
    def hmacSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacSha384")
    @js.native
    def hmacSha384: String = js.native
    @scala.inline
    def hmacSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacSha512")
    @js.native
    def hmacSha512: String = js.native
    @scala.inline
    def hmacSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha512")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
  @js.native
  class MacAlgorithmProvider ()
    extends typings.winrt.Windows.Security.Cryptography.Core.MacAlgorithmProvider
  /* static members */
  object MacAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider.openAlgorithm")
    @js.native
    def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.MacAlgorithmProvider = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames")
  @js.native
  class SymmetricAlgorithmNames ()
    extends typings.winrt.Windows.Security.Cryptography.Core.SymmetricAlgorithmNames
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
    @scala.inline
    def aesCbcPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesCbcPkcs7")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def aesCbc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesCbc")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesCcm")
    @js.native
    def aesCcm: String = js.native
    @scala.inline
    def aesCcm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesCcm")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesEcb")
    @js.native
    def aesEcb: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesEcbPkcs7")
    @js.native
    def aesEcbPkcs7: String = js.native
    @scala.inline
    def aesEcbPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesEcbPkcs7")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def aesEcb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesEcb")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesGcm")
    @js.native
    def aesGcm: String = js.native
    @scala.inline
    def aesGcm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesGcm")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.desCbc")
    @js.native
    def desCbc: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.desCbcPkcs7")
    @js.native
    def desCbcPkcs7: String = js.native
    @scala.inline
    def desCbcPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desCbcPkcs7")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def desCbc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desCbc")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.desEcb")
    @js.native
    def desEcb: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.desEcbPkcs7")
    @js.native
    def desEcbPkcs7: String = js.native
    @scala.inline
    def desEcbPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desEcbPkcs7")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def desEcb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desEcb")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc2Cbc")
    @js.native
    def rc2Cbc: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc2CbcPkcs7")
    @js.native
    def rc2CbcPkcs7: String = js.native
    @scala.inline
    def rc2CbcPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc2CbcPkcs7")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rc2Cbc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc2Cbc")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc2Ecb")
    @js.native
    def rc2Ecb: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc2EcbPkcs7")
    @js.native
    def rc2EcbPkcs7: String = js.native
    @scala.inline
    def rc2EcbPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc2EcbPkcs7")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rc2Ecb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc2Ecb")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc4")
    @js.native
    def rc4: String = js.native
    @scala.inline
    def rc4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc4")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.tripleDesCbc")
    @js.native
    def tripleDesCbc: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.tripleDesCbcPkcs7")
    @js.native
    def tripleDesCbcPkcs7: String = js.native
    @scala.inline
    def tripleDesCbcPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesCbcPkcs7")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def tripleDesCbc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesCbc")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.tripleDesEcb")
    @js.native
    def tripleDesEcb: String = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.tripleDesEcbPkcs7")
    @js.native
    def tripleDesEcbPkcs7: String = js.native
    @scala.inline
    def tripleDesEcbPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesEcbPkcs7")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def tripleDesEcb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesEcb")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
  @js.native
  class SymmetricKeyAlgorithmProvider ()
    extends typings.winrt.Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider
  /* static members */
  object SymmetricKeyAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider.openAlgorithm")
    @js.native
    def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider = js.native
  }
}
