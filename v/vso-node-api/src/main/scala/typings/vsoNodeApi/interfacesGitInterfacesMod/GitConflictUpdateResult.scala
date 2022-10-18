package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitConflictUpdateResult extends StObject {
  
  /**
    * Conflict ID that was provided by input
    */
  var conflictId: Double
  
  /**
    * Reason for failing
    */
  var customMessage: String
  
  /**
    * Status of the update on the server
    */
  var updateStatus: GitConflictUpdateStatus
  
  /**
    * New state of the conflict after updating
    */
  var updatedConflict: GitConflict
}
object GitConflictUpdateResult {
  
  inline def apply(
    conflictId: Double,
    customMessage: String,
    updateStatus: GitConflictUpdateStatus,
    updatedConflict: GitConflict
  ): GitConflictUpdateResult = {
    val __obj = js.Dynamic.literal(conflictId = conflictId.asInstanceOf[js.Any], customMessage = customMessage.asInstanceOf[js.Any], updateStatus = updateStatus.asInstanceOf[js.Any], updatedConflict = updatedConflict.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConflictUpdateResult]
  }
  
  extension [Self <: GitConflictUpdateResult](x: Self) {
    
    inline def setConflictId(value: Double): Self = StObject.set(x, "conflictId", value.asInstanceOf[js.Any])
    
    inline def setCustomMessage(value: String): Self = StObject.set(x, "customMessage", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatus(value: GitConflictUpdateStatus): Self = StObject.set(x, "updateStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdatedConflict(value: GitConflict): Self = StObject.set(x, "updatedConflict", value.asInstanceOf[js.Any])
  }
}
