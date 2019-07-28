package typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

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
  sealed trait adminsCannotChangePassword extends EasMinPasswordLengthResult
  
  /** The EAS password policies cannot be evaluated as one or more admins have blank passwords. */
  @js.native
  sealed trait adminsHaveBlankPassword extends EasMinPasswordLengthResult
  
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant extends EasMinPasswordLengthResult
  
  /** There is at least one administrator whose connected account password must be changed for EAS password policy compliance. */
  @js.native
  sealed trait changeConnectedAdminsPassword extends EasMinPasswordLengthResult
  
  /** The connected account password for the current user must be changed for EAS password policy compliance. */
  @js.native
  sealed trait changeConnectedUserPassword extends EasMinPasswordLengthResult
  
  /** This computer is compliant to the policy. */
  @js.native
  sealed trait compliant extends EasMinPasswordLengthResult
  
  /** The EAS password policy cannot be enforced by the connected account provider of at least one administrator. */
  @js.native
  sealed trait connectedAdminsProviderPolicyIsWeak extends EasMinPasswordLengthResult
  
  /** The EAS password policy cannot be enforced by the connected account provider of the current user. */
  @js.native
  sealed trait connectedUserProviderPolicyIsWeak extends EasMinPasswordLengthResult
  
  /** The EAS password policies for the user cannot be evaluated as the user has a blank password. */
  @js.native
  sealed trait currentUserHasBlankPassword extends EasMinPasswordLengthResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter extends EasMinPasswordLengthResult
  
  /** There are other standard users present who are not allowed to change their passwords. */
  @js.native
  sealed trait localControlledUsersCannotChangePassword extends EasMinPasswordLengthResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated extends EasMinPasswordLengthResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter extends EasMinPasswordLengthResult
  
  /** The EAS policy being evaluated cannot be enforced by the system. */
  @js.native
  sealed trait requestedPolicyNotEnforceable extends EasMinPasswordLengthResult
  
  /** The user is not allowed to change the password. */
  @js.native
  sealed trait userCannotChangePassword extends EasMinPasswordLengthResult
  
  /* 9 */ val adminsCannotChangePassword: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.adminsCannotChangePassword with Double = js.native
  /* 7 */ val adminsHaveBlankPassword: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.adminsHaveBlankPassword with Double = js.native
  /* 2 */ val canBeCompliant: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.canBeCompliant with Double = js.native
  /* 13 */ val changeConnectedAdminsPassword: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.changeConnectedAdminsPassword with Double = js.native
  /* 14 */ val changeConnectedUserPassword: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.changeConnectedUserPassword with Double = js.native
  /* 1 */ val compliant: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.compliant with Double = js.native
  /* 11 */ val connectedAdminsProviderPolicyIsWeak: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.connectedAdminsProviderPolicyIsWeak with Double = js.native
  /* 12 */ val connectedUserProviderPolicyIsWeak: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.connectedUserProviderPolicyIsWeak with Double = js.native
  /* 6 */ val currentUserHasBlankPassword: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.currentUserHasBlankPassword with Double = js.native
  /* 5 */ val invalidParameter: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.invalidParameter with Double = js.native
  /* 10 */ val localControlledUsersCannotChangePassword: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.localControlledUsersCannotChangePassword with Double = js.native
  /* 0 */ val notEvaluated: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.notEvaluated with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.requestedPolicyIsStricter with Double = js.native
  /* 4 */ val requestedPolicyNotEnforceable: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.requestedPolicyNotEnforceable with Double = js.native
  /* 8 */ val userCannotChangePassword: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult.userCannotChangePassword with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMinPasswordLengthResult with Double] = js.native
}

