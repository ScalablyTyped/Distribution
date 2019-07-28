package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseEnvironmentUpdateMetadata extends js.Object {
  /**
    * Gets or sets comment.
    */
  var comment: String
  /**
    * Gets or sets scheduled deployment time.
    */
  var scheduledDeploymentTime: Date
  /**
    * Gets or sets status of environment.
    */
  var status: EnvironmentStatus
}

object ReleaseEnvironmentUpdateMetadata {
  @scala.inline
  def apply(comment: String, scheduledDeploymentTime: Date, status: EnvironmentStatus): ReleaseEnvironmentUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment, scheduledDeploymentTime = scheduledDeploymentTime, status = status)
  
    __obj.asInstanceOf[ReleaseEnvironmentUpdateMetadata]
  }
}

