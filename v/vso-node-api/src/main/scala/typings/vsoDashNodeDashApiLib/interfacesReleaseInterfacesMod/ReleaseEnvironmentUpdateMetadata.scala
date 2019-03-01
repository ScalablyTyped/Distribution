package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseEnvironmentUpdateMetadata extends js.Object {
  /**
    * Gets or sets comment.
    */
  var comment: java.lang.String
  /**
    * Gets or sets scheduled deployment time.
    */
  var scheduledDeploymentTime: stdLib.Date
  /**
    * Gets or sets status of environment.
    */
  var status: EnvironmentStatus
}

object ReleaseEnvironmentUpdateMetadata {
  @scala.inline
  def apply(comment: java.lang.String, scheduledDeploymentTime: stdLib.Date, status: EnvironmentStatus): ReleaseEnvironmentUpdateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("scheduledDeploymentTime")(scheduledDeploymentTime)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ReleaseEnvironmentUpdateMetadata]
  }
}

