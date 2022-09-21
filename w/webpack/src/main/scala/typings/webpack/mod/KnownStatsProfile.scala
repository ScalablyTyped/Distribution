package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsProfile extends StObject {
  
  var additionalIntegration: Double
  
  var additionalResolving: Double
  
  var building: Double
  
  var dependencies: Double
  
  var factory: Double
  
  var integration: Double
  
  var resolving: Double
  
  var restoring: Double
  
  var storing: Double
  
  var total: Double
}
object KnownStatsProfile {
  
  inline def apply(
    additionalIntegration: Double,
    additionalResolving: Double,
    building: Double,
    dependencies: Double,
    factory: Double,
    integration: Double,
    resolving: Double,
    restoring: Double,
    storing: Double,
    total: Double
  ): KnownStatsProfile = {
    val __obj = js.Dynamic.literal(additionalIntegration = additionalIntegration.asInstanceOf[js.Any], additionalResolving = additionalResolving.asInstanceOf[js.Any], building = building.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], integration = integration.asInstanceOf[js.Any], resolving = resolving.asInstanceOf[js.Any], restoring = restoring.asInstanceOf[js.Any], storing = storing.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownStatsProfile]
  }
  
  extension [Self <: KnownStatsProfile](x: Self) {
    
    inline def setAdditionalIntegration(value: Double): Self = StObject.set(x, "additionalIntegration", value.asInstanceOf[js.Any])
    
    inline def setAdditionalResolving(value: Double): Self = StObject.set(x, "additionalResolving", value.asInstanceOf[js.Any])
    
    inline def setBuilding(value: Double): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: Double): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setFactory(value: Double): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setIntegration(value: Double): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
    
    inline def setResolving(value: Double): Self = StObject.set(x, "resolving", value.asInstanceOf[js.Any])
    
    inline def setRestoring(value: Double): Self = StObject.set(x, "restoring", value.asInstanceOf[js.Any])
    
    inline def setStoring(value: Double): Self = StObject.set(x, "storing", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
