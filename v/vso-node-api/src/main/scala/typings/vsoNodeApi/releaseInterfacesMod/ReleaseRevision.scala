package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseRevision extends js.Object {
  var changeDetails: String = js.native
  var changeType: String = js.native
  var changedBy: IdentityRef = js.native
  var changedDate: Date = js.native
  var comment: String = js.native
  var definitionSnapshotRevision: Double = js.native
  var releaseId: Double = js.native
}

object ReleaseRevision {
  @scala.inline
  def apply(
    changeDetails: String,
    changeType: String,
    changedBy: IdentityRef,
    changedDate: Date,
    comment: String,
    definitionSnapshotRevision: Double,
    releaseId: Double
  ): ReleaseRevision = {
    val __obj = js.Dynamic.literal(changeDetails = changeDetails.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], definitionSnapshotRevision = definitionSnapshotRevision.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseRevision]
  }
  @scala.inline
  implicit class ReleaseRevisionOps[Self <: ReleaseRevision] (val x: Self) extends AnyVal {
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
    def setChangeDetails(value: String): Self = this.set("changeDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeType(value: String): Self = this.set("changeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedBy(value: IdentityRef): Self = this.set("changedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedDate(value: Date): Self = this.set("changedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionSnapshotRevision(value: Double): Self = this.set("definitionSnapshotRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseId(value: Double): Self = this.set("releaseId", value.asInstanceOf[js.Any])
  }
  
}

