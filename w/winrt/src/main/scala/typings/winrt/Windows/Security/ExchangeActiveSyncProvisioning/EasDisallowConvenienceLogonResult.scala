package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

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
  
  /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.canBeCompliant with Double = js.native
  /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.compliant with Double = js.native
  /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.notEvaluated with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.requestedPolicyIsStricter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasDisallowConvenienceLogonResult with Double] = js.native
}

