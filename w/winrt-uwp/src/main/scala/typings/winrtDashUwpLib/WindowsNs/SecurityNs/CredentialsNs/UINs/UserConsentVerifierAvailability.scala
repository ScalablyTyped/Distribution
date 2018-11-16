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
  
  val available: available with java.lang.String = js.native
  val deviceBusy: deviceBusy with java.lang.String = js.native
  val deviceNotPresent: deviceNotPresent with java.lang.String = js.native
  val disabledByPolicy: disabledByPolicy with java.lang.String = js.native
  val notConfiguredForUser: notConfiguredForUser with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerifierAvailability with java.lang.String
  ] = js.native
}

