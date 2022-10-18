package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionEnvironmentReference extends StObject {
  
  var definitionEnvironmentId: Double
  
  var definitionEnvironmentName: String
  
  var releaseDefinitionId: Double
  
  var releaseDefinitionName: String
}
object DefinitionEnvironmentReference {
  
  inline def apply(
    definitionEnvironmentId: Double,
    definitionEnvironmentName: String,
    releaseDefinitionId: Double,
    releaseDefinitionName: String
  ): DefinitionEnvironmentReference = {
    val __obj = js.Dynamic.literal(definitionEnvironmentId = definitionEnvironmentId.asInstanceOf[js.Any], definitionEnvironmentName = definitionEnvironmentName.asInstanceOf[js.Any], releaseDefinitionId = releaseDefinitionId.asInstanceOf[js.Any], releaseDefinitionName = releaseDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionEnvironmentReference]
  }
  
  extension [Self <: DefinitionEnvironmentReference](x: Self) {
    
    inline def setDefinitionEnvironmentId(value: Double): Self = StObject.set(x, "definitionEnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setDefinitionEnvironmentName(value: String): Self = StObject.set(x, "definitionEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setReleaseDefinitionId(value: Double): Self = StObject.set(x, "releaseDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setReleaseDefinitionName(value: String): Self = StObject.set(x, "releaseDefinitionName", value.asInstanceOf[js.Any])
  }
}
