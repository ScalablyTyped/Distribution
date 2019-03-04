package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
  var attempt: scala.Double
  /**
    * Gets the date on which deployment is complete.
    */
  var completedOn: stdLib.Date
  /**
    * Gets the list of condition associated with deployment.
    */
  var conditions: js.Array[Condition]
  /**
    * Gets release definition environment id.
    */
  var definitionEnvironmentId: scala.Double
  /**
    * Gets status of the deployment.
    */
  var deploymentStatus: DeploymentStatus
  /**
    * Gets the unique identifier for deployment.
    */
  var id: scala.Double
  /**
    * Gets the identity who last modified the deployment.
    */
  var lastModifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets the date on which deployment is last modified.
    */
  var lastModifiedOn: stdLib.Date
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
  var queuedOn: stdLib.Date
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
  var requestedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets the identity for whom deployment is requested.
    */
  var requestedFor: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets the date on which deployment is scheduled.
    */
  var scheduledDeploymentTime: stdLib.Date
  /**
    * Gets the date on which deployment is started.
    */
  var startedOn: stdLib.Date
}

object Deployment {
  @scala.inline
  def apply(
    _links: js.Any,
    attempt: scala.Double,
    completedOn: stdLib.Date,
    conditions: js.Array[Condition],
    definitionEnvironmentId: scala.Double,
    deploymentStatus: DeploymentStatus,
    id: scala.Double,
    lastModifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    lastModifiedOn: stdLib.Date,
    operationStatus: DeploymentOperationStatus,
    postDeployApprovals: js.Array[ReleaseApproval],
    preDeployApprovals: js.Array[ReleaseApproval],
    queuedOn: stdLib.Date,
    reason: DeploymentReason,
    release: ReleaseReference,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseEnvironment: ReleaseEnvironmentShallowReference,
    requestedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    requestedFor: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    scheduledDeploymentTime: stdLib.Date,
    startedOn: stdLib.Date
  ): Deployment = {
    val __obj = js.Dynamic.literal(_links = _links, attempt = attempt, completedOn = completedOn, conditions = conditions, definitionEnvironmentId = definitionEnvironmentId, deploymentStatus = deploymentStatus, id = id, lastModifiedBy = lastModifiedBy, lastModifiedOn = lastModifiedOn, operationStatus = operationStatus, postDeployApprovals = postDeployApprovals, preDeployApprovals = preDeployApprovals, queuedOn = queuedOn, reason = reason, release = release, releaseDefinition = releaseDefinition, releaseEnvironment = releaseEnvironment, requestedBy = requestedBy, requestedFor = requestedFor, scheduledDeploymentTime = scheduledDeploymentTime, startedOn = startedOn)
  
    __obj.asInstanceOf[Deployment]
  }
}

