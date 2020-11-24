package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseApproval extends js.Object {
  
  /**
    * Gets or sets the type of approval.
    */
  var approvalType: ApprovalType = js.native
  
  /**
    * Gets the identity who approved.
    */
  var approvedBy: IdentityRef = js.native
  
  /**
    * Gets or sets the identity who should approve.
    */
  var approver: IdentityRef = js.native
  
  /**
    * Gets or sets attempt which specifies as which deployment attempt it belongs.
    */
  var attempt: Double = js.native
  
  /**
    * Gets or sets comments for approval.
    */
  var comments: String = js.native
  
  /**
    * Gets date on which it got created.
    */
  var createdOn: Date = js.native
  
  /**
    * Gets history which specifies all approvals associated with this approval.
    */
  var history: js.Array[ReleaseApprovalHistory] = js.native
  
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double = js.native
  
  /**
    * Gets or sets as approval is automated or not.
    */
  var isAutomated: Boolean = js.native
  
  var isNotificationOn: Boolean = js.native
  
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: Date = js.native
  
  /**
    * Gets or sets rank which specifies the order of the approval. e.g. Same rank denotes parallel approval.
    */
  var rank: Double = js.native
  
  /**
    * Gets releaseReference which specifies the reference of the release to which this approval is associated.
    */
  var release: ReleaseShallowReference = js.native
  
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which this approval is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference = js.native
  
  /**
    * Gets releaseEnvironmentReference which specifies the reference of the release environment to which this approval is associated.
    */
  var releaseEnvironment: ReleaseEnvironmentShallowReference = js.native
  
  /**
    * Gets the revision number.
    */
  var revision: Double = js.native
  
  /**
    * Gets or sets the status of the approval.
    */
  var status: ApprovalStatus = js.native
  
  var trialNumber: Double = js.native
  
  /**
    * Gets url to access the approval.
    */
  var url: String = js.native
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
    val __obj = js.Dynamic.literal(approvalType = approvalType.asInstanceOf[js.Any], approvedBy = approvedBy.asInstanceOf[js.Any], approver = approver.asInstanceOf[js.Any], attempt = attempt.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAutomated = isAutomated.asInstanceOf[js.Any], isNotificationOn = isNotificationOn.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseEnvironment = releaseEnvironment.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], trialNumber = trialNumber.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseApproval]
  }
  
  @scala.inline
  implicit class ReleaseApprovalOps[Self <: ReleaseApproval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApprovalType(value: ApprovalType): Self = this.set("approvalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovedBy(value: IdentityRef): Self = this.set("approvedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprover(value: IdentityRef): Self = this.set("approver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttempt(value: Double): Self = this.set("attempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOn(value: Date): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryVarargs(value: ReleaseApprovalHistory*): Self = this.set("history", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: js.Array[ReleaseApprovalHistory]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutomated(value: Boolean): Self = this.set("isAutomated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNotificationOn(value: Boolean): Self = this.set("isNotificationOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedOn(value: Date): Self = this.set("modifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: ReleaseShallowReference): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = this.set("releaseDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseEnvironment(value: ReleaseEnvironmentShallowReference): Self = this.set("releaseEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ApprovalStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialNumber(value: Double): Self = this.set("trialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
