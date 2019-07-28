package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
  var approvedBy: IdentityRef
  /**
    * Gets or sets the identity who should approve.
    */
  var approver: IdentityRef
  /**
    * Gets or sets attempt which specifies as which deployment attempt it belongs.
    */
  var attempt: Double
  /**
    * Gets or sets comments for approval.
    */
  var comments: String
  /**
    * Gets date on which it got created.
    */
  var createdOn: Date
  /**
    * Gets history which specifies all approvals associated with this approval.
    */
  var history: js.Array[ReleaseApprovalHistory]
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double
  /**
    * Gets or sets as approval is automated or not.
    */
  var isAutomated: Boolean
  var isNotificationOn: Boolean
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: Date
  /**
    * Gets or sets rank which specifies the order of the approval. e.g. Same rank denotes parallel approval.
    */
  var rank: Double
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
  var revision: Double
  /**
    * Gets or sets the status of the approval.
    */
  var status: ApprovalStatus
  var trialNumber: Double
  /**
    * Gets url to access the approval.
    */
  var url: String
}

object ReleaseApproval {
  @scala.inline
  def apply(
    approvalType: ApprovalType,
    approvedBy: IdentityRef,
    approver: IdentityRef,
    attempt: Double,
    comments: String,
    createdOn: Date,
    history: js.Array[ReleaseApprovalHistory],
    id: Double,
    isAutomated: Boolean,
    isNotificationOn: Boolean,
    modifiedOn: Date,
    rank: Double,
    release: ReleaseShallowReference,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseEnvironment: ReleaseEnvironmentShallowReference,
    revision: Double,
    status: ApprovalStatus,
    trialNumber: Double,
    url: String
  ): ReleaseApproval = {
    val __obj = js.Dynamic.literal(approvalType = approvalType, approvedBy = approvedBy, approver = approver, attempt = attempt, comments = comments, createdOn = createdOn, history = history, id = id, isAutomated = isAutomated, isNotificationOn = isNotificationOn, modifiedOn = modifiedOn, rank = rank, release = release, releaseDefinition = releaseDefinition, releaseEnvironment = releaseEnvironment, revision = revision, status = status, trialNumber = trialNumber, url = url)
  
    __obj.asInstanceOf[ReleaseApproval]
  }
}

