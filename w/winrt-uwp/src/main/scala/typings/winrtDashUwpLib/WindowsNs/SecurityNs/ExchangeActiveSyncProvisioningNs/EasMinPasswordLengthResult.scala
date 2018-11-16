package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMinPasswordLengthResult extends js.Object

/** Represents the minimum length result for passwords. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult")
@js.native
object EasMinPasswordLengthResult extends js.Object {
  /** One or more admins are not allowed to change their passwords. */
  @js.native
  sealed trait adminsCannotChangePassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** The EAS password policies cannot be evaluated as one or more admins have blank passwords. */
  @js.native
  sealed trait adminsHaveBlankPassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** There is at least one administrator whose connected account password must be changed for EAS password policy compliance. */
  @js.native
  sealed trait changeConnectedAdminsPassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** The connected account password for the current user must be changed for EAS password policy compliance. */
  @js.native
  sealed trait changeConnectedUserPassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** This computer is compliant to the policy. */
  @js.native
  sealed trait compliant
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** The EAS password policy cannot be enforced by the connected account provider of at least one administrator. */
  @js.native
  sealed trait connectedAdminsProviderPolicyIsWeak
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** The EAS password policy cannot be enforced by the connected account provider of the current user. */
  @js.native
  sealed trait connectedUserProviderPolicyIsWeak
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** The EAS password policies for the user cannot be evaluated as the user has a blank password. */
  @js.native
  sealed trait currentUserHasBlankPassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** There are other standard users present who are not allowed to change their passwords. */
  @js.native
  sealed trait localControlledUsersCannotChangePassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** The EAS policy being evaluated cannot be enforced by the system. */
  @js.native
  sealed trait requestedPolicyNotEnforceable
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  /** The user is not allowed to change the password. */
  @js.native
  sealed trait userCannotChangePassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  val adminsCannotChangePassword: adminsCannotChangePassword with java.lang.String = js.native
  val adminsHaveBlankPassword: adminsHaveBlankPassword with java.lang.String = js.native
  val canBeCompliant: canBeCompliant with java.lang.String = js.native
  val changeConnectedAdminsPassword: changeConnectedAdminsPassword with java.lang.String = js.native
  val changeConnectedUserPassword: changeConnectedUserPassword with java.lang.String = js.native
  val compliant: compliant with java.lang.String = js.native
  val connectedAdminsProviderPolicyIsWeak: connectedAdminsProviderPolicyIsWeak with java.lang.String = js.native
  val connectedUserProviderPolicyIsWeak: connectedUserProviderPolicyIsWeak with java.lang.String = js.native
  val currentUserHasBlankPassword: currentUserHasBlankPassword with java.lang.String = js.native
  val invalidParameter: invalidParameter with java.lang.String = js.native
  val localControlledUsersCannotChangePassword: localControlledUsersCannotChangePassword with java.lang.String = js.native
  val notEvaluated: notEvaluated with java.lang.String = js.native
  val requestedPolicyIsStricter: requestedPolicyIsStricter with java.lang.String = js.native
  val requestedPolicyNotEnforceable: requestedPolicyNotEnforceable with java.lang.String = js.native
  val userCannotChangePassword: userCannotChangePassword with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult with java.lang.String
  ] = js.native
}

