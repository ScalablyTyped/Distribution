package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Storage.Provider.CachedFileTarget
import typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details about the cached file operation that invoked the trigger. */
trait CachedFileUpdaterTriggerDetails extends StObject {
  
  /** Gets whether the system can display UI allowing the user to launch provider app in response to the cached file updater trigger. */
  var canRequestUserInput: Boolean
  
  /** Gets the FileUpdateRequest object associated with the cached file update. */
  var updateRequest: FileUpdateRequest
  
  /** Gets the CachedFileTarget object associated with cached file update that indicates whether the local or remote file should be updated. */
  var updateTarget: CachedFileTarget
}
object CachedFileUpdaterTriggerDetails {
  
  inline def apply(canRequestUserInput: Boolean, updateRequest: FileUpdateRequest, updateTarget: CachedFileTarget): CachedFileUpdaterTriggerDetails = {
    val __obj = js.Dynamic.literal(canRequestUserInput = canRequestUserInput.asInstanceOf[js.Any], updateRequest = updateRequest.asInstanceOf[js.Any], updateTarget = updateTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedFileUpdaterTriggerDetails]
  }
  
  extension [Self <: CachedFileUpdaterTriggerDetails](x: Self) {
    
    inline def setCanRequestUserInput(value: Boolean): Self = StObject.set(x, "canRequestUserInput", value.asInstanceOf[js.Any])
    
    inline def setUpdateRequest(value: FileUpdateRequest): Self = StObject.set(x, "updateRequest", value.asInstanceOf[js.Any])
    
    inline def setUpdateTarget(value: CachedFileTarget): Self = StObject.set(x, "updateTarget", value.asInstanceOf[js.Any])
  }
}
