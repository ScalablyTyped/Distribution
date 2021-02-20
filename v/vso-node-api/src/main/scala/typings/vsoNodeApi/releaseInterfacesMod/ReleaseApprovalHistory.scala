package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseApprovalHistory extends StObject {
  
  var approver: IdentityRef = js.native
  
  var changedBy: IdentityRef = js.native
  
  var comments: String = js.native
  
  var createdOn: Date = js.native
  
  var modifiedOn: Date = js.native
  
  var revision: Double = js.native
}
object ReleaseApprovalHistory {
  
  @scala.inline
  def apply(
    approver: IdentityRef,
    changedBy: IdentityRef,
    comments: String,
    createdOn: Date,
    modifiedOn: Date,
    revision: Double
  ): ReleaseApprovalHistory = {
    val __obj = js.Dynamic.literal(approver = approver.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseApprovalHistory]
  }
  
  @scala.inline
  implicit class ReleaseApprovalHistoryMutableBuilder[Self <: ReleaseApprovalHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprover(value: IdentityRef): Self = StObject.set(x, "approver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedBy(value: IdentityRef): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOn(value: Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedOn(value: Date): Self = StObject.set(x, "modifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
