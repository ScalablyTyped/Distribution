package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatedCheckInTrigger
  extends StObject
     with BuildTrigger {
  
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
  
  inline def apply(
    pathFilters: js.Array[String],
    runContinuousIntegration: Boolean,
    triggerType: DefinitionTriggerType,
    useWorkspaceMappings: Boolean
  ): GatedCheckInTrigger = {
    val __obj = js.Dynamic.literal(pathFilters = pathFilters.asInstanceOf[js.Any], runContinuousIntegration = runContinuousIntegration.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any], useWorkspaceMappings = useWorkspaceMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatedCheckInTrigger]
  }
  
  extension [Self <: GatedCheckInTrigger](x: Self) {
    
    inline def setPathFilters(value: js.Array[String]): Self = StObject.set(x, "pathFilters", value.asInstanceOf[js.Any])
    
    inline def setPathFiltersVarargs(value: String*): Self = StObject.set(x, "pathFilters", js.Array(value*))
    
    inline def setRunContinuousIntegration(value: Boolean): Self = StObject.set(x, "runContinuousIntegration", value.asInstanceOf[js.Any])
    
    inline def setUseWorkspaceMappings(value: Boolean): Self = StObject.set(x, "useWorkspaceMappings", value.asInstanceOf[js.Any])
  }
}
