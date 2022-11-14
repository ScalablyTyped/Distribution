package typings.tabris

import typings.tabris.anon.Hash
import typings.tabris.anon.Iv
import typings.tabris.anon.Length
import typings.tabris.anon.NamedCurve
import typings.tabris.anon.PrivateKey
import typings.tabris.anon.Public
import typings.tabris.anon.`20`
import typings.tabris.tabrisStrings.HKDF
import typings.tabris.tabrisStrings.`AES-GCM`
import typings.tabris.tabrisStrings.`SHA-1`
import typings.tabris.tabrisStrings.`SHA-256`
import typings.tabris.tabrisStrings.`SHA-384`
import typings.tabris.tabrisStrings.`SHA-512`
import typings.tabris.tabrisStrings.pkcs8
import typings.tabris.tabrisStrings.raw
import typings.tabris.tabrisStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// SubtleCrypto
/**
  * Provides a subset of the [cryptographic
  * functions](https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto) in the SubtleCrypto W3C
  * standard.
  */
@js.native
trait SubtleCrypto extends StObject {
  
  /**
    * Decrypts the given raw data. Currently only supports the AES-GCM algorithm.
    * @param algorithm
    * @param key
    * @param data
    */
  def decrypt(algorithm: Iv, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def decrypt(algorithm: Iv, key: CryptoKey, data: TypedArray): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Takes a base key and derives an array of bits from it using the HKDF algorithm.
    * @param algorithm
    * @param baseKey
    * @param length
    */
  def deriveBits(algorithm: Hash, baseKey: CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /**
    * Takes a base key and derives an array of bits from it using the Elliptic Curve Diffie-Hellman (ECDH)
    * algorithm.
    * @param algorithm
    * @param baseKey
    * @param length
    */
  def deriveBits(algorithm: Public, baseKey: CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Takes a base key and derives a secret key from it using the HKDF algorithm.
    * @param algorithm
    * @param baseKey
    * @param derivedKeyAlgorithm
    * @param extractable
    * @param keyUsages
    */
  def deriveKey(
    algorithm: Hash,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: Length,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Promise[CryptoKey] = js.native
  /**
    * Takes a base key and derives a secret key from it using the Elliptic Curve Diffie-Hellman (ECDH)
    * algorithm.
    * @param algorithm
    * @param baseKey
    * @param derivedKeyAlgorithm
    * @param extractable
    * @param keyUsages
    */
  def deriveKey(
    algorithm: Public,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: Length,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Promise[CryptoKey] = js.native
  
  def digest(algorithm: `SHA-1` | `SHA-256` | `SHA-384` | `SHA-512`, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /**
    * Provides the digest value of the given data as an ArrayBuffer. Fo this the method uses the hashing
    * algorithms provided by the operating system.
    * @param algorithm A string defining the hash function to use.
    * @param data The data to be digested.
    */
  def digest(algorithm: `SHA-1` | `SHA-256` | `SHA-384` | `SHA-512`, data: TypedArray): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Encrypts the given raw data. Currently only supports the AES-GCM algorithm.
    * @param algorithm
    * @param key
    * @param data
    */
  def encrypt(algorithm: Iv, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def encrypt(algorithm: Iv, key: CryptoKey, data: TypedArray): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Converts a CryptoKey instances into a portable format. To export a key, the key must have extractable
    * set to true. Supports the spki format or raw bytes.
    * @param format
    * @param key
    */
  def exportKey(format: raw | spki, key: CryptoKey): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Generates new keys. Currently only supports the Elliptic Curve Diffie-Hellman (ECDH) algorithm to
    * generate key pairs.
    * @param algorithm
    * @param extractable
    * @param keyUsages
    */
  def generateKey(algorithm: NamedCurve, extractable: Boolean, keyUsages: js.Array[String]): js.Promise[PrivateKey] = js.native
  
  def importKey(
    format: spki | pkcs8 | raw,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: HKDF | `AES-GCM`,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Promise[CryptoKey] = js.native
  /**
    * Takes an external key in a portable format and returns a CryptoKey object that can be used with the
    * SubtleCrypto API. Keys may be in spki or pkcs8 format.
    * @param format
    * @param keyData
    * @param algorithm
    * @param extractable
    * @param keyUsages
    */
  def importKey(
    format: spki | pkcs8 | raw,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: NamedCurve,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: spki | pkcs8 | raw,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: `20`,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: spki | pkcs8 | raw,
    keyData: TypedArray,
    algorithm: HKDF | `AES-GCM`,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: spki | pkcs8 | raw,
    keyData: TypedArray,
    algorithm: NamedCurve,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: spki | pkcs8 | raw,
    keyData: TypedArray,
    algorithm: `20`,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Promise[CryptoKey] = js.native
}
