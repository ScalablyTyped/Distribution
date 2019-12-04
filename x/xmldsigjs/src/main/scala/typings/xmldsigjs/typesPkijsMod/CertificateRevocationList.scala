package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.BitString
import typings.asn1js.asn1jsMod.Sequence
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import typings.xmldsigjs.Anon_IssuerCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "CertificateRevocationList")
@js.native
class CertificateRevocationList () extends js.Object {
  def this(params: js.Any) = this()
  var crlExtension: js.UndefOr[js.Array[Extension]] = js.native
  var issuer: RelativeDistinguishedNames = js.native
  var nextUpdate: js.UndefOr[Time] = js.native
  var revokedCertificates: js.UndefOr[js.Array[RevokedCertificate]] = js.native
  var signature: AlgorithmIdentifier = js.native
  var signatureAlgorithm: AlgorithmIdentifier = js.native
  var signatureValue: BitString = js.native
  var tbs: ArrayBuffer = js.native
  var thisUpdate: Time = js.native
  var version: js.UndefOr[Double] = js.native
  def encodeTBS(): Sequence = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def isCertificateRevoked(certificate: Certificate): Boolean = js.native
  /**
    * Make a signature for existing CRL data
    * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
    * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
    */
  def sign(privateKey: CryptoKey): js.Thenable[ArrayBuffer] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[ArrayBuffer] = js.native
  def toJSON(): js.Any = js.native
  /**
    * Convert current object to asn1js object and set correct values
    * 
    * @param {boolean} [encodeFlag]
    * @returns {*}
    */
  def toSchema(): js.Any = js.native
  def toSchema(encodeFlag: Boolean): js.Any = js.native
  /**
    * Verify existing signature
    * @param {{[issuerCertificate]: Certificate, [publicKeyInfo]: PublicKeyInfo}} parameters
    * @returns {*}
    */
  def verify(parameters: Anon_IssuerCertificate): js.Thenable[Boolean] = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "CertificateRevocationList")
@js.native
object CertificateRevocationList extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

