package typings.webcryptoCore.mod

import typings.std.AesKeyGenParams
import typings.std.Algorithm
import typings.std.CryptoKeyPair
import typings.std.EcKeyGenParams
import typings.std.HmacKeyGenParams
import typings.std.JsonWebKey
import typings.std.KeyFormat
import typings.std.KeyUsage
import typings.std.Pbkdf2Params
import typings.std.RsaHashedKeyGenParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "ProviderCrypto")
@js.native
abstract class ProviderCrypto () extends StObject {
  
  def checkAlgorithmName(algorithm: Algorithm): Unit = js.native
  
  def checkAlgorithmParams(algorithm: Algorithm): Unit = js.native
  
  def checkCryptoKey(key: typings.std.CryptoKey): Unit = js.native
  def checkCryptoKey(key: typings.std.CryptoKey, keyUsage: KeyUsage): Unit = js.native
  
  def checkDecrypt(
    algorithm: Algorithm,
    key: typings.std.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: Unit,
    args: Any*
  ): Unit = js.native
  def checkDecrypt(
    algorithm: Algorithm,
    key: typings.std.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: IProviderCheckOptions,
    args: Any*
  ): Unit = js.native
  
  def checkDeriveBits(algorithm: Algorithm, baseKey: typings.std.CryptoKey, length: Double, options: Unit, args: Any*): Unit = js.native
  def checkDeriveBits(
    algorithm: Algorithm,
    baseKey: typings.std.CryptoKey,
    length: Double,
    options: IProviderCheckOptions,
    args: Any*
  ): Unit = js.native
  
  def checkDerivedKeyParams(algorithm: Algorithm): Unit = js.native
  
  def checkDigest(algorithm: Algorithm, data: js.typedarray.ArrayBuffer): Unit = js.native
  
  def checkEncrypt(
    algorithm: Algorithm,
    key: typings.std.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: Unit,
    args: Any*
  ): Unit = js.native
  def checkEncrypt(
    algorithm: Algorithm,
    key: typings.std.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: IProviderCheckOptions,
    args: Any*
  ): Unit = js.native
  
  def checkExportKey(format: KeyFormat, key: typings.std.CryptoKey, args: Any*): Unit = js.native
  
  def checkGenerateKey(algorithm: Algorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): Unit = js.native
  
  def checkGenerateKeyParams(algorithm: Algorithm): Unit = js.native
  
  def checkHashAlgorithm(algorithm: Algorithm, hashAlgorithms: js.Array[String]): Unit = js.native
  
  def checkImportKey(
    format: KeyFormat,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): Unit = js.native
  def checkImportKey(
    format: KeyFormat,
    keyData: JsonWebKey,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): Unit = js.native
  
  def checkImportParams(algorithm: Algorithm): Unit = js.native
  
  def checkKeyData(format: KeyFormat, keyData: Any): Unit = js.native
  
  def checkKeyFormat(format: Any): Unit = js.native
  
  def checkKeyUsages(usages: KeyUsages, allowed: KeyUsages): Unit = js.native
  
  def checkRequiredProperty(data: js.Object, propName: String): Unit = js.native
  
  def checkSign(algorithm: Algorithm, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): Unit = js.native
  
  def checkVerify(
    algorithm: Algorithm,
    key: typings.std.CryptoKey,
    signature: js.typedarray.ArrayBuffer,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): Unit = js.native
  
  def decrypt(
    algorithm: Algorithm,
    key: typings.std.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: Unit,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def decrypt(
    algorithm: Algorithm,
    key: typings.std.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: IProviderCheckOptions,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def deriveBits(algorithm: Algorithm, baseKey: typings.std.CryptoKey, length: Double, options: Unit, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(
    algorithm: Algorithm,
    baseKey: typings.std.CryptoKey,
    length: Double,
    options: IProviderCheckOptions,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def digest(algorithm: Algorithm, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def encrypt(
    algorithm: Algorithm,
    key: typings.std.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: Unit,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def encrypt(
    algorithm: Algorithm,
    key: typings.std.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: IProviderCheckOptions,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def exportKey(format: KeyFormat, key: typings.std.CryptoKey, args: Any*): js.Promise[JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  
  def generateKey(algorithm: AesKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[typings.std.CryptoKey] = js.native
  def generateKey(algorithm: Algorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[CryptoKeyPair | typings.std.CryptoKey] = js.native
  def generateKey(algorithm: EcKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair] = js.native
  def generateKey(algorithm: HmacKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[typings.std.CryptoKey] = js.native
  def generateKey(algorithm: Pbkdf2Params, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[typings.std.CryptoKey] = js.native
  def generateKey(algorithm: RsaHashedKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair] = js.native
  
  def importKey(
    format: KeyFormat,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[typings.std.CryptoKey] = js.native
  def importKey(
    format: KeyFormat,
    keyData: JsonWebKey,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[typings.std.CryptoKey] = js.native
  
  /**
    * Name of the algorithm
    */
  val name: String = js.native
  
  def onDecrypt(algorithm: Algorithm, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onDeriveBits(algorithm: Algorithm, baseKey: typings.std.CryptoKey, length: Double, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onDigest(algorithm: Algorithm, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onEncrypt(algorithm: Algorithm, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onExportKey(format: KeyFormat, key: typings.std.CryptoKey, args: Any*): js.Promise[JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  
  def onGenerateKey(algorithm: Algorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[CryptoKeyPair | typings.std.CryptoKey] = js.native
  
  def onImportKey(
    format: KeyFormat,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[typings.std.CryptoKey] = js.native
  def onImportKey(
    format: KeyFormat,
    keyData: JsonWebKey,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[typings.std.CryptoKey] = js.native
  
  def onSign(algorithm: Algorithm, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onVerify(
    algorithm: Algorithm,
    key: typings.std.CryptoKey,
    signature: js.typedarray.ArrayBuffer,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[Boolean] = js.native
  
  /* protected */ def prepareData(data: Any): js.typedarray.ArrayBuffer = js.native
  
  def sign(algorithm: Algorithm, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Key usages for secret key or key pair
    */
  val usages: ProviderKeyUsages = js.native
  
  def verify(
    algorithm: Algorithm,
    key: typings.std.CryptoKey,
    signature: js.typedarray.ArrayBuffer,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[Boolean] = js.native
}
