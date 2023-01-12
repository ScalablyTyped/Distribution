package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.uinteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyWorkspaceEditResult extends StObject {
  
  /**
    * Indicates whether the edit was applied or not.
    */
  var applied: Boolean
  
  /**
    * Depending on the client's failure handling strategy `failedChange` might
    * contain the index of the change that failed. This property is only available
    * if the client signals a `failureHandlingStrategy` in its client capabilities.
    */
  var failedChange: js.UndefOr[uinteger] = js.undefined
  
  /**
    * An optional textual description for why the edit was not applied.
    * This may be used by the server for diagnostic logging or to provide
    * a suitable error for a request that triggered the edit.
    */
  var failureReason: js.UndefOr[String] = js.undefined
}
object ApplyWorkspaceEditResult {
  
  inline def apply(applied: Boolean): ApplyWorkspaceEditResult = {
    val __obj = js.Dynamic.literal(applied = applied.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyWorkspaceEditResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplyWorkspaceEditResult] (val x: Self) extends AnyVal {
    
    inline def setApplied(value: Boolean): Self = StObject.set(x, "applied", value.asInstanceOf[js.Any])
    
    inline def setFailedChange(value: uinteger): Self = StObject.set(x, "failedChange", value.asInstanceOf[js.Any])
    
    inline def setFailedChangeUndefined: Self = StObject.set(x, "failedChange", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
  }
}
