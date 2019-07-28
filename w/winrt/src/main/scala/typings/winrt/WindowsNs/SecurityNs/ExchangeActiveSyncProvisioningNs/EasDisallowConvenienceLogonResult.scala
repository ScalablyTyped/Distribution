package typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasDisallowConvenienceLogonResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult")
@js.native
object EasDisallowConvenienceLogonResult extends js.Object {
  @js.native
  sealed trait canBeCompliant extends EasDisallowConvenienceLogonResult
  
  @js.native
  sealed trait compliant extends EasDisallowConvenienceLogonResult
  
  @js.native
  sealed trait notEvaluated extends EasDisallowConvenienceLogonResult
  
  @js.native
  sealed trait requestedPolicyIsStricter extends EasDisallowConvenienceLogonResult
  
  /* 2 */ val canBeCompliant: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasDisallowConvenienceLogonResult.canBeCompliant with Double = js.native
  /* 1 */ val compliant: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasDisallowConvenienceLogonResult.compliant with Double = js.native
  /* 0 */ val notEvaluated: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasDisallowConvenienceLogonResult.notEvaluated with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasDisallowConvenienceLogonResult.requestedPolicyIsStricter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasDisallowConvenienceLogonResult with Double] = js.native
}

