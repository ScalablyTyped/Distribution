package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseEnvironmentUpdateMetadata extends StObject {
  
  /**
    * Gets or sets comment.
    */
  var comment: String = js.native
  
  /**
    * Gets or sets scheduled deployment time.
    */
  var scheduledDeploymentTime: Date = js.native
  
  /**
    * Gets or sets status of environment.
    */
  var status: EnvironmentStatus = js.native
}
object ReleaseEnvironmentUpdateMetadata {
  
  @scala.inline
  def apply(comment: String, scheduledDeploymentTime: Date, status: EnvironmentStatus): ReleaseEnvironmentUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], scheduledDeploymentTime = scheduledDeploymentTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentUpdateMetadata]
  }
  
  @scala.inline
  implicit class ReleaseEnvironmentUpdateMetadataMutableBuilder[Self <: ReleaseEnvironmentUpdateMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledDeploymentTime(value: Date): Self = StObject.set(x, "scheduledDeploymentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: EnvironmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
