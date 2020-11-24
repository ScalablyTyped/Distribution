package typings.winrtUwp.global.Windows.Security.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents key credential attestation statuses. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialAttestationStatus")
@js.native
object KeyCredentialAttestationStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus with Double
  ] = js.native
  
  /* 2 */ val notSupported: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus.notSupported with Double = js.native
  
  /* 0 */ val success: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus.success with Double = js.native
  
  /* 3 */ val temporaryFailure: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus.temporaryFailure with Double = js.native
  
  /* 1 */ val unknownError: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus.unknownError with Double = js.native
}
