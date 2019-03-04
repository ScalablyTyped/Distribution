package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatedCheckInTrigger extends BuildTrigger {
  var pathFilters: js.Array[java.lang.String]
  /**
    * Indicates whether CI triggers should run after the gated check-in succeeds.
    */
  var runContinuousIntegration: scala.Boolean
  /**
    * Indicates whether to take workspace mappings into account when determining whether a build should run.
    */
  var useWorkspaceMappings: scala.Boolean
}

object GatedCheckInTrigger {
  @scala.inline
  def apply(
    pathFilters: js.Array[java.lang.String],
    runContinuousIntegration: scala.Boolean,
    triggerType: DefinitionTriggerType,
    useWorkspaceMappings: scala.Boolean
  ): GatedCheckInTrigger = {
    val __obj = js.Dynamic.literal(pathFilters = pathFilters, runContinuousIntegration = runContinuousIntegration, triggerType = triggerType, useWorkspaceMappings = useWorkspaceMappings)
  
    __obj.asInstanceOf[GatedCheckInTrigger]
  }
}

