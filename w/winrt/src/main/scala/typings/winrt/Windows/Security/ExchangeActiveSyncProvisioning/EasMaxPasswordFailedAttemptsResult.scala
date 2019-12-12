package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.canBeCompliant
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.compliant
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.invalidParameter
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.notEvaluated
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.requestedPolicyIsStricter
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMaxPasswordFailedAttemptsResult with Double] = js.native
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

