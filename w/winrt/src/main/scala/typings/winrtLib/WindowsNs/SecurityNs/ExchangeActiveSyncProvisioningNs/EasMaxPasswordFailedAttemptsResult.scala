package typings
package winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMaxPasswordFailedAttemptsResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult")
@js.native
object EasMaxPasswordFailedAttemptsResult extends js.Object {
  @js.native
  sealed trait canBeCompliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult
  
  @js.native
  sealed trait compliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult
  
  @js.native
  sealed trait invalidParameter
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult
  
  @js.native
  sealed trait notEvaluated
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult
  
  @js.native
  sealed trait requestedPolicyIsStricter
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult
  
  val canBeCompliant: canBeCompliant with java.lang.String = js.native
  val compliant: compliant with java.lang.String = js.native
  val invalidParameter: invalidParameter with java.lang.String = js.native
  val notEvaluated: notEvaluated with java.lang.String = js.native
  val requestedPolicyIsStricter: requestedPolicyIsStricter with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult with java.lang.String
  ] = js.native
}

