package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportingWorkItemLink extends js.Object {
  
  var changedBy: IdentityRef = js.native
  
  var changedDate: Date = js.native
  
  var changedOperation: LinkChangeType = js.native
  
  var comment: String = js.native
  
  var isActive: Boolean = js.native
  
  var linkType: String = js.native
  
  var rel: String = js.native
  
  var sourceId: Double = js.native
  
  var targetId: Double = js.native
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
  
  @scala.inline
  implicit class ReportingWorkItemLinkOps[Self <: ReportingWorkItemLink] (val x: Self) extends AnyVal {
    
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
    def setChangedBy(value: IdentityRef): Self = this.set("changedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedDate(value: Date): Self = this.set("changedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedOperation(value: LinkChangeType): Self = this.set("changedOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkType(value: String): Self = this.set("linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceId(value: Double): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: Double): Self = this.set("targetId", value.asInstanceOf[js.Any])
  }
}
