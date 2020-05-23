package typings.winrtUwp.global.Windows.Security.Credentials

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of the KeyCredential.GetAttestationAsync method. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialAttestationResult")
@js.native
abstract class KeyCredentialAttestationResult ()
  extends typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationResult {
  /** Gets the attestation information for the KeyCredential. */
  /* CompleteClass */
  override var attestationBuffer: IBuffer = js.native
  /** Gets the chain of certificates used to verify the attestation. */
  /* CompleteClass */
  override var certificateChainBuffer: IBuffer = js.native
  /** Gets the status of the key credential attestation. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus = js.native
}

