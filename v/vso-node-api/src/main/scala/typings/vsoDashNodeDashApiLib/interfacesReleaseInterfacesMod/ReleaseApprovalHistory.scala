package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseApprovalHistory extends js.Object {
  var approver: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var changedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var comments: java.lang.String
  var createdOn: stdLib.Date
  var modifiedOn: stdLib.Date
  var revision: scala.Double
}

object ReleaseApprovalHistory {
  @scala.inline
  def apply(
    approver: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    changedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    comments: java.lang.String,
    createdOn: stdLib.Date,
    modifiedOn: stdLib.Date,
    revision: scala.Double
  ): ReleaseApprovalHistory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approver")(approver)
    __obj.updateDynamic("changedBy")(changedBy)
    __obj.updateDynamic("comments")(comments)
    __obj.updateDynamic("createdOn")(createdOn)
    __obj.updateDynamic("modifiedOn")(modifiedOn)
    __obj.updateDynamic("revision")(revision)
    __obj.asInstanceOf[ReleaseApprovalHistory]
  }
}

