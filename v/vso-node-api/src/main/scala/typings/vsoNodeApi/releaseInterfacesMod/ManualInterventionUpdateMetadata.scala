package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualInterventionUpdateMetadata extends StObject {
  
  /**
    * Sets the comment for manual intervention update.
    */
  var comment: String
  
  /**
    * Sets the status of the manual intervention.
    */
  var status: ManualInterventionStatus
}
object ManualInterventionUpdateMetadata {
  
  inline def apply(comment: String, status: ManualInterventionStatus): ManualInterventionUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualInterventionUpdateMetadata]
  }
  
  extension [Self <: ManualInterventionUpdateMetadata](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ManualInterventionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
