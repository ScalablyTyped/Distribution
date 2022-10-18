package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JenkinsArtifactDownloadInput
  extends StObject
     with ArtifactDownloadInputBase {
  
  var artifactItems: js.Array[String]
}
object JenkinsArtifactDownloadInput {
  
  inline def apply(alias: String, artifactDownloadMode: String, artifactItems: js.Array[String], artifactType: String): JenkinsArtifactDownloadInput = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], artifactDownloadMode = artifactDownloadMode.asInstanceOf[js.Any], artifactItems = artifactItems.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JenkinsArtifactDownloadInput]
  }
  
  extension [Self <: JenkinsArtifactDownloadInput](x: Self) {
    
    inline def setArtifactItems(value: js.Array[String]): Self = StObject.set(x, "artifactItems", value.asInstanceOf[js.Any])
    
    inline def setArtifactItemsVarargs(value: String*): Self = StObject.set(x, "artifactItems", js.Array(value*))
  }
}
