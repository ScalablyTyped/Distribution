package typings.webcryptoCore.mod

import typings.std.Algorithm
import typings.std.EcKeyImportParams
import typings.std.KeyUsage
import typings.std.RsaHashedImportParams
import typings.webcryptoCore.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def isJWK(data: Any): /* is std.JsonWebKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJWK")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.JsonWebKey */ Boolean]

type DesImportParams = Algorithm

type HexString = String

type ImportAlgorithms = Algorithm | RsaHashedImportParams | EcKeyImportParams

type KeyAlgorithm = Algorithm

type KeyUsages = js.Array[KeyUsage]

type NativeCrypto = typings.std.Crypto

type NativeCryptoKey = typings.std.CryptoKey

type NativeSubtleCrypto = typings.std.SubtleCrypto

type ParametersType = js.typedarray.ArrayBuffer | Null

type ProviderKeyUsage = KeyUsages

type ProviderKeyUsages = ProviderKeyUsage | ProviderKeyPairUsage

type RsaSsaParams = Algorithm

/**
  * ASN.1
  * ```
  * CurvePrivateKey ::= OCTET STRING
  * ```
  *
  * JSON
  * ```json
  * {
  *   "d": "base64url"
  * }
  * ```
  */
/* was `typeof CurvePrivateKey` */
type index2CurvePrivateKey = CurvePrivateKey

/* was `typeof EcDsaSignature` */
type index2EcDsaSignature = EcDsaSignature

/* was `typeof EcPrivateKey` */
type index2EcPrivateKey = EcPrivateKey

/* was `typeof EcPublicKey` */
type index2EcPublicKey = EcPublicKey

/* was `typeof EdPrivateKey` */
type index2EdPrivateKey = EdPrivateKey

/* was `typeof EdPublicKey` */
type index2EdPublicKey = EdPublicKey

/* was `typeof ObjectIdentifier` */
type index2ObjectIdentifier = ObjectIdentifier

/**
  * ```asn
  * OneAsymmetricKey ::= SEQUENCE {
  *   version Version,
  *   privateKeyAlgorithm PrivateKeyAlgorithmIdentifier,
  *   privateKey PrivateKey,
  *   attributes [0] IMPLICIT Attributes OPTIONAL,
  *   ...,
  *   [[2: publicKey [1] IMPLICIT PublicKey OPTIONAL ]],
  *   ...
  * }
  *
  * PrivateKey ::= OCTET STRING
  *
  * PublicKey ::= BIT STRING
  * ```
  */
/* was `typeof OneAsymmetricKey` */
type index2OneAsymmetricKey = OneAsymmetricKey

type index2ParametersType = ParametersType

/* was `typeof PrivateKeyInfo` */
type index2PrivateKeyInfo = PrivateKeyInfo

/* was `typeof PublicKeyInfo` */
type index2PublicKeyInfo = PublicKeyInfo

/* was `typeof RsaPrivateKey` */
type index2RsaPrivateKey = RsaPrivateKey

/* was `typeof RsaPublicKey` */
type index2RsaPublicKey = RsaPublicKey
