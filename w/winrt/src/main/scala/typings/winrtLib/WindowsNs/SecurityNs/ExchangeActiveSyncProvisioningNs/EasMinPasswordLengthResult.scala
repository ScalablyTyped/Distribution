package typings
package winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMinPasswordLengthResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult")
@js.native
object EasMinPasswordLengthResult extends js.Object {
  @js.native
  sealed trait adminsCannotChangePassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait adminsHaveBlankPassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait canBeCompliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait changeConnectedAdminsPassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait changeConnectedUserPassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait compliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait connectedAdminsProviderPolicyIsWeak
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait connectedUserProviderPolicyIsWeak
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait currentUserHasBlankPassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait invalidParameter
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait localControlledUsersCannotChangePassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait notEvaluated
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait requestedPolicyIsStricter
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait requestedPolicyNotEnforceable
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
  @js.native
  sealed trait userCannotChangePassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult
  
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
    winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMinPasswordLengthResult with java.lang.String
  ] = js.native
}

