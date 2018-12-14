package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Build extends js.Object {
  var _links: js.Any
  /**
       * The build number/name of the build.
       */
  var buildNumber: java.lang.String
  /**
       * The build number revision.
       */
  var buildNumberRevision: scala.Double
  /**
       * The build controller. This is only set if the definition type is Xaml.
       */
  var controller: BuildController
  /**
       * The definition associated with the build.
       */
  var definition: DefinitionReference
  /**
       * Indicates whether the build has been deleted.
       */
  var deleted: scala.Boolean
  /**
       * The identity of the process or person that deleted the build.
       */
  var deletedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * The date the build was deleted.
       */
  var deletedDate: stdLib.Date
  /**
       * The description of how the build was deleted.
       */
  var deletedReason: java.lang.String
  /**
       * A list of demands that represents the agent capabilities required by this build.
       */
  var demands: js.Array[_]
  /**
       * The time that the build was completed.
       */
  var finishTime: stdLib.Date
  /**
       * The ID of the build.
       */
  var id: scala.Double
  /**
       * Indicates whether the build should be skipped by retention policies.
       */
  var keepForever: scala.Boolean
  /**
       * The identity representing the process or person that last changed the build.
       */
  var lastChangedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * The date the build was last changed.
       */
  var lastChangedDate: stdLib.Date
  /**
       * Information about the build logs.
       */
  var logs: BuildLogReference
  /**
       * The orchestration plan for the build.
       */
  var orchestrationPlan: TaskOrchestrationPlanReference
  /**
       * The parameters for the build.
       */
  var parameters: java.lang.String
  /**
       * Orchestration plans associated with the build (build, cleanup)
       */
  var plans: js.Array[TaskOrchestrationPlanReference]
  /**
       * The build's priority.
       */
  var priority: QueuePriority
  /**
       * The team project.
       */
  var project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
  var properties: js.Any
  /**
       * The quality of the xaml build (good, bad, etc.)
       */
  var quality: java.lang.String
  /**
       * The queue. This is only set if the definition type is Build.
       */
  var queue: AgentPoolQueue
  /**
       * Additional options for queueing the build.
       */
  var queueOptions: QueueOptions
  /**
       * The current position of the build in the queue.
       */
  var queuePosition: scala.Double
  /**
       * The time that the build was queued.
       */
  var queueTime: stdLib.Date
  /**
       * The reason that the build was created.
       */
  var reason: BuildReason
  /**
       * The repository.
       */
  var repository: BuildRepository
  /**
       * The identity that queued the build.
       */
  var requestedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * The identity on whose behalf the build was queued.
       */
  var requestedFor: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * The build result.
       */
  var result: BuildResult
  /**
       * Indicates whether the build is retained by a release.
       */
  var retainedByRelease: scala.Boolean
  /**
       * The source branch.
       */
  var sourceBranch: java.lang.String
  /**
       * The source version.
       */
  var sourceVersion: java.lang.String
  /**
       * The time that the build was started.
       */
  var startTime: stdLib.Date
  /**
       * The status of the build.
       */
  var status: BuildStatus
  var tags: js.Array[java.lang.String]
  /**
       * Sourceprovider-specific information about what triggered the build
       */
  var triggerInfo: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
       * The URI of the build.
       */
  var uri: java.lang.String
  /**
       * The REST URL of the build.
       */
  var url: java.lang.String
  var validationResults: js.Array[BuildRequestValidationResult]
}

