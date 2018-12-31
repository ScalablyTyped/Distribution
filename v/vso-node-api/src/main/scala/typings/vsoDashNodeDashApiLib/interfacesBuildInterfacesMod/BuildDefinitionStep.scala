package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionStep extends js.Object {
  /**
    * Indicates whether this step should run even if a previous step fails.
    */
  var alwaysRun: scala.Boolean
  /**
    * A condition that determines whether this step should run.
    */
  var condition: java.lang.String
  /**
    * Indicates whether the phase should continue even if this step fails.
    */
  var continueOnError: scala.Boolean
  /**
    * The display name for this step.
    */
  var displayName: java.lang.String
  /**
    * Indicates whether the step is enabled.
    */
  var enabled: scala.Boolean
  var environment: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The reference name for this step.
    */
  var refName: java.lang.String
  /**
    * The task associated with this step.
    */
  var task: TaskDefinitionReference
  /**
    * The time, in minutes, that this step is allowed to run.
    */
  var timeoutInMinutes: scala.Double
}

