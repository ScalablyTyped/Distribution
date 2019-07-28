package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(changedBy = changedBy, changedDate = changedDate, changedOperation = changedOperation, comment = comment, isActive = isActive, linkType = linkType, rel = rel, sourceId = sourceId, targetId = targetId)
  
    __obj.asInstanceOf[ReportingWorkItemLink]
  }
}

