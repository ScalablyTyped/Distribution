package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to key attestation methods. */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyAttestationHelper")
@js.native
abstract class KeyAttestationHelper () extends js.Object

/** Provides access to key attestation methods. */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyAttestationHelper")
@js.native
object KeyAttestationHelper extends js.Object {
  /**
                       * Decrypts a TPM key attestation credential.
                       * @param credential The TPM key attestation credential to decrypt.
                       * @return When this method completes, it returns the decrypted TPM key attestation credential.
                       */
  def decryptTpmAttestationCredentialAsync(credential: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
                       * Decrypts a TPM key attestation credential.
                       * @param credential The TPM key attestation credential to decrypt.
                       * @param containerName The container name of the credential.
                       * @return When this method completes, it returns the decrypted TPM key attestation credential.
                       */
  def decryptTpmAttestationCredentialAsync(credential: java.lang.String, containerName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
                       * Gets the credential ID from a TPM key attestation credential.
                       * @param credential The TPM key attestation credential to get the credential ID from.
                       * @return The credential ID from the TPM key attestation credential.
                       */
  def getTpmAttestationCredentialId(credential: java.lang.String): java.lang.String = js.native
}

