package typings.winrtDashUwp.Windows.Security.Credentials.UI

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.canceled
import typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.deviceBusy
import typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.deviceNotPresent
import typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.disabledByPolicy
import typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.notConfiguredForUser
import typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.retriesExhausted
import typings.winrtDashUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.verified
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserConsentVerificationResult with Double] = js.native
  /* 6 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 4 */ @js.native
  object deviceBusy extends TopLevel[deviceBusy with Double]
  
  /* 1 */ @js.native
  object deviceNotPresent extends TopLevel[deviceNotPresent with Double]
  
  /* 3 */ @js.native
  object disabledByPolicy extends TopLevel[disabledByPolicy with Double]
  
  /* 2 */ @js.native
  object notConfiguredForUser extends TopLevel[notConfiguredForUser with Double]
  
  /* 5 */ @js.native
  object retriesExhausted extends TopLevel[retriesExhausted with Double]
  
  /* 0 */ @js.native
  object verified extends TopLevel[verified with Double]
  
}

