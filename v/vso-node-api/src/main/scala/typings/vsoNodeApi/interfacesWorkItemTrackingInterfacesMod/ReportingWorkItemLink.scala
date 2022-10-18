package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportingWorkItemLink extends StObject {
  
  var changedBy: IdentityRef
  
  var changedDate: js.Date
  
  var changedOperation: LinkChangeType
  
  var comment: String
  
  var isActive: Boolean
  
  var linkType: String
  
  var rel: String
  
  var sourceId: Double
  
  var targetId: Double
}
object ReportingWorkItemLink {
  
  inline def apply(
    changedBy: IdentityRef,
    changedDate: js.Date,
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
  
  extension [Self <: ReportingWorkItemLink](x: Self) {
    
    inline def setChangedBy(value: IdentityRef): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    inline def setChangedDate(value: js.Date): Self = StObject.set(x, "changedDate", value.asInstanceOf[js.Any])
    
    inline def setChangedOperation(value: LinkChangeType): Self = StObject.set(x, "changedOperation", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: Double): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: Double): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
