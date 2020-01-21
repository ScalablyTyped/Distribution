package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingWorkItemLink extends js.Object {
  var changedBy: IdentityRef
  var changedDate: Date
  var changedOperation: LinkChangeType
  var comment: String
  var isActive: Boolean
  var linkType: String
  var rel: String
  var sourceId: Double
  var targetId: Double
}

object ReportingWorkItemLink {
  @scala.inline
  def apply(
    changedBy: IdentityRef,
    changedDate: Date,
    changedOperation: LinkChangeType,
    comment: String,
    isActive: Boolean,
    linkType: String,
    rel: String,
    sourceId: Double,
    targetId: Double
  ): ReportingWorkItemLink = {
    val __obj = js.Dynamic.literal(changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], changedOperation = changedOperation.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportingWorkItemLink]
  }
}

