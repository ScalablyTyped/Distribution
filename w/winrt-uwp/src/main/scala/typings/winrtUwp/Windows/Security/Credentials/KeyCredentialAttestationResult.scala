package typings.winrtUwp.Windows.Security.Credentials

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of the KeyCredential.GetAttestationAsync method. */
@js.native
trait KeyCredentialAttestationResult extends js.Object {
  /** Gets the attestation information for the KeyCredential. */
  var attestationBuffer: IBuffer = js.native
  /** Gets the chain of certificates used to verify the attestation. */
  var certificateChainBuffer: IBuffer = js.native
  /** Gets the status of the key credential attestation. */
  var status: KeyCredentialAttestationStatus = js.native
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
  @scala.inline
  implicit class KeyCredentialAttestationResultOps[Self <: KeyCredentialAttestationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttestationBuffer(value: IBuffer): Self = this.set("attestationBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateChainBuffer(value: IBuffer): Self = this.set("certificateChainBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: KeyCredentialAttestationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

