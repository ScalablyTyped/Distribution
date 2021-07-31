package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasPasswordHistoryResult extends StObject
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult")
@js.native
object EasPasswordHistoryResult extends StObject {
  
  @js.native
  sealed trait canBeCompliant
    extends StObject
       with EasPasswordHistoryResult
  
  @js.native
  sealed trait compliant
    extends StObject
       with EasPasswordHistoryResult
  
  @js.native
  sealed trait invalidParameter
    extends StObject
       with EasPasswordHistoryResult
  
  @js.native
  sealed trait notEvaluated
    extends StObject
       with EasPasswordHistoryResult
  
  @js.native
  sealed trait requestedPolicyIsStricter
    extends StObject
       with EasPasswordHistoryResult
}
