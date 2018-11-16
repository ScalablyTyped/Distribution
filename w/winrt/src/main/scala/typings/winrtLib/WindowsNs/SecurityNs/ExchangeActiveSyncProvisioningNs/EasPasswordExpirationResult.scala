package typings
package winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasPasswordExpirationResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult")
@js.native
object EasPasswordExpirationResult extends js.Object {
  @js.native
  sealed trait adminsCannotChangePassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  @js.native
  sealed trait canBeCompliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  @js.native
  sealed trait compliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  @js.native
  sealed trait invalidParameter
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  @js.native
  sealed trait localControlledUsersCannotChangePassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  @js.native
  sealed trait notEvaluated
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  @js.native
  sealed trait requestedExpirationIncompatible
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  @js.native
  sealed trait requestedPolicyIsStricter
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
  @js.native
  sealed trait userCannotChangePassword
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult
  
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
    winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordExpirationResult with java.lang.String
  ] = js.native
}

