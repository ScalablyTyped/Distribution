package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportingWorkItemLink extends StObject {
  
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
  implicit class ReportingWorkItemLinkMutableBuilder[Self <: ReportingWorkItemLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangedBy(value: IdentityRef): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedDate(value: Date): Self = StObject.set(x, "changedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedOperation(value: LinkChangeType): Self = StObject.set(x, "changedOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceId(value: Double): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: Double): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
