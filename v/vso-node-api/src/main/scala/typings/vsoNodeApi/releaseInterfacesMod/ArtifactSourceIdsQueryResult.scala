package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactSourceIdsQueryResult extends StObject {
  
  var artifactSourceIds: js.Array[ArtifactSourceId]
}
object ArtifactSourceIdsQueryResult {
  
  inline def apply(artifactSourceIds: js.Array[ArtifactSourceId]): ArtifactSourceIdsQueryResult = {
    val __obj = js.Dynamic.literal(artifactSourceIds = artifactSourceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceIdsQueryResult]
  }
  
  extension [Self <: ArtifactSourceIdsQueryResult](x: Self) {
    
    inline def setArtifactSourceIds(value: js.Array[ArtifactSourceId]): Self = StObject.set(x, "artifactSourceIds", value.asInstanceOf[js.Any])
    
    inline def setArtifactSourceIdsVarargs(value: ArtifactSourceId*): Self = StObject.set(x, "artifactSourceIds", js.Array(value :_*))
  }
}
