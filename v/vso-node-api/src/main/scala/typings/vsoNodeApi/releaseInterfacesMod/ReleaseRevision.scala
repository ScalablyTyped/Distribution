package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseRevision extends StObject {
  
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
  implicit class ReleaseRevisionMutableBuilder[Self <: ReleaseRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeDetails(value: String): Self = StObject.set(x, "changeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedBy(value: IdentityRef): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedDate(value: Date): Self = StObject.set(x, "changedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionSnapshotRevision(value: Double): Self = StObject.set(x, "definitionSnapshotRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseId(value: Double): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
  }
}
