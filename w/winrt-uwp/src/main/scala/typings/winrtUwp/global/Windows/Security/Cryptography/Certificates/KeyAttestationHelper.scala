package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to key attestation methods. */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyAttestationHelper")
@js.native
abstract class KeyAttestationHelper ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyAttestationHelper
/* static members */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyAttestationHelper")
@js.native
object KeyAttestationHelper extends js.Object {
  
  /**
    * Decrypts a TPM key attestation credential.
    * @param credential The TPM key attestation credential to decrypt.
    * @return When this method completes, it returns the decrypted TPM key attestation credential.
    */
  def decryptTpmAttestationCredentialAsync(credential: String): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Decrypts a TPM key attestation credential.
    * @param credential The TPM key attestation credential to decrypt.
    * @param containerName The container name of the credential.
    * @return When this method completes, it returns the decrypted TPM key attestation credential.
    */
  def decryptTpmAttestationCredentialAsync(credential: String, containerName: String): IPromiseWithIAsyncOperation[String] = js.native
  
  /**
    * Gets the credential ID from a TPM key attestation credential.
    * @param credential The TPM key attestation credential to get the credential ID from.
    * @return The credential ID from the TPM key attestation credential.
    */
  def getTpmAttestationCredentialId(credential: String): String = js.native
}
