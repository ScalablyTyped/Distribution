package typings.xmldsigjs.typesPkijsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "CertificateChainValidationEngine")
@js.native
/**
  * Constructor for CertificateChainValidationEngine class
  * @param {*} [parameters={}]
  * @property {any} [schema] asn1js parsed value
  */
class CertificateChainValidationEngine () extends js.Object {
  def this(parameters: js.Any) = this()
  var certs: js.Array[Certificate] = js.native
  var checkDate: Date = js.native
  var crls: js.Array[CertificateRevocationList] = js.native
  var ocsp: OCSPResponse = js.native
  var trustedCerts: js.Array[Certificate] = js.native
  def sort(): js.Any = js.native
  /**
    * Major verification function for certificate chain.
    * @param {{initialPolicySet, initialExplicitPolicy, initialPolicyMappingInhibit, initialInhibitPolicy, initialPermittedSubtreesSet, initialExcludedSubtreesSet, initialRequiredNameForms}} [parameters]
    * @returns {PromiseLike<any>}
    */
  def verify(): js.Thenable[_] = js.native
  def verify(parameters: js.Any): js.Thenable[_] = js.native
}

