package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseEnvironmentDefinitionReference extends StObject {
  
  var definitionId: Double
  
  var environmentDefinitionId: Double
}
object ReleaseEnvironmentDefinitionReference {
  
  inline def apply(definitionId: Double, environmentDefinitionId: Double): ReleaseEnvironmentDefinitionReference = {
    val __obj = js.Dynamic.literal(definitionId = definitionId.asInstanceOf[js.Any], environmentDefinitionId = environmentDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentDefinitionReference]
  }
  
  extension [Self <: ReleaseEnvironmentDefinitionReference](x: Self) {
    
    inline def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentDefinitionId(value: Double): Self = StObject.set(x, "environmentDefinitionId", value.asInstanceOf[js.Any])
  }
}
