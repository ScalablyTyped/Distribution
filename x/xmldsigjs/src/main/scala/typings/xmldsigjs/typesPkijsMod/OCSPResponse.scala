package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.Enumerated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "OCSPResponse")
@js.native
class OCSPResponse () extends js.Object {
  def this(params: js.Any) = this()
  var responseBytes: js.UndefOr[ResponseBytes] = js.native
  var responseStatus: Enumerated = js.native
  /**
    * Making OCSP Request for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: Certificate, parameters: CreateFroCertificateParams): js.Thenable[Unit] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate
    * @param {Certificate} issuerCertificate
    * @returns {*}
    */
  def getCertificateStatus(certificate: Certificate, issuerCertificate: Certificate): js.Thenable[GetCertificateStatusResult] = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "OCSPResponse")
@js.native
object OCSPResponse extends js.Object {
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

