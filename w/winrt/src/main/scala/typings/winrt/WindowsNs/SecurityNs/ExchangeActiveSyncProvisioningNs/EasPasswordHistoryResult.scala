package typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasPasswordHistoryResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult")
@js.native
object EasPasswordHistoryResult extends js.Object {
  @js.native
  sealed trait canBeCompliant extends EasPasswordHistoryResult
  
  @js.native
  sealed trait compliant extends EasPasswordHistoryResult
  
  @js.native
  sealed trait invalidParameter extends EasPasswordHistoryResult
  
  @js.native
  sealed trait notEvaluated extends EasPasswordHistoryResult
  
  @js.native
  sealed trait requestedPolicyIsStricter extends EasPasswordHistoryResult
  
  /* 2 */ val canBeCompliant: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordHistoryResult.canBeCompliant with Double = js.native
  /* 1 */ val compliant: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordHistoryResult.compliant with Double = js.native
  /* 4 */ val invalidParameter: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordHistoryResult.invalidParameter with Double = js.native
  /* 0 */ val notEvaluated: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordHistoryResult.notEvaluated with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasPasswordHistoryResult.requestedPolicyIsStricter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasPasswordHistoryResult with Double] = js.native
}

