package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactVersionQueryResult extends StObject {
  
  var artifactVersions: js.Array[ArtifactVersion]
}
object ArtifactVersionQueryResult {
  
  inline def apply(artifactVersions: js.Array[ArtifactVersion]): ArtifactVersionQueryResult = {
    val __obj = js.Dynamic.literal(artifactVersions = artifactVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactVersionQueryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactVersionQueryResult] (val x: Self) extends AnyVal {
    
    inline def setArtifactVersions(value: js.Array[ArtifactVersion]): Self = StObject.set(x, "artifactVersions", value.asInstanceOf[js.Any])
    
    inline def setArtifactVersionsVarargs(value: ArtifactVersion*): Self = StObject.set(x, "artifactVersions", js.Array(value*))
  }
}
