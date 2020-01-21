package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseRevision extends js.Object {
  var changeDetails: String
  var changeType: String
  var changedBy: IdentityRef
  var changedDate: Date
  var comment: String
  var definitionSnapshotRevision: Double
  var releaseId: Double
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
}

