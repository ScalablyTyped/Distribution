package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMinPasswordLengthResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult")
@js.native
object EasMinPasswordLengthResult extends js.Object {
  @js.native
  sealed trait adminsCannotChangePassword extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait adminsHaveBlankPassword extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait canBeCompliant extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait changeConnectedAdminsPassword extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait changeConnectedUserPassword extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait compliant extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait connectedAdminsProviderPolicyIsWeak extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait connectedUserProviderPolicyIsWeak extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait currentUserHasBlankPassword extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait invalidParameter extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait localControlledUsersCannotChangePassword extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait notEvaluated extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait requestedPolicyIsStricter extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait requestedPolicyNotEnforceable extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait userCannotChangePassword extends EasMinPasswordLengthResult
  
  /* 9 */ val adminsCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.adminsCannotChangePassword with Double = js.native
  /* 7 */ val adminsHaveBlankPassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.adminsHaveBlankPassword with Double = js.native
  /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.canBeCompliant with Double = js.native
  /* 13 */ val changeConnectedAdminsPassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.changeConnectedAdminsPassword with Double = js.native
  /* 14 */ val changeConnectedUserPassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.changeConnectedUserPassword with Double = js.native
  /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.compliant with Double = js.native
  /* 11 */ val connectedAdminsProviderPolicyIsWeak: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.connectedAdminsProviderPolicyIsWeak with Double = js.native
  /* 12 */ val connectedUserProviderPolicyIsWeak: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.connectedUserProviderPolicyIsWeak with Double = js.native
  /* 6 */ val currentUserHasBlankPassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.currentUserHasBlankPassword with Double = js.native
  /* 5 */ val invalidParameter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.invalidParameter with Double = js.native
  /* 10 */ val localControlledUsersCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.localControlledUsersCannotChangePassword with Double = js.native
  /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.notEvaluated with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.requestedPolicyIsStricter with Double = js.native
  /* 4 */ val requestedPolicyNotEnforceable: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.requestedPolicyNotEnforceable with Double = js.native
  /* 8 */ val userCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.userCannotChangePassword with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMinPasswordLengthResult with Double] = js.native
}

