package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyWorkspaceEditResponse extends StObject {
  
  /**
    * Indicates whether the edit was applied or not.
    */
  var applied: Boolean
  
  /**
    * Depending on the client's failure handling strategy `failedChange` might
    * contain the index of the change that failed. This property is only available
    * if the client signals a `failureHandlingStrategy` in its client capabilities.
    */
  var failedChange: js.UndefOr[Double] = js.undefined
  
  /**
    * An optional textual description for why the edit was not applied.
    * This may be used by the server for diagnostic logging or to provide
    * a suitable error for a request that triggered the edit.
    */
  var failureReason: js.UndefOr[String] = js.undefined
}
object ApplyWorkspaceEditResponse {
  
  inline def apply(applied: Boolean): ApplyWorkspaceEditResponse = {
    val __obj = js.Dynamic.literal(applied = applied.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyWorkspaceEditResponse]
  }
  
  extension [Self <: ApplyWorkspaceEditResponse](x: Self) {
    
    inline def setApplied(value: Boolean): Self = StObject.set(x, "applied", value.asInstanceOf[js.Any])
    
    inline def setFailedChange(value: Double): Self = StObject.set(x, "failedChange", value.asInstanceOf[js.Any])
    
    inline def setFailedChangeUndefined: Self = StObject.set(x, "failedChange", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
  }
}
