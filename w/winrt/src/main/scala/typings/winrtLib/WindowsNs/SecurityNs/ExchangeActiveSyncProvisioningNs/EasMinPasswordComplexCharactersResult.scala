package typings
package winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMinPasswordComplexCharactersResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult")
@js.native
object EasMinPasswordComplexCharactersResult extends js.Object {
  @js.native
  sealed trait adminsCannotChangePassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait adminsHaveBlankPassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait canBeCompliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait changeConnectedAdminsPassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait changeConnectedUserPassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait compliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait connectedAdminsProviderPolicyIsWeak
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait connectedUserProviderPolicyIsWeak
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait currentUserHasBlankPassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait invalidParameter
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait localControlledUsersCannotChangePassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait notEvaluated
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait requestedPolicyIsStricter
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait requestedPolicyNotEnforceable
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait userCannotChangePassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult
  
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
    winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordComplexCharactersResult with scala.Double
  ] = js.native
}

