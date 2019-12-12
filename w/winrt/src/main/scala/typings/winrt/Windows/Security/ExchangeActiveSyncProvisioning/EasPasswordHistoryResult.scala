package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.canBeCompliant
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.compliant
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.invalidParameter
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.notEvaluated
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.requestedPolicyIsStricter
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasPasswordHistoryResult with Double] = js.native
  /* 2 */ @js.native
  object canBeCompliant extends TopLevel[canBeCompliant with Double]
  
  /* 1 */ @js.native
  object compliant extends TopLevel[compliant with Double]
  
  /* 4 */ @js.native
  object invalidParameter extends TopLevel[invalidParameter with Double]
  
  /* 0 */ @js.native
  object notEvaluated extends TopLevel[notEvaluated with Double]
  
  /* 3 */ @js.native
  object requestedPolicyIsStricter extends TopLevel[requestedPolicyIsStricter with Double]
  
}

