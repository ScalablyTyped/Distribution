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
  
  @scala.inline
  def apply(comment: String, status: ManualInterventionStatus): ManualInterventionUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualInterventionUpdateMetadata]
  }
  
  @scala.inline
  implicit class ManualInterventionUpdateMetadataMutableBuilder[Self <: ManualInterventionUpdateMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ManualInterventionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
