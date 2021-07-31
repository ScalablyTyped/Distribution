package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasMaxInactivityTimeLockResult extends StObject
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult")
@js.native
object EasMaxInactivityTimeLockResult extends StObject {
  
  @js.native
  sealed trait canBeCompliant
    extends StObject
       with EasMaxInactivityTimeLockResult
  
  @js.native
  sealed trait compliant
    extends StObject
       with EasMaxInactivityTimeLockResult
  
  @js.native
  sealed trait invalidParameter
    extends StObject
       with EasMaxInactivityTimeLockResult
  
  @js.native
  sealed trait notEvaluated
    extends StObject
       with EasMaxInactivityTimeLockResult
  
  @js.native
  sealed trait requestedPolicyIsStricter
    extends StObject
       with EasMaxInactivityTimeLockResult
}
