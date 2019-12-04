package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.Integer
import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "CertID")
@js.native
class CertID () extends js.Object {
  def this(params: js.Any) = this()
  var hashAlgorithm: AlgorithmIdentifier = js.native
  var issuerKeyHash: OctetString = js.native
  var issuerNameHash: OctetString = js.native
  var serialNumber: Integer = js.native
  /**
    * Making OCSP certificate identifier for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: Certificate, parameters: CreateFroCertificateParams): js.Thenable[Unit] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Check that two "CertIDs" are equal
    * @param {CertID} certificateID Identifier of the certificate to be checked
    * @returns {boolean}
    */
  def isEqual(certificateID: CertID): Boolean = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "CertID")
@js.native
object CertID extends js.Object {
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

