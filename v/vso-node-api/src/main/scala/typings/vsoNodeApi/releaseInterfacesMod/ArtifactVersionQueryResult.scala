package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactVersionQueryResult extends StObject {
  
  var artifactVersions: js.Array[ArtifactVersion]
}
object ArtifactVersionQueryResult {
  
  @scala.inline
  def apply(artifactVersions: js.Array[ArtifactVersion]): ArtifactVersionQueryResult = {
    val __obj = js.Dynamic.literal(artifactVersions = artifactVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactVersionQueryResult]
  }
  
  @scala.inline
  implicit class ArtifactVersionQueryResultMutableBuilder[Self <: ArtifactVersionQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactVersions(value: js.Array[ArtifactVersion]): Self = StObject.set(x, "artifactVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactVersionsVarargs(value: ArtifactVersion*): Self = StObject.set(x, "artifactVersions", js.Array(value :_*))
  }
}
