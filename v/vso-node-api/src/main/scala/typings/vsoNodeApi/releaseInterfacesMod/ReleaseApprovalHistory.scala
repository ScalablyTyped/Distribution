package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseApprovalHistory extends StObject {
  
  var approver: IdentityRef
  
  var changedBy: IdentityRef
  
  var comments: String
  
  var createdOn: Date
  
  var modifiedOn: Date
  
  var revision: Double
}
object ReleaseApprovalHistory {
  
  inline def apply(
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
  
  extension [Self <: ReleaseApprovalHistory](x: Self) {
    
    inline def setApprover(value: IdentityRef): Self = StObject.set(x, "approver", value.asInstanceOf[js.Any])
    
    inline def setChangedBy(value: IdentityRef): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCreatedOn(value: Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setModifiedOn(value: Date): Self = StObject.set(x, "modifiedOn", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
