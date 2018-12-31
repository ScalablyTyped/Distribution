package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a certificate chain used for signature verification. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateChain")
@js.native
abstract class CertificateChain () extends js.Object {
  /**
    * Gets the list of certificates from the certificate chain.
    * @param includeRoot True to include the root certificate in the results; otherwise false.
    * @return The list of certificates from the certificate chain.
    */
  def getCertificates(includeRoot: scala.Boolean): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[Certificate] = js.native
  /**
    * Verifies whether or not the certificate chain is valid.
    * @return The result of the certificate chain verification operation.
    */
  def validate(): ChainValidationResult = js.native
  /**
    * Verifies whether or not the certificate chain is valid using the specified validation parameters.
    * @param parameter The validation parameters to use when verifying the certificate chain.
    * @return The result of the certificate chain verification operation.
    */
  def validate(parameter: ChainValidationParameters): ChainValidationResult = js.native
}

