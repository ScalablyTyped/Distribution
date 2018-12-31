package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseApproval extends js.Object {
  /**
    * Gets or sets the type of approval.
    */
  var approvalType: ApprovalType
  /**
    * Gets the identity who approved.
    */
  var approvedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets or sets the identity who should approve.
    */
  var approver: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets or sets attempt which specifies as which deployment attempt it belongs.
    */
  var attempt: scala.Double
  /**
    * Gets or sets comments for approval.
    */
  var comments: java.lang.String
  /**
    * Gets date on which it got created.
    */
  var createdOn: stdLib.Date
  /**
    * Gets history which specifies all approvals associated with this approval.
    */
  var history: js.Array[ReleaseApprovalHistory]
  /**
    * Gets the unique identifier of this field.
    */
  var id: scala.Double
  /**
    * Gets or sets as approval is automated or not.
    */
  var isAutomated: scala.Boolean
  var isNotificationOn: scala.Boolean
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: stdLib.Date
  /**
    * Gets or sets rank which specifies the order of the approval. e.g. Same rank denotes parallel approval.
    */
  var rank: scala.Double
  /**
    * Gets releaseReference which specifies the reference of the release to which this approval is associated.
    */
  var release: ReleaseShallowReference
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which this approval is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference
  /**
    * Gets releaseEnvironmentReference which specifies the reference of the release environment to which this approval is associated.
    */
  var releaseEnvironment: ReleaseEnvironmentShallowReference
  /**
    * Gets the revision number.
    */
  var revision: scala.Double
  /**
    * Gets or sets the status of the approval.
    */
  var status: ApprovalStatus
  var trialNumber: scala.Double
  /**
    * Gets url to access the approval.
    */
  var url: java.lang.String
}

