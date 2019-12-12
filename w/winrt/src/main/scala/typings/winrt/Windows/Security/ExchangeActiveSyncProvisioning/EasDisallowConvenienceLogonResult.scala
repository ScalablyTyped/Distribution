package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.canBeCompliant
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.compliant
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.notEvaluated
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.requestedPolicyIsStricter
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasDisallowConvenienceLogonResult with Double] = js.native
  /* 2 */ @js.native
  object canBeCompliant extends TopLevel[canBeCompliant with Double]
  
  /* 1 */ @js.native
  object compliant extends TopLevel[compliant with Double]
  
  /* 0 */ @js.native
  object notEvaluated extends TopLevel[notEvaluated with Double]
  
  /* 3 */ @js.native
  object requestedPolicyIsStricter extends TopLevel[requestedPolicyIsStricter with Double]
  
}

