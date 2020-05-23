package typings.winrtUwp.Windows.Security.Credentials.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserConsentVerifierAvailability extends js.Object

/** Describes the result of a check for a biometric (fingerprint) verifier device. */
@JSGlobal("Windows.Security.Credentials.UI.UserConsentVerifierAvailability")
@js.native
object UserConsentVerifierAvailability extends js.Object {
  /** A biometric verifier device is available. */
  @js.native
  sealed trait available extends UserConsentVerifierAvailability
  
  /** The biometric verifier device is performing an operation and is unavailable. */
  @js.native
  sealed trait deviceBusy extends UserConsentVerifierAvailability
  
  /** There is no biometric verifier device available. */
  @js.native
  sealed trait deviceNotPresent extends UserConsentVerifierAvailability
  
  /** Group policy has disabled the biometric verifier device. */
  @js.native
  sealed trait disabledByPolicy extends UserConsentVerifierAvailability
  
  /** A biometric verifier device is not configured for this user. */
  @js.native
  sealed trait notConfiguredForUser extends UserConsentVerifierAvailability
  
}

