package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseEnvironmentUpdateMetadata extends StObject {
  
  /**
    * Gets or sets comment.
    */
  var comment: String
  
  /**
    * Gets or sets scheduled deployment time.
    */
  var scheduledDeploymentTime: js.Date
  
  /**
    * Gets or sets status of environment.
    */
  var status: EnvironmentStatus
}
object ReleaseEnvironmentUpdateMetadata {
  
  inline def apply(comment: String, scheduledDeploymentTime: js.Date, status: EnvironmentStatus): ReleaseEnvironmentUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], scheduledDeploymentTime = scheduledDeploymentTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentUpdateMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseEnvironmentUpdateMetadata] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setScheduledDeploymentTime(value: js.Date): Self = StObject.set(x, "scheduledDeploymentTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EnvironmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
