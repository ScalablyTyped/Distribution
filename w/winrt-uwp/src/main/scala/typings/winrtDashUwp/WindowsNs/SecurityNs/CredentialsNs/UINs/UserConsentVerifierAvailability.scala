package typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.UINs

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
  
  /* 0 */ val available: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerifierAvailability.available with Double = js.native
  /* 4 */ val deviceBusy: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerifierAvailability.deviceBusy with Double = js.native
  /* 1 */ val deviceNotPresent: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerifierAvailability.deviceNotPresent with Double = js.native
  /* 3 */ val disabledByPolicy: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerifierAvailability.disabledByPolicy with Double = js.native
  /* 2 */ val notConfiguredForUser: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.UINs.UserConsentVerifierAvailability.notConfiguredForUser with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserConsentVerifierAvailability with Double] = js.native
}

