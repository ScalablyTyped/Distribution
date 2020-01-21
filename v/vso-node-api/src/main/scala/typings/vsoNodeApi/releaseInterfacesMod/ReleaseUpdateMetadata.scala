package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseUpdateMetadata extends js.Object {
  /**
    * Sets comment for release.
    */
  var comment: String
  /**
    * Set 'true' to exclude the release from retention policies.
    */
  var keepForever: Boolean
  /**
    * Sets list of manual environments.
    */
  var manualEnvironments: js.Array[String]
  /**
    * Sets status of the release.
    */
  var status: ReleaseStatus
}

object ReleaseUpdateMetadata {
  @scala.inline
  def apply(comment: String, keepForever: Boolean, manualEnvironments: js.Array[String], status: ReleaseStatus): ReleaseUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], keepForever = keepForever.asInstanceOf[js.Any], manualEnvironments = manualEnvironments.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseUpdateMetadata]
  }
}

