package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasPasswordExpirationResult extends js.Object

/** Results of querying on the password expiration information. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult")
@js.native
object EasPasswordExpirationResult extends js.Object {
  /** One or more admins are not allowed to change their passwords. */
  @js.native
  sealed trait adminsCannotChangePassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  /** The computer can be compliant using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  /** The computer is compliant to the policy. */
  @js.native
  sealed trait compliant
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  /** There are other standard users present who are not allowed to change their passwords. */
  @js.native
  sealed trait localControlledUsersCannotChangePassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  /** The EAS password expiration policy cannot be met as the password expiration interval is less than the minimum password interval for the system. */
  @js.native
  sealed trait requestedExpirationIncompatible
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  /** The user is not allowed to change the password. */
  @js.native
  sealed trait userCannotChangePassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  val adminsCannotChangePassword: adminsCannotChangePassword with java.lang.String = js.native
  val canBeCompliant: canBeCompliant with java.lang.String = js.native
  val compliant: compliant with java.lang.String = js.native
  val invalidParameter: invalidParameter with java.lang.String = js.native
  val localControlledUsersCannotChangePassword: localControlledUsersCannotChangePassword with java.lang.String = js.native
  val notEvaluated: notEvaluated with java.lang.String = js.native
  val requestedExpirationIncompatible: requestedExpirationIncompatible with java.lang.String = js.native
  val requestedPolicyIsStricter: requestedPolicyIsStricter with java.lang.String = js.native
  val userCannotChangePassword: userCannotChangePassword with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult with java.lang.String
  ] = js.native
}

