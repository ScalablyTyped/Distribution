package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves a persisted key from a Certificate object. */
@JSGlobal("Windows.Security.Cryptography.Core.PersistedKeyProvider")
@js.native
abstract class PersistedKeyProvider () extends js.Object

/** Retrieves a persisted key from a Certificate object. */
@JSGlobal("Windows.Security.Cryptography.Core.PersistedKeyProvider")
@js.native
object PersistedKeyProvider extends js.Object {
  /**
    * Opens the persisted private key from the specified Certificate object.
    * @param certificate The certificate that is associated with the private key.
    * @param hashAlgorithmName The hash algorithm for signature operations. For encryption, the hash algorithm is ignored.
    * @param padding The padding mode for asymmetric algorithm signature or encryption operations.
    * @return An asynchronous operation for retrieving a private key from the supplied Certificate object.
    */
  def openKeyPairFromCertificateAsync(
    certificate: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate,
    hashAlgorithmName: java.lang.String,
    padding: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPadding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey] = js.native
  /**
    * Opens the persisted public key from the specified Certificate object.
    * @param certificate The certificate that contains the public key.
    * @param hashAlgorithmName The has algorithm for signature operations.
    * @param padding The padding mode for asymmetric algorithm signature or encryption operations.
    * @return The public key retrieved from the supplied Certificate object.
    */
  def openPublicKeyFromCertificate(
    certificate: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate,
    hashAlgorithmName: java.lang.String,
    padding: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPadding
  ): winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey = js.native
}

