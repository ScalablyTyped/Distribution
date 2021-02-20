package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class GatedCheckInTriggerMutableBuilder[Self <: GatedCheckInTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPathFilters(value: js.Array[String]): Self = StObject.set(x, "pathFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathFiltersVarargs(value: String*): Self = StObject.set(x, "pathFilters", js.Array(value :_*))
    
    @scala.inline
    def setRunContinuousIntegration(value: Boolean): Self = StObject.set(x, "runContinuousIntegration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseWorkspaceMappings(value: Boolean): Self = StObject.set(x, "useWorkspaceMappings", value.asInstanceOf[js.Any])
  }
}
