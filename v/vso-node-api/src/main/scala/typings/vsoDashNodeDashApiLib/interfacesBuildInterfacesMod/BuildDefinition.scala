package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BuildDefinition extends BuildDefinitionReference {
  /**
       * Indicates whether badges are enabled for this definition.
       */
  var badgeEnabled: scala.Boolean
  /**
       * The build number format.
       */
  var buildNumberFormat: java.lang.String
  /**
       * A save-time comment for the definition.
       */
  var comment: java.lang.String
  var demands: js.Array[_]
  /**
       * The description.
       */
  var description: java.lang.String
  /**
       * The drop location for the definition.
       */
  var dropLocation: java.lang.String
  /**
       * The job authorization scope for builds queued against this definition.
       */
  var jobAuthorizationScope: BuildAuthorizationScope
  /**
       * The job cancel timeout (in minutes) for builds cancelled by user for this definition.
       */
  var jobCancelTimeoutInMinutes: scala.Double
  /**
       * The job execution timeout (in minutes) for builds queued against this definition.
       */
  var jobTimeoutInMinutes: scala.Double
  var options: js.Array[BuildOption]
  /**
       * The build process.
       */
  var process: BuildProcess
  /**
       * The process parameters for this definition.
       */
  var processParameters: vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
  var properties: js.Any
  /**
       * The repository.
       */
  var repository: BuildRepository
  var retentionRules: js.Array[RetentionPolicy]
  var tags: js.Array[java.lang.String]
  var triggers: js.Array[BuildTrigger]
  var variableGroups: js.Array[VariableGroup]
  var variables: org.scalablytyped.runtime.StringDictionary[BuildDefinitionVariable]
}

