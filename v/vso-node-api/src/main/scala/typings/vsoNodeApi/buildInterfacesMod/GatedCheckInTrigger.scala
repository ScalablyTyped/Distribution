package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatedCheckInTrigger extends BuildTrigger {
  var pathFilters: js.Array[String] = js.native
  /**
    * Indicates whether CI triggers should run after the gated check-in succeeds.
    */
  var runContinuousIntegration: Boolean = js.native
  /**
    * Indicates whether to take workspace mappings into account when determining whether a build should run.
    */
  var useWorkspaceMappings: Boolean = js.native
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
  @scala.inline
  implicit class GatedCheckInTriggerOps[Self <: GatedCheckInTrigger] (val x: Self) extends AnyVal {
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
    def setPathFiltersVarargs(value: String*): Self = this.set("pathFilters", js.Array(value :_*))
    @scala.inline
    def setPathFilters(value: js.Array[String]): Self = this.set("pathFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunContinuousIntegration(value: Boolean): Self = this.set("runContinuousIntegration", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseWorkspaceMappings(value: Boolean): Self = this.set("useWorkspaceMappings", value.asInstanceOf[js.Any])
  }
  
}

