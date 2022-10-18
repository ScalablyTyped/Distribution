package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseArtifact extends StObject {
  
  var artifactProvider: ArtifactProvider
  
  var artifactType: String
  
  var definitionData: String
  
  var definitionId: Double
  
  var description: String
  
  var id: Double
  
  var name: String
  
  var releaseId: Double
}
object ReleaseArtifact {
  
  inline def apply(
    artifactProvider: ArtifactProvider,
    artifactType: String,
    definitionData: String,
    definitionId: Double,
    description: String,
    id: Double,
    name: String,
    releaseId: Double
  ): ReleaseArtifact = {
    val __obj = js.Dynamic.literal(artifactProvider = artifactProvider.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any], definitionData = definitionData.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseArtifact]
  }
  
  extension [Self <: ReleaseArtifact](x: Self) {
    
    inline def setArtifactProvider(value: ArtifactProvider): Self = StObject.set(x, "artifactProvider", value.asInstanceOf[js.Any])
    
    inline def setArtifactType(value: String): Self = StObject.set(x, "artifactType", value.asInstanceOf[js.Any])
    
    inline def setDefinitionData(value: String): Self = StObject.set(x, "definitionData", value.asInstanceOf[js.Any])
    
    inline def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReleaseId(value: Double): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
  }
}
