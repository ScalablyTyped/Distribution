package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReleaseEnvironment extends js.Object {
  /**
       * Gets list of conditions.
       */
  var conditions: js.Array[ReleaseCondition]
  /**
       * Gets date on which it got created.
       */
  var createdOn: stdLib.Date
  /**
       * Gets definition environment id.
       */
  var definitionEnvironmentId: scala.Double
  /**
       * Gets demands.
       */
  var demands: js.Array[_]
  /**
       * Gets list of deploy phases snapshot.
       */
  var deployPhasesSnapshot: js.Array[DeployPhase]
  /**
       * Gets deploy steps.
       */
  var deploySteps: js.Array[DeploymentAttempt]
  /**
       * Gets environment options.
       */
  var environmentOptions: EnvironmentOptions
  /**
       * Gets the unique identifier of this field.
       */
  var id: scala.Double
  /**
       * Gets date on which it got modified.
       */
  var modifiedOn: stdLib.Date
  /**
       * Gets name.
       */
  var name: java.lang.String
  /**
       * Gets next scheduled UTC time.
       */
  var nextScheduledUtcTime: stdLib.Date
  /**
       * Gets the identity who is owner for release environment.
       */
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * Gets list of post deploy approvals snapshot.
       */
  var postApprovalsSnapshot: ReleaseDefinitionApprovals
  /**
       * Gets list of post deploy approvals.
       */
  var postDeployApprovals: js.Array[ReleaseApproval]
  var postDeploymentGatesSnapshot: ReleaseDefinitionGatesStep
  /**
       * Gets list of pre deploy approvals snapshot.
       */
  var preApprovalsSnapshot: ReleaseDefinitionApprovals
  /**
       * Gets list of pre deploy approvals.
       */
  var preDeployApprovals: js.Array[ReleaseApproval]
  var preDeploymentGatesSnapshot: ReleaseDefinitionGatesStep
  /**
       * Gets process parameters.
       */
  var processParameters: vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
  /**
       * Gets queue id.
       */
  var queueId: scala.Double
  /**
       * Gets rank.
       */
  var rank: scala.Double
  /**
       * Gets release reference which specifies the reference of the release to which this release environment is associated.
       */
  var release: ReleaseShallowReference
  /**
       * Gets the identity who created release.
       */
  var releaseCreatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * Gets releaseDefinitionReference which specifies the reference of the release definition to which this release environment is associated.
       */
  var releaseDefinition: ReleaseDefinitionShallowReference
  /**
       * Gets release description.
       */
  var releaseDescription: java.lang.String
  /**
       * Gets release id.
       */
  var releaseId: scala.Double
  /**
       * Gets schedule deployment time of release environment.
       */
  var scheduledDeploymentTime: stdLib.Date
  /**
       * Gets list of schedules.
       */
  var schedules: js.Array[ReleaseSchedule]
  /**
       * Gets environment status.
       */
  var status: EnvironmentStatus
  /**
       * Gets time to deploy.
       */
  var timeToDeploy: scala.Double
  /**
       * Gets trigger reason.
       */
  var triggerReason: java.lang.String
  /**
       * Gets the list of variable groups.
       */
  var variableGroups: js.Array[VariableGroup]
  /**
       * Gets the dictionary of variables.
       */
  var variables: org.scalablytyped.runtime.StringDictionary[ConfigurationVariableValue]
  /**
       * Gets list of workflow tasks.
       */
  var workflowTasks: js.Array[WorkflowTask]
}

