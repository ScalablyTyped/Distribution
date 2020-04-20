package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployment extends js.Object {
  /**
    * Gets links to access the deployment.
    */
  var _links: js.Any
  /**
    * Gets attempt number.
    */
  var attempt: Double
  /**
    * Gets the date on which deployment is complete.
    */
  var completedOn: Date
  /**
    * Gets the list of condition associated with deployment.
    */
  var conditions: js.Array[Condition]
  /**
    * Gets release definition environment id.
    */
  var definitionEnvironmentId: Double
  /**
    * Gets status of the deployment.
    */
  var deploymentStatus: DeploymentStatus
  /**
    * Gets the unique identifier for deployment.
    */
  var id: Double
  /**
    * Gets the identity who last modified the deployment.
    */
  var lastModifiedBy: IdentityRef
  /**
    * Gets the date on which deployment is last modified.
    */
  var lastModifiedOn: Date
  /**
    * Gets operation status of deployment.
    */
  var operationStatus: DeploymentOperationStatus
  /**
    * Gets list of PostDeployApprovals.
    */
  var postDeployApprovals: js.Array[ReleaseApproval]
  /**
    * Gets list of PreDeployApprovals.
    */
  var preDeployApprovals: js.Array[ReleaseApproval]
  /**
    * Gets the date on which deployment is queued.
    */
  var queuedOn: Date
  /**
    * Gets reason of deployment.
    */
  var reason: DeploymentReason
  /**
    * Gets the reference of release.
    */
  var release: ReleaseReference
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which the deployment is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference
  /**
    * Gets releaseEnvironmentReference which specifies the reference of the release environment to which the deployment is associated.
    */
  var releaseEnvironment: ReleaseEnvironmentShallowReference
  /**
    * Gets the identity who requested.
    */
  var requestedBy: IdentityRef
  /**
    * Gets the identity for whom deployment is requested.
    */
  var requestedFor: IdentityRef
  /**
    * Gets the date on which deployment is scheduled.
    */
  var scheduledDeploymentTime: Date
  /**
    * Gets the date on which deployment is started.
    */
  var startedOn: Date
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
}

