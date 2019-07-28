package typings.xmldsigjs.xmldsigjsMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "KeyInfoX509Data")
@js.native
class KeyInfoX509Data () extends KeyInfoClause {
  def this(cert: X509Certificate) = this()
  def this(rgbCert: Uint8Array) = this()
  def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
  /**
    * Gets or sets the Certificate Revocation List (CRL) contained within the KeyInfoX509Data object.
    */
  var CRL: Uint8Array | Null = js.native
  /**
    * Gets a list of the X.509v3 certificates contained in the KeyInfoX509Data object.
    */
  val Certificates: js.Array[X509Certificate] = js.native
  /**
    * Gets a list of X509IssuerSerial structures that represent an issuer name and serial number pair.
    */
  val IssuerSerials: js.Array[IX509IssuerSerial] = js.native
  /**
    * Gets a list of the subject key identifiers (SKIs) contained in the KeyInfoX509Data object.
    */
  val SubjectKeyIds: js.Array[Uint8Array] = js.native
  /**
    * Gets a list of the subject names of the entities contained in the KeyInfoX509Data object.
    */
  val SubjectNames: js.Array[String] = js.native
  /**
    * Adds the specified X.509v3 certificate to the KeyInfoX509Data.
    * @param  {X509Certificate} certificate
    * @returns void
    */
  def AddCertificate(certificate: X509Certificate): Unit = js.native
  /**
    * Adds the specified issuer name and serial number pair to the KeyInfoX509Data object.
    * @param  {string} issuerName
    * @param  {string} serialNumber
    * @returns void
    */
  def AddIssuerSerial(issuerName: String, serialNumber: String): Unit = js.native
  /**
    * Adds the specified subject key identifier (SKI) to the KeyInfoX509Data object.
    * @param  {string | Uint8Array} subjectKeyId
    * @returns void
    */
  def AddSubjectKeyId(subjectKeyId: String): Unit = js.native
  def AddSubjectKeyId(subjectKeyId: Uint8Array): Unit = js.native
  /**
    * Adds the subject name of the entity that was issued an X.509v3 certificate to the KeyInfoX509Data object.
    * @param  {string} subjectName
    * @returns void
    */
  def AddSubjectName(subjectName: String): Unit = js.native
}

