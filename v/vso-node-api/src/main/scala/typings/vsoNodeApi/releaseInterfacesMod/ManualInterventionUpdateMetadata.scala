package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualInterventionUpdateMetadata extends js.Object {
  /**
    * Sets the comment for manual intervention update.
    */
  var comment: String = js.native
  /**
    * Sets the status of the manual intervention.
    */
  var status: ManualInterventionStatus = js.native
}

object ManualInterventionUpdateMetadata {
  @scala.inline
  def apply(comment: String, status: ManualInterventionStatus): ManualInterventionUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualInterventionUpdateMetadata]
  }
  @scala.inline
  implicit class ManualInterventionUpdateMetadataOps[Self <: ManualInterventionUpdateMetadata] (val x: Self) extends AnyVal {
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
    def setStatus(value: ManualInterventionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

