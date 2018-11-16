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
  
  val canceled: canceled with java.lang.String = js.native
  val deviceBusy: deviceBusy with java.lang.String = js.native
  val deviceNotPresent: deviceNotPresent with java.lang.String = js.native
  val disabledByPolicy: disabledByPolicy with java.lang.String = js.native
  val notConfiguredForUser: notConfiguredForUser with java.lang.String = js.native
  val retriesExhausted: retriesExhausted with java.lang.String = js.native
  val verified: verified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerificationResult with java.lang.String
  ] = js.native
}

