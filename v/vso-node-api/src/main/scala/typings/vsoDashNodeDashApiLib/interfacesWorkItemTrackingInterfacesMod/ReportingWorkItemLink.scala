package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingWorkItemLink extends js.Object {
  var changedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var changedDate: stdLib.Date
  var changedOperation: LinkChangeType
  var comment: java.lang.String
  var isActive: scala.Boolean
  var linkType: java.lang.String
  var rel: java.lang.String
  var sourceId: scala.Double
  var targetId: scala.Double
}

object ReportingWorkItemLink {
  @scala.inline
  def apply(
    changedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    changedDate: stdLib.Date,
    changedOperation: LinkChangeType,
    comment: java.lang.String,
    isActive: scala.Boolean,
    linkType: java.lang.String,
    rel: java.lang.String,
    sourceId: scala.Double,
    targetId: scala.Double
  ): ReportingWorkItemLink = {
    val __obj = js.Dynamic.literal(changedBy = changedBy, changedDate = changedDate, changedOperation = changedOperation, comment = comment, isActive = isActive, linkType = linkType, rel = rel, sourceId = sourceId, targetId = targetId)
  
    __obj.asInstanceOf[ReportingWorkItemLink]
  }
}

