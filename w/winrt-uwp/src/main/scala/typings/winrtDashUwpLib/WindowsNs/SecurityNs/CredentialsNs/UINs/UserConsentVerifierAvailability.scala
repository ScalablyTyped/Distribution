package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs

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
  sealed trait available
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerifierAvailability
  
  /** The biometric verifier device is performing an operation and is unavailable. */
  @js.native
  sealed trait deviceBusy
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerifierAvailability
  
  /** There is no biometric verifier device available. */
  @js.native
  sealed trait deviceNotPresent
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerifierAvailability
  
  /** Group policy has disabled the biometric verifier device. */
  @js.native
  sealed trait disabledByPolicy
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerifierAvailability
  
  /** A biometric verifier device is not configured for this user. */
  @js.native
  sealed trait notConfiguredForUser
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerifierAvailability
  
  /* 0 */ val available: available with scala.Double = js.native
  /* 4 */ val deviceBusy: deviceBusy with scala.Double = js.native
  /* 1 */ val deviceNotPresent: deviceNotPresent with scala.Double = js.native
  /* 3 */ val disabledByPolicy: disabledByPolicy with scala.Double = js.native
  /* 2 */ val notConfiguredForUser: notConfiguredForUser with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerifierAvailability with scala.Double
  ] = js.native
}

