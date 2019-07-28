package typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMaxPasswordFailedAttemptsResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult")
@js.native
object EasMaxPasswordFailedAttemptsResult extends js.Object {
  @js.native
  sealed trait canBeCompliant extends EasMaxPasswordFailedAttemptsResult
  
  @js.native
  sealed trait compliant extends EasMaxPasswordFailedAttemptsResult
  
  @js.native
  sealed trait invalidParameter extends EasMaxPasswordFailedAttemptsResult
  
  @js.native
  sealed trait notEvaluated extends EasMaxPasswordFailedAttemptsResult
  
  @js.native
  sealed trait requestedPolicyIsStricter extends EasMaxPasswordFailedAttemptsResult
  
  /* 2 */ val canBeCompliant: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult.canBeCompliant with Double = js.native
  /* 1 */ val compliant: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult.compliant with Double = js.native
  /* 4 */ val invalidParameter: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult.invalidParameter with Double = js.native
  /* 0 */ val notEvaluated: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult.notEvaluated with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult.requestedPolicyIsStricter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMaxPasswordFailedAttemptsResult with Double] = js.native
}

