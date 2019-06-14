package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMinPasswordComplexCharactersResult extends js.Object

/** Represents the minimum complexity result for passwords. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult")
@js.native
object EasMinPasswordComplexCharactersResult extends js.Object {
  /** One or more admins are not allowed to change their passwords. */
  @js.native
  sealed trait adminsCannotChangePassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** The EAS password policies cannot be evaluated as one or more admins have blank passwords. */
  @js.native
  sealed trait adminsHaveBlankPassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** There is at least one administrator whose connected account password must be changed for EAS password policy compliance. */
  @js.native
  sealed trait changeConnectedAdminsPassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** The connected account password for the current user must be changed for EAS password policy compliance. */
  @js.native
  sealed trait changeConnectedUserPassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** This computer is compliant to the policy. */
  @js.native
  sealed trait compliant
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** The EAS password policy cannot be enforced by the connected account provider of at least one administrator. */
  @js.native
  sealed trait connectedAdminsProviderPolicyIsWeak
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** The EAS password policy cannot be enforced by the connected account provider of the current user. */
  @js.native
  sealed trait connectedUserProviderPolicyIsWeak
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** The EAS password policies for the user cannot be evaluated as the user has a blank password. */
  @js.native
  sealed trait currentUserHasBlankPassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** There are other standard users present who are not allowed to change their passwords. */
  @js.native
  sealed trait localControlledUsersCannotChangePassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** The EAS policy being evaluated cannot be enforced by the system. */
  @js.native
  sealed trait requestedPolicyNotEnforceable
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /** The user is not allowed to change the password. */
  @js.native
  sealed trait userCannotChangePassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  /* 9 */ val adminsCannotChangePassword: adminsCannotChangePassword with scala.Double = js.native
  /* 7 */ val adminsHaveBlankPassword: adminsHaveBlankPassword with scala.Double = js.native
  /* 2 */ val canBeCompliant: canBeCompliant with scala.Double = js.native
  /* 13 */ val changeConnectedAdminsPassword: changeConnectedAdminsPassword with scala.Double = js.native
  /* 14 */ val changeConnectedUserPassword: changeConnectedUserPassword with scala.Double = js.native
  /* 1 */ val compliant: compliant with scala.Double = js.native
  /* 11 */ val connectedAdminsProviderPolicyIsWeak: connectedAdminsProviderPolicyIsWeak with scala.Double = js.native
  /* 12 */ val connectedUserProviderPolicyIsWeak: connectedUserProviderPolicyIsWeak with scala.Double = js.native
  /* 6 */ val currentUserHasBlankPassword: currentUserHasBlankPassword with scala.Double = js.native
  /* 5 */ val invalidParameter: invalidParameter with scala.Double = js.native
  /* 10 */ val localControlledUsersCannotChangePassword: localControlledUsersCannotChangePassword with scala.Double = js.native
  /* 0 */ val notEvaluated: notEvaluated with scala.Double = js.native
  /* 3 */ val requestedPolicyIsStricter: requestedPolicyIsStricter with scala.Double = js.native
  /* 4 */ val requestedPolicyNotEnforceable: requestedPolicyNotEnforceable with scala.Double = js.native
  /* 8 */ val userCannotChangePassword: userCannotChangePassword with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult with scala.Double
  ] = js.native
}

