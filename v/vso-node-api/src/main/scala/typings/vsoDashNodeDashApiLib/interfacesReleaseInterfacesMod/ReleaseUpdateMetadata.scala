package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseUpdateMetadata extends js.Object {
  /**
    * Sets comment for release.
    */
  var comment: java.lang.String
  /**
    * Set 'true' to exclude the release from retention policies.
    */
  var keepForever: scala.Boolean
  /**
    * Sets list of manual environments.
    */
  var manualEnvironments: js.Array[java.lang.String]
  /**
    * Sets status of the release.
    */
  var status: ReleaseStatus
}

object ReleaseUpdateMetadata {
  @scala.inline
  def apply(
    comment: java.lang.String,
    keepForever: scala.Boolean,
    manualEnvironments: js.Array[java.lang.String],
    status: ReleaseStatus
  ): ReleaseUpdateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("keepForever")(keepForever)
    __obj.updateDynamic("manualEnvironments")(manualEnvironments)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ReleaseUpdateMetadata]
  }
}

