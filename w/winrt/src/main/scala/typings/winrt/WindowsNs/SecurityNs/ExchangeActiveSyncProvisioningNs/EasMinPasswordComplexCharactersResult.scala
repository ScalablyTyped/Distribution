package typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMinPasswordComplexCharactersResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult")
@js.native
object EasMinPasswordComplexCharactersResult extends js.Object {
  @js.native
  sealed trait adminsCannotChangePassword extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait adminsHaveBlankPassword extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait canBeCompliant extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait changeConnectedAdminsPassword extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait changeConnectedUserPassword extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait compliant extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait connectedAdminsProviderPolicyIsWeak extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait connectedUserProviderPolicyIsWeak extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait currentUserHasBlankPassword extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait invalidParameter extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait localControlledUsersCannotChangePassword extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait notEvaluated extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait requestedPolicyIsStricter extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait requestedPolicyNotEnforceable extends EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait userCannotChangePassword extends EasMinPasswordComplexCharactersResult
  
  /* 9 */ val adminsCannotChangePassword: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.adminsCannotChangePassword with Double = js.native
  /* 7 */ val adminsHaveBlankPassword: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.adminsHaveBlankPassword with Double = js.native
  /* 2 */ val canBeCompliant: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.canBeCompliant with Double = js.native
  /* 13 */ val changeConnectedAdminsPassword: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.changeConnectedAdminsPassword with Double = js.native
  /* 14 */ val changeConnectedUserPassword: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.changeConnectedUserPassword with Double = js.native
  /* 1 */ val compliant: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.compliant with Double = js.native
  /* 11 */ val connectedAdminsProviderPolicyIsWeak: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.connectedAdminsProviderPolicyIsWeak with Double = js.native
  /* 12 */ val connectedUserProviderPolicyIsWeak: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.connectedUserProviderPolicyIsWeak with Double = js.native
  /* 6 */ val currentUserHasBlankPassword: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.currentUserHasBlankPassword with Double = js.native
  /* 5 */ val invalidParameter: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.invalidParameter with Double = js.native
  /* 10 */ val localControlledUsersCannotChangePassword: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.localControlledUsersCannotChangePassword with Double = js.native
  /* 0 */ val notEvaluated: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.notEvaluated with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.requestedPolicyIsStricter with Double = js.native
  /* 4 */ val requestedPolicyNotEnforceable: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.requestedPolicyNotEnforceable with Double = js.native
  /* 8 */ val userCannotChangePassword: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult.userCannotChangePassword with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMinPasswordComplexCharactersResult with Double] = js.native
}

