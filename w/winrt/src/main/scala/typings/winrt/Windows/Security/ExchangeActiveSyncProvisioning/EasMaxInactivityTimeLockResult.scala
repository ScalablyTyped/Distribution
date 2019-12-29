package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMaxInactivityTimeLockResult with Double] = js.native
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

