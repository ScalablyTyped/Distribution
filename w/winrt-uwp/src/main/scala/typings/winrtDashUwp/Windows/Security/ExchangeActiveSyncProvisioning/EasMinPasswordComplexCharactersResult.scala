package typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning

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
  sealed trait adminsCannotChangePassword extends EasMinPasswordComplexCharactersResult
  
  /** The EAS password policies cannot be evaluated as one or more admins have blank passwords. */
  @js.native
  sealed trait adminsHaveBlankPassword extends EasMinPasswordComplexCharactersResult
  
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant extends EasMinPasswordComplexCharactersResult
  
  /** There is at least one administrator whose connected account password must be changed for EAS password policy compliance. */
  @js.native
  sealed trait changeConnectedAdminsPassword extends EasMinPasswordComplexCharactersResult
  
  /** The connected account password for the current user must be changed for EAS password policy compliance. */
  @js.native
  sealed trait changeConnectedUserPassword extends EasMinPasswordComplexCharactersResult
  
  /** This computer is compliant to the policy. */
  @js.native
  sealed trait compliant extends EasMinPasswordComplexCharactersResult
  
  /** The EAS password policy cannot be enforced by the connected account provider of at least one administrator. */
  @js.native
  sealed trait connectedAdminsProviderPolicyIsWeak extends EasMinPasswordComplexCharactersResult
  
  /** The EAS password policy cannot be enforced by the connected account provider of the current user. */
  @js.native
  sealed trait connectedUserProviderPolicyIsWeak extends EasMinPasswordComplexCharactersResult
  
  /** The EAS password policies for the user cannot be evaluated as the user has a blank password. */
  @js.native
  sealed trait currentUserHasBlankPassword extends EasMinPasswordComplexCharactersResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter extends EasMinPasswordComplexCharactersResult
  
  /** There are other standard users present who are not allowed to change their passwords. */
  @js.native
  sealed trait localControlledUsersCannotChangePassword extends EasMinPasswordComplexCharactersResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated extends EasMinPasswordComplexCharactersResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter extends EasMinPasswordComplexCharactersResult
  
  /** The EAS policy being evaluated cannot be enforced by the system. */
  @js.native
  sealed trait requestedPolicyNotEnforceable extends EasMinPasswordComplexCharactersResult
  
  /** The user is not allowed to change the password. */
  @js.native
  sealed trait userCannotChangePassword extends EasMinPasswordComplexCharactersResult
  
  /* 9 */ val adminsCannotChangePassword: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.adminsCannotChangePassword with Double = js.native
  /* 7 */ val adminsHaveBlankPassword: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.adminsHaveBlankPassword with Double = js.native
  /* 2 */ val canBeCompliant: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.canBeCompliant with Double = js.native
  /* 13 */ val changeConnectedAdminsPassword: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.changeConnectedAdminsPassword with Double = js.native
  /* 14 */ val changeConnectedUserPassword: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.changeConnectedUserPassword with Double = js.native
  /* 1 */ val compliant: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.compliant with Double = js.native
  /* 11 */ val connectedAdminsProviderPolicyIsWeak: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.connectedAdminsProviderPolicyIsWeak with Double = js.native
  /* 12 */ val connectedUserProviderPolicyIsWeak: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.connectedUserProviderPolicyIsWeak with Double = js.native
  /* 6 */ val currentUserHasBlankPassword: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.currentUserHasBlankPassword with Double = js.native
  /* 5 */ val invalidParameter: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.invalidParameter with Double = js.native
  /* 10 */ val localControlledUsersCannotChangePassword: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.localControlledUsersCannotChangePassword with Double = js.native
  /* 0 */ val notEvaluated: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.notEvaluated with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.requestedPolicyIsStricter with Double = js.native
  /* 4 */ val requestedPolicyNotEnforceable: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.requestedPolicyNotEnforceable with Double = js.native
  /* 8 */ val userCannotChangePassword: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.userCannotChangePassword with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMinPasswordComplexCharactersResult with Double] = js.native
}

