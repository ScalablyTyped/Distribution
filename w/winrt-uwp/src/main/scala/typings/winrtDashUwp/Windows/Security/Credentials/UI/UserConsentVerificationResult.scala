package typings.winrtDashUwp.Windows.Security.Credentials.UI

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
  
  /* 6 */ val canceled: typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.canceled with Double = js.native
  /* 4 */ val deviceBusy: typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.deviceBusy with Double = js.native
  /* 1 */ val deviceNotPresent: typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.deviceNotPresent with Double = js.native
  /* 3 */ val disabledByPolicy: typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.disabledByPolicy with Double = js.native
  /* 2 */ val notConfiguredForUser: typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.notConfiguredForUser with Double = js.native
  /* 5 */ val retriesExhausted: typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.retriesExhausted with Double = js.native
  /* 0 */ val verified: typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.verified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserConsentVerificationResult with Double] = js.native
}

