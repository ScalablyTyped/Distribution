package typings.winrtUwp.Windows.Security.Credentials.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserConsentVerificationResult extends js.Object

/** Describes the result of a biometric (fingerprint) verification operation. */
@JSGlobal("Windows.Security.Credentials.UI.UserConsentVerificationResult")
@js.native
object UserConsentVerificationResult extends js.Object {
  /** The verification operation was canceled. */
  @js.native
  sealed trait canceled extends UserConsentVerificationResult
  
  /** The biometric verifier device is performing an operation and is unavailable. */
  @js.native
  sealed trait deviceBusy extends UserConsentVerificationResult
  
  /** There is no biometric verifier device available. */
  @js.native
  sealed trait deviceNotPresent extends UserConsentVerificationResult
  
  /** Group policy has disabled the biometric verifier device. */
  @js.native
  sealed trait disabledByPolicy extends UserConsentVerificationResult
  
  /** A biometric verifier device is not configured for this user. */
  @js.native
  sealed trait notConfiguredForUser extends UserConsentVerificationResult
  
  /** After 10 attempts, the original verification request and all subsequent attempts at the same verification were not verified. */
  @js.native
  sealed trait retriesExhausted extends UserConsentVerificationResult
  
  /** The fingerprint was verified. */
  @js.native
  sealed trait verified extends UserConsentVerificationResult
  
}

