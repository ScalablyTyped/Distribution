package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "KeyInfoX509Data")
@js.native
class KeyInfoX509Data () extends KeyInfoClause {
  def this(cert: X509Certificate) = this()
  def this(rgbCert: stdLib.Uint8Array) = this()
  def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
  /**
    * Gets or sets the Certificate Revocation List (CRL) contained within the KeyInfoX509Data object.
    */
  var CRL: stdLib.Uint8Array | scala.Null = js.native
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
  val SubjectKeyIds: js.Array[stdLib.Uint8Array] = js.native
  /**
    * Gets a list of the subject names of the entities contained in the KeyInfoX509Data object.
    */
  val SubjectNames: js.Array[java.lang.String] = js.native
  /**
    * Adds the specified X.509v3 certificate to the KeyInfoX509Data.
    * @param  {X509Certificate} certificate
    * @returns void
    */
  def AddCertificate(certificate: X509Certificate): scala.Unit = js.native
  /**
    * Adds the specified issuer name and serial number pair to the KeyInfoX509Data object.
    * @param  {string} issuerName
    * @param  {string} serialNumber
    * @returns void
    */
  def AddIssuerSerial(issuerName: java.lang.String, serialNumber: java.lang.String): scala.Unit = js.native
  /**
    * Adds the specified subject key identifier (SKI) to the KeyInfoX509Data object.
    * @param  {string | Uint8Array} subjectKeyId
    * @returns void
    */
  def AddSubjectKeyId(subjectKeyId: java.lang.String): scala.Unit = js.native
  def AddSubjectKeyId(subjectKeyId: stdLib.Uint8Array): scala.Unit = js.native
  /**
    * Adds the subject name of the entity that was issued an X.509v3 certificate to the KeyInfoX509Data object.
    * @param  {string} subjectName
    * @returns void
    */
  def AddSubjectName(subjectName: java.lang.String): scala.Unit = js.native
}

