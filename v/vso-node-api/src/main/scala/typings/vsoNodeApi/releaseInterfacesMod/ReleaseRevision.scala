package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseRevision extends StObject {
  
  var changeDetails: String
  
  var changeType: String
  
  var changedBy: IdentityRef
  
  var changedDate: js.Date
  
  var comment: String
  
  var definitionSnapshotRevision: Double
  
  var releaseId: Double
}
object ReleaseRevision {
  
  inline def apply(
    changeDetails: String,
    changeType: String,
    changedBy: IdentityRef,
    changedDate: js.Date,
    comment: String,
    definitionSnapshotRevision: Double,
    releaseId: Double
  ): ReleaseRevision = {
    val __obj = js.Dynamic.literal(changeDetails = changeDetails.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], definitionSnapshotRevision = definitionSnapshotRevision.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseRevision]
  }
  
  extension [Self <: ReleaseRevision](x: Self) {
    
    inline def setChangeDetails(value: String): Self = StObject.set(x, "changeDetails", value.asInstanceOf[js.Any])
    
    inline def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangedBy(value: IdentityRef): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    inline def setChangedDate(value: js.Date): Self = StObject.set(x, "changedDate", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setDefinitionSnapshotRevision(value: Double): Self = StObject.set(x, "definitionSnapshotRevision", value.asInstanceOf[js.Any])
    
    inline def setReleaseId(value: Double): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
  }
}
