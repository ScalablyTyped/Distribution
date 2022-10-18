package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildArtifactDownloadInput
  extends StObject
     with ArtifactDownloadInputBase {
  
  var artifactItems: js.Array[String]
}
object BuildArtifactDownloadInput {
  
  inline def apply(alias: String, artifactDownloadMode: String, artifactItems: js.Array[String], artifactType: String): BuildArtifactDownloadInput = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], artifactDownloadMode = artifactDownloadMode.asInstanceOf[js.Any], artifactItems = artifactItems.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArtifactDownloadInput]
  }
  
  extension [Self <: BuildArtifactDownloadInput](x: Self) {
    
    inline def setArtifactItems(value: js.Array[String]): Self = StObject.set(x, "artifactItems", value.asInstanceOf[js.Any])
    
    inline def setArtifactItemsVarargs(value: String*): Self = StObject.set(x, "artifactItems", js.Array(value*))
  }
}
