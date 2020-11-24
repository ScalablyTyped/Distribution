package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
