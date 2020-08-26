package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /**
    * Gets links to access the deployment.
    */
  var _links: js.Any = js.native
  /**
    * Gets attempt number.
    */
  var attempt: Double = js.native
  /**
    * Gets the date on which deployment is complete.
    */
  var completedOn: Date = js.native
  /**
    * Gets the list of condition associated with deployment.
    */
  var conditions: js.Array[Condition] = js.native
  /**
    * Gets release definition environment id.
    */
  var definitionEnvironmentId: Double = js.native
  /**
    * Gets status of the deployment.
    */
  var deploymentStatus: DeploymentStatus = js.native
  /**
    * Gets the unique identifier for deployment.
    */
  var id: Double = js.native
  /**
    * Gets the identity who last modified the deployment.
    */
  var lastModifiedBy: IdentityRef = js.native
  /**
    * Gets the date on which deployment is last modified.
    */
  var lastModifiedOn: Date = js.native
  /**
    * Gets operation status of deployment.
    */
  var operationStatus: DeploymentOperationStatus = js.native
  /**
    * Gets list of PostDeployApprovals.
    */
  var postDeployApprovals: js.Array[ReleaseApproval] = js.native
  /**
    * Gets list of PreDeployApprovals.
    */
  var preDeployApprovals: js.Array[ReleaseApproval] = js.native
  /**
    * Gets the date on which deployment is queued.
    */
  var queuedOn: Date = js.native
  /**
    * Gets reason of deployment.
    */
  var reason: DeploymentReason = js.native
  /**
    * Gets the reference of release.
    */
  var release: ReleaseReference = js.native
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which the deployment is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference = js.native
  /**
    * Gets releaseEnvironmentReference which specifies the reference of the release environment to which the deployment is associated.
    */
  var releaseEnvironment: ReleaseEnvironmentShallowReference = js.native
  /**
    * Gets the identity who requested.
    */
  var requestedBy: IdentityRef = js.native
  /**
    * Gets the identity for whom deployment is requested.
    */
  var requestedFor: IdentityRef = js.native
  /**
    * Gets the date on which deployment is scheduled.
    */
  var scheduledDeploymentTime: Date = js.native
  /**
    * Gets the date on which deployment is started.
    */
  var startedOn: Date = js.native
}

object Deployment {
  @scala.inline
  def apply(
    _links: js.Any,
    attempt: Double,
    completedOn: Date,
    conditions: js.Array[Condition],
    definitionEnvironmentId: Double,
    deploymentStatus: DeploymentStatus,
    id: Double,
    lastModifiedBy: IdentityRef,
    lastModifiedOn: Date,
    operationStatus: DeploymentOperationStatus,
    postDeployApprovals: js.Array[ReleaseApproval],
    preDeployApprovals: js.Array[ReleaseApproval],
    queuedOn: Date,
    reason: DeploymentReason,
    release: ReleaseReference,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseEnvironment: ReleaseEnvironmentShallowReference,
    requestedBy: IdentityRef,
    requestedFor: IdentityRef,
    scheduledDeploymentTime: Date,
    startedOn: Date
  ): Deployment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], attempt = attempt.asInstanceOf[js.Any], completedOn = completedOn.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], definitionEnvironmentId = definitionEnvironmentId.asInstanceOf[js.Any], deploymentStatus = deploymentStatus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedOn = lastModifiedOn.asInstanceOf[js.Any], operationStatus = operationStatus.asInstanceOf[js.Any], postDeployApprovals = postDeployApprovals.asInstanceOf[js.Any], preDeployApprovals = preDeployApprovals.asInstanceOf[js.Any], queuedOn = queuedOn.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseEnvironment = releaseEnvironment.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], scheduledDeploymentTime = scheduledDeploymentTime.asInstanceOf[js.Any], startedOn = startedOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
  @scala.inline
  implicit class DeploymentOps[Self <: Deployment] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttempt(value: Double): Self = this.set("attempt", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompletedOn(value: Date): Self = this.set("completedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionsVarargs(value: Condition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[Condition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionEnvironmentId(value: Double): Self = this.set("definitionEnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentStatus(value: DeploymentStatus): Self = this.set("deploymentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedBy(value: IdentityRef): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedOn(value: Date): Self = this.set("lastModifiedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationStatus(value: DeploymentOperationStatus): Self = this.set("operationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostDeployApprovalsVarargs(value: ReleaseApproval*): Self = this.set("postDeployApprovals", js.Array(value :_*))
    @scala.inline
    def setPostDeployApprovals(value: js.Array[ReleaseApproval]): Self = this.set("postDeployApprovals", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreDeployApprovalsVarargs(value: ReleaseApproval*): Self = this.set("preDeployApprovals", js.Array(value :_*))
    @scala.inline
    def setPreDeployApprovals(value: js.Array[ReleaseApproval]): Self = this.set("preDeployApprovals", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueuedOn(value: Date): Self = this.set("queuedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: DeploymentReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease(value: ReleaseReference): Self = this.set("release", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = this.set("releaseDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseEnvironment(value: ReleaseEnvironmentShallowReference): Self = this.set("releaseEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedBy(value: IdentityRef): Self = this.set("requestedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedFor(value: IdentityRef): Self = this.set("requestedFor", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduledDeploymentTime(value: Date): Self = this.set("scheduledDeploymentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartedOn(value: Date): Self = this.set("startedOn", value.asInstanceOf[js.Any])
  }
  
}

