package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatedCheckInTrigger extends BuildTrigger {
  var pathFilters: js.Array[String]
  /**
    * Indicates whether CI triggers should run after the gated check-in succeeds.
    */
  var runContinuousIntegration: Boolean
  /**
    * Indicates whether to take workspace mappings into account when determining whether a build should run.
    */
  var useWorkspaceMappings: Boolean
}

object GatedCheckInTrigger {
  @scala.inline
  def apply(
    pathFilters: js.Array[String],
    runContinuousIntegration: Boolean,
    triggerType: DefinitionTriggerType,
    useWorkspaceMappings: Boolean
  ): GatedCheckInTrigger = {
    val __obj = js.Dynamic.literal(pathFilters = pathFilters.asInstanceOf[js.Any], runContinuousIntegration = runContinuousIntegration.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any], useWorkspaceMappings = useWorkspaceMappings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatedCheckInTrigger]
  }
}

