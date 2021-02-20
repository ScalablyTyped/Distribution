package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasMaxInactivityTimeLockResult extends StObject
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult")
@js.native
object EasMaxInactivityTimeLockResult extends StObject {
  
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
