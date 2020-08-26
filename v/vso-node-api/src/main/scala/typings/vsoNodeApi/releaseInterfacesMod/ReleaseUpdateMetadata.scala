package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseUpdateMetadata extends js.Object {
  /**
    * Sets comment for release.
    */
  var comment: String = js.native
  /**
    * Set 'true' to exclude the release from retention policies.
    */
  var keepForever: Boolean = js.native
  /**
    * Sets list of manual environments.
    */
  var manualEnvironments: js.Array[String] = js.native
  /**
    * Sets status of the release.
    */
  var status: ReleaseStatus = js.native
}

object ReleaseUpdateMetadata {
  @scala.inline
  def apply(comment: String, keepForever: Boolean, manualEnvironments: js.Array[String], status: ReleaseStatus): ReleaseUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], keepForever = keepForever.asInstanceOf[js.Any], manualEnvironments = manualEnvironments.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseUpdateMetadata]
  }
  @scala.inline
  implicit class ReleaseUpdateMetadataOps[Self <: ReleaseUpdateMetadata] (val x: Self) extends AnyVal {
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
    def setKeepForever(value: Boolean): Self = this.set("keepForever", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualEnvironmentsVarargs(value: String*): Self = this.set("manualEnvironments", js.Array(value :_*))
    @scala.inline
    def setManualEnvironments(value: js.Array[String]): Self = this.set("manualEnvironments", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ReleaseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

