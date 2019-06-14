package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs

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
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerificationResult
  
  /** The biometric verifier device is performing an operation and is unavailable. */
  @js.native
  sealed trait deviceBusy
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerificationResult
  
  /** There is no biometric verifier device available. */
  @js.native
  sealed trait deviceNotPresent
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerificationResult
  
  /** Group policy has disabled the biometric verifier device. */
  @js.native
  sealed trait disabledByPolicy
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerificationResult
  
  /** A biometric verifier device is not configured for this user. */
  @js.native
  sealed trait notConfiguredForUser
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerificationResult
  
  /** After 10 attempts, the original verification request and all subsequent attempts at the same verification were not verified. */
  @js.native
  sealed trait retriesExhausted
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerificationResult
  
  /** The fingerprint was verified. */
  @js.native
  sealed trait verified
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerificationResult
  
  /* 6 */ val canceled: canceled with scala.Double = js.native
  /* 4 */ val deviceBusy: deviceBusy with scala.Double = js.native
  /* 1 */ val deviceNotPresent: deviceNotPresent with scala.Double = js.native
  /* 3 */ val disabledByPolicy: disabledByPolicy with scala.Double = js.native
  /* 2 */ val notConfiguredForUser: notConfiguredForUser with scala.Double = js.native
  /* 5 */ val retriesExhausted: retriesExhausted with scala.Double = js.native
  /* 0 */ val verified: verified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerificationResult with scala.Double
  ] = js.native
}

