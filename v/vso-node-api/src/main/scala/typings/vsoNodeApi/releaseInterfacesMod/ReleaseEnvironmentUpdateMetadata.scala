package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseEnvironmentUpdateMetadata extends js.Object {
  
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
  implicit class ReleaseEnvironmentUpdateMetadataOps[Self <: ReleaseEnvironmentUpdateMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledDeploymentTime(value: Date): Self = this.set("scheduledDeploymentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: EnvironmentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
