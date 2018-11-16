package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BuildDefinition3_2 extends BuildDefinitionReference3_2 {
  /**
       * Indicates whether badges are enabled for this definition
       */
  var badgeEnabled: scala.Boolean
  var build: js.Array[BuildDefinitionStep]
  /**
       * The build number format
       */
  var buildNumberFormat: java.lang.String
  /**
       * The comment entered when saving the definition
       */
  var comment: java.lang.String
  var demands: js.Array[_]
  /**
       * The description
       */
  var description: java.lang.String
  /**
       * The drop location for the definition
       */
  var dropLocation: java.lang.String
  /**
       * The job authorization scope for builds which are queued against this definition
       */
  var jobAuthorizationScope: BuildAuthorizationScope
  /**
       * The job cancel timeout in minutes for builds which are cancelled by user for this definition
       */
  var jobCancelTimeoutInMinutes: scala.Double
  /**
       * The job execution timeout in minutes for builds which are queued against this definition
       */
  var jobTimeoutInMinutes: scala.Double
  var latestBuild: Build
  var latestCompletedBuild: Build
  var options: js.Array[BuildOption]
  /**
       * Process Parameters
       */
  var processParameters: vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
  var properties: js.Any
  /**
       * The repository
       */
  var repository: BuildRepository
  var retentionRules: js.Array[RetentionPolicy]
  var tags: js.Array[java.lang.String]
  var triggers: js.Array[BuildTrigger]
  var variables: ScalablyTyped.runtime.StringDictionary[BuildDefinitionVariable]
}

