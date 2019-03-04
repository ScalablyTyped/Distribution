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

object ReleaseApproval {
  @scala.inline
  def apply(
    approvalType: ApprovalType,
    approvedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    approver: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    attempt: scala.Double,
    comments: java.lang.String,
    createdOn: stdLib.Date,
    history: js.Array[ReleaseApprovalHistory],
    id: scala.Double,
    isAutomated: scala.Boolean,
    isNotificationOn: scala.Boolean,
    modifiedOn: stdLib.Date,
    rank: scala.Double,
    release: ReleaseShallowReference,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseEnvironment: ReleaseEnvironmentShallowReference,
    revision: scala.Double,
    status: ApprovalStatus,
    trialNumber: scala.Double,
    url: java.lang.String
  ): ReleaseApproval = {
    val __obj = js.Dynamic.literal(approvalType = approvalType, approvedBy = approvedBy, approver = approver, attempt = attempt, comments = comments, createdOn = createdOn, history = history, id = id, isAutomated = isAutomated, isNotificationOn = isNotificationOn, modifiedOn = modifiedOn, rank = rank, release = release, releaseDefinition = releaseDefinition, releaseEnvironment = releaseEnvironment, revision = revision, status = status, trialNumber = trialNumber, url = url)
  
    __obj.asInstanceOf[ReleaseApproval]
  }
}

