package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactSourceId extends StObject {
  
  var artifactTypeId: String
  
  var sourceIdInputs: js.Array[SourceIdInput]
}
object ArtifactSourceId {
  
  inline def apply(artifactTypeId: String, sourceIdInputs: js.Array[SourceIdInput]): ArtifactSourceId = {
    val __obj = js.Dynamic.literal(artifactTypeId = artifactTypeId.asInstanceOf[js.Any], sourceIdInputs = sourceIdInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceId]
  }
  
  extension [Self <: ArtifactSourceId](x: Self) {
    
    inline def setArtifactTypeId(value: String): Self = StObject.set(x, "artifactTypeId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdInputs(value: js.Array[SourceIdInput]): Self = StObject.set(x, "sourceIdInputs", value.asInstanceOf[js.Any])
    
    inline def setSourceIdInputsVarargs(value: SourceIdInput*): Self = StObject.set(x, "sourceIdInputs", js.Array(value*))
  }
}
