package typings.winrtUwp.Windows.Security.Credentials

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of the KeyCredential.GetAttestationAsync method. */
trait KeyCredentialAttestationResult extends js.Object {
  /** Gets the attestation information for the KeyCredential. */
  var attestationBuffer: IBuffer
  /** Gets the chain of certificates used to verify the attestation. */
  var certificateChainBuffer: IBuffer
  /** Gets the status of the key credential attestation. */
  var status: KeyCredentialAttestationStatus
}

object KeyCredentialAttestationResult {
  @scala.inline
  def apply(
    attestationBuffer: IBuffer,
    certificateChainBuffer: IBuffer,
    status: KeyCredentialAttestationStatus
  ): KeyCredentialAttestationResult = {
    val __obj = js.Dynamic.literal(attestationBuffer = attestationBuffer.asInstanceOf[js.Any], certificateChainBuffer = certificateChainBuffer.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCredentialAttestationResult]
  }
}

