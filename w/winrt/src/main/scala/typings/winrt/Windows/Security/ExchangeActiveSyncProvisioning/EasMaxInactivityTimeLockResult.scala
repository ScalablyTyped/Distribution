package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMaxInactivityTimeLockResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult")
@js.native
object EasMaxInactivityTimeLockResult extends js.Object {
  @js.native
  sealed trait canBeCompliant extends EasMaxInactivityTimeLockResult
  
  @js.native
  sealed trait compliant extends EasMaxInactivityTimeLockResult
  
  @js.native
  sealed trait invalidParameter extends EasMaxInactivityTimeLockResult
  
  @js.native
  sealed trait notEvaluated extends EasMaxInactivityTimeLockResult
  
  @js.native
  sealed trait requestedPolicyIsStricter extends EasMaxInactivityTimeLockResult
  
  /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.canBeCompliant with Double = js.native
  /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.compliant with Double = js.native
  /* 4 */ val invalidParameter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.invalidParameter with Double = js.native
  /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.notEvaluated with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.requestedPolicyIsStricter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMaxInactivityTimeLockResult with Double] = js.native
}

