package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseArtifact extends StObject {
  
  var artifactProvider: ArtifactProvider = js.native
  
  var artifactType: String = js.native
  
  var definitionData: String = js.native
  
  var definitionId: Double = js.native
  
  var description: String = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var releaseId: Double = js.native
}
object ReleaseArtifact {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ReleaseArtifactMutableBuilder[Self <: ReleaseArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactProvider(value: ArtifactProvider): Self = StObject.set(x, "artifactProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactType(value: String): Self = StObject.set(x, "artifactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionData(value: String): Self = StObject.set(x, "definitionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseId(value: Double): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
  }
}
