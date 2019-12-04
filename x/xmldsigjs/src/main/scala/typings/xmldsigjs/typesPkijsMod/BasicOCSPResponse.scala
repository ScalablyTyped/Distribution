package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.BitString
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import typings.xmldsigjs.Anon_TrustedCerts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "BasicOCSPResponse")
@js.native
class BasicOCSPResponse () extends js.Object {
  def this(params: js.Any) = this()
  var certs: js.UndefOr[js.Array[Certificate]] = js.native
  var signature: BitString = js.native
  var signatureAlgorithm: AlgorithmIdentifier = js.native
  var tbsResponseData: ResponseData = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate Certificate to be checked
    * @param {Certificate} issuerCertificate Certificate of issuer for certificate to be checked
    * @returns {PromiseLike<GetCertificateStatusResult>}
    */
  def getCertificateStatus(certificate: Certificate, issuerCertificate: Certificate): js.Thenable[GetCertificateStatusResult] = js.native
  /**
    * Make signature for current OCSP Basic Response
    * 
    * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
    * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
    * @returns {PromiseLike<ArrayBuffer>}
    */
  def sign(privateKey: CryptoKey): js.Thenable[ArrayBuffer] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[ArrayBuffer] = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
  /**
    * Verify existing OCSP Basic Response
    * 
    * @param {{ trustedCerts?: Certificate[] }} parameters Additional parameters
    * @returns {PromiseLike<boolean>}
    */
  def verify(): js.Thenable[Boolean] = js.native
  def verify(parameters: Anon_TrustedCerts): js.Thenable[Boolean] = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "BasicOCSPResponse")
@js.native
object BasicOCSPResponse extends js.Object {
  /**
    * Compare values with default values for all class members
    * @param {string} memberName String name for a class member
    * @param {*} memberValue Value to compare with default value
    */
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

