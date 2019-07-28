package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(changeDetails = changeDetails, changeType = changeType, changedBy = changedBy, changedDate = changedDate, comment = comment, definitionSnapshotRevision = definitionSnapshotRevision, releaseId = releaseId)
  
    __obj.asInstanceOf[ReleaseRevision]
  }
}

