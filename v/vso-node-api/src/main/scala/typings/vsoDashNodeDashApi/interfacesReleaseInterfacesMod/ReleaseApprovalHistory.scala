package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseApprovalHistory extends js.Object {
  var approver: IdentityRef
  var changedBy: IdentityRef
  var comments: String
  var createdOn: Date
  var modifiedOn: Date
  var revision: Double
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
}

